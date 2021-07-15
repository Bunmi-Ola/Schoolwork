using System;
using System.Collections.Generic;
using System.Linq;
using System.Data.SqlClient;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Database
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private List<CustomerAccounts> CustomerList = new List<CustomerAccounts>();
        private CustomerAccounts CurrentCustomer;
        private int CurrentSelectedIndex;
        bool isNewRecord;
        public MainWindow()
        {
            InitializeComponent();
        }


        private void Loadbutton_Click(object sender, RoutedEventArgs e)
        {
            LoadCustomerAccount();
        }

        void LoadCustomerAccount()
        {
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer

                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB;AttachDbFilename=X:\Arrays\Database\Database\CustomerAccount.mdf;Integrated Security=True";
                connection.Open();

                // Create a SQL command object.
                //CustomerAccount is the name of table in the database
                string sql = "Select * From CustomerAccounts";

                SqlCommand myCommand = new SqlCommand(sql, connection);
                // Obtain a data reader a la ExecuteReader().
                // SqlCommand.ExecuteReader returns a Datareader loaded with records
                // one recorde per row, one row per "read" operation
                using (SqlDataReader Reader = myCommand.ExecuteReader())
                {
                    // Loop over the results - one row at a time
                    // when no rows, .Read returns false

                    CustomerList.Clear(); // empty out all displayed data
                    OutputlistBox.Items.Clear();

                    while (Reader.Read())
                    {
                        // load our list and listbox with this this record / row
                        // create a new Customer Object from the record (row)
                        // reference col values from the row by col name or by col index
                        // myDataReader["ColName"] or myDataReader[0]
                        // alternate way cats and read data Reader.GetDateTime(1)  
                        CustomerAccounts NewCustomer = new CustomerAccounts((int)Reader["AccountNumber"],
                                                             (string)Reader["FirstName"],
                                                             (string)Reader["LastName"],
                                                             (string)Reader["Email"],
                                                             (string)Reader["Phone"],
                                                             (DateTime)Reader["BalanceDate"],
                                                             (Decimal)Reader["Balance"]);

                        // add to list
                        CustomerList.Add(NewCustomer);
                        // add to listbox
                        OutputlistBox.Items.Add(NewCustomer);
                    }
                }
            }
        }
        private void OutputlistBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            // update form with selected record
            CurrentCustomer = (CustomerAccounts)OutputlistBox.SelectedItem;
            CurrentSelectedIndex = OutputlistBox.SelectedIndex;

            // display the current record in the form
            DisplayCustomer();
        }

        private void DisplayCustomer()
        {
            if (CurrentCustomer != null)
            {

                AccountNumbertextBox.Text = CurrentCustomer.AccountNumber.ToString();
                FirstNametextBox.Text = CurrentCustomer.FirstName;
                LastNametextBox.Text = CurrentCustomer.LastName;
                EmailtextBox.Text = CurrentCustomer.Email;
                PhonetextBox.Text = CurrentCustomer.Phone;
                BalanceDatetextBox.Text = CurrentCustomer.BalanceDate.ToString();
                BalancetextBox.Text = CurrentCustomer.Balance.ToString();

            }
            else
            {
                AccountNumbertextBox.Text = "";
                FirstNametextBox.Text = "";
                LastNametextBox.Text = "";
                EmailtextBox.Text = "";
                PhonetextBox.Text = "";
                BalanceDatetextBox.Text = "";
                BalancetextBox.Text = "";
            }

        }

        private void DeleteButton_Click(object sender, RoutedEventArgs e)
        {

            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer
                // replace absolute file path with |DataDirectory| 
                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB;AttachDbFilename=X:\Arrays\Database\Database\CustomerAccount.mdf;Integrated Security=True";
                connection.Open();

                // Create a SQL command object.
                string sql = $"DELETE From CustomerAccounts WHERE AccountNumber = {CurrentCustomer.AccountNumber}";
                //SqlCommand myCommand = new SqlCommand(sql, connection);

                // Obtain a data reader a la ExecuteReader().
                // SqlCommand.ExecuteReader returns a Datareader loaded with records
                // one recorde per row, one row per "read" operation
                using (SqlCommand myCommand = new SqlCommand(sql, connection))
                {
                    try
                    {
                        myCommand.ExecuteNonQuery();
                    }
                    catch (SqlException ex)
                    {
                        Exception error = new Exception("Error no matching record to delete", ex);
                        throw error;
                    }
                }
            }

            int IndexToDelete = CurrentSelectedIndex;

            // remove the current object from the List<Customer>
            CustomerList.Remove(CurrentCustomer); // uses Equals method to find

            // remove the current object from the ListBox
            OutputlistBox.Items.Remove(CurrentCustomer); // uses Equals method to find

            // may want to reselct the next item in the list
            if (IndexToDelete == CustomerList.Count) // last record deleted
            {
                CurrentSelectedIndex = CustomerList.Count - 1; //select last record
            }
            else
            {
                CurrentSelectedIndex = IndexToDelete; // reselect same position in list  
            }

            // now select that item
            OutputlistBox.SelectedIndex = CurrentSelectedIndex;
        }

        private void AddNewButton_Click(object sender, RoutedEventArgs e)
        {
            isNewRecord = true;
            AccountNumbertextBox.Clear();
            FirstNametextBox.Clear();
            LastNametextBox.Clear();
            EmailtextBox.Clear();
            PhonetextBox.Clear();
            BalanceDatetextBox.Clear();
            BalancetextBox.Clear();

        }

        private void savebutton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();
        }
        private void SaveRecord()
        {
            // validate data first, if not valid just return

            if (FirstNametextBox.Text == "")
            {
                // also notify user (error) message
                MessageBox.Show("Must enter a First Name");
                return; //no record saved
            }

            if (LastNametextBox.Text == "")
            {
                MessageBox.Show("Must enter a Last Name");
                return; //no record saved
            }
            if (EmailtextBox.Text == "")
            {
                MessageBox.Show("Must enter a valid email");
                return; //no record saved
            }
            if (PhonetextBox.Text == "")
            {
                MessageBox.Show("Must enter a phone number");
                return; //no record saved
            }
                        
            if (Convert.ToDouble(BalancetextBox.Text) < 0)
            {
                MessageBox.Show("Balance can not have a negative value or a string");
                return; //no record saved
            }

                 string sql;

                 // make a new object from form data
                CustomerAccounts NewCustomer = new CustomerAccounts();

                // get the changed data from the form
              
                //NewCustomer.AccountNumber = Convert.ToInt32(AccountNumbertextBox.Text);
                NewCustomer.FirstName = FirstNametextBox.Text;
                NewCustomer.LastName = LastNametextBox.Text;
                NewCustomer.Email = EmailtextBox.Text;
                NewCustomer.Phone = PhonetextBox.Text;
                NewCustomer.BalanceDate = Convert.ToDateTime(BalanceDatetextBox.Text);
                NewCustomer.Balance = Convert.ToDecimal(BalancetextBox.Text);

                using (SqlConnection connection = new SqlConnection())
                {
                connection.ConnectionString = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=X:\Arrays\Database\Database\CustomerAccount.mdf;Integrated Security=True";
                // open connection
                connection.Open();

                    //find the last used primary key ( the maximum CustomerNumber)
                    sql = $"SELECT MAX(AccountNumber) FROM CustomerAccounts;";

                    int NewAccountNumber;
                    using (SqlCommand SelectCommand = new SqlCommand(sql, connection))
                    {
                        NewAccountNumber = Convert.ToInt32(SelectCommand.ExecuteScalar()) + 1;
                        NewCustomer.AccountNumber = NewAccountNumber; // record the new Primary Key
                    }
                    // NO PROTECTION FROM SQL INJECTION HERE
                    sql = $"INSERT INTO CustomerAccounts " +
                          "(AccountNumber, FirstName, LastName, Email, Phone, BalanceDate, Balance) " +
                            "VALUES " +
                          $"( {NewAccountNumber}, " +
                          $"'{NewCustomer.FirstName}', " +
                          $"'{NewCustomer.LastName}', " +
                          $"'{NewCustomer.Email}', " +
                          $"'{NewCustomer.Phone}', " +
                          $"'{NewCustomer.BalanceDate.ToShortDateString()}', " +
                          $"'{NewCustomer.Balance.ToString()}') ;";

                using (SqlCommand InsertCommand = new SqlCommand(sql, connection))
                    try
                    {
                        InsertCommand.ExecuteNonQuery();
                        MessageBox.Show("Information has been saved.");

                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
            
            connection.Close();

          

                    // update display
                    LoadCustomerAccount();

                    // Find index of new item
                    int NewIndex = OutputlistBox.Items.IndexOf(NewCustomer);

                    //select the new item
                    OutputlistBox.SelectedIndex = NewIndex;
                    OutputlistBox.ScrollIntoView(NewCustomer);
                }

            }
        

        private void UpdateButton_Click(object sender, RoutedEventArgs e)
        {
            // get the changed data from the form (update the CurrentCustomer Object)
            CurrentCustomer.AccountNumber = Convert.ToInt32(AccountNumbertextBox.Text);
            CurrentCustomer.FirstName = FirstNametextBox.Text;
            CurrentCustomer.LastName = LastNametextBox.Text;
            CurrentCustomer.Email = EmailtextBox.Text;
            CurrentCustomer.Phone = PhonetextBox.Text;
            CurrentCustomer.BalanceDate = Convert.ToDateTime(BalanceDatetextBox.Text);
            CurrentCustomer.Balance = Convert.ToDecimal(BalancetextBox.Text);

            using (SqlConnection connection = new SqlConnection())
            {   // @"" supresses escape chars
                connection.ConnectionString = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=X:\Arrays\Database\Database\CustomerAccount.mdf;Integrated Security=True";
                // open connection
                connection.Open();

                string sql = $"UPDATE CustomerAccounts SET " +
                            
                             $"FirstName = '{CurrentCustomer.FirstName}', " +
                             $"lastName = '{CurrentCustomer.LastName}', " +
                             $"Email = '{CurrentCustomer.Email}', " +
                             $"Phone = '{CurrentCustomer.Phone}', " +
                             $"BalanceDate = '{CurrentCustomer.BalanceDate.ToShortDateString()}', " +
                             $"Balance = '{CurrentCustomer.Balance.ToString()}' " +
                             $"WHERE AccountNumber = {CurrentCustomer.AccountNumber};";

                using (SqlCommand UpdateCommand = new SqlCommand(sql, connection))
                {
                    // could protect with Try ... Catch ...
                    UpdateCommand.ExecuteNonQuery();
                }

            }
            //  now update the displayed data and the lists
            // could use ListBox.Items.Remove() etc ...
            // but we'll just reload everything
            LoadCustomerAccount();

        }

        private void NextButton_Click(object sender, RoutedEventArgs e)
        {
         
            if (CurrentSelectedIndex < OutputlistBox.Items.Count-1)
            {
                CurrentSelectedIndex += 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                DisplayCustomer();
            }
            
         }

        private void PreviousButton_Click(object sender, RoutedEventArgs e)
        {
          
            if (CurrentSelectedIndex >= 1)
            {
                CurrentSelectedIndex -= 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                DisplayCustomer();
            }
        }
    }
}
