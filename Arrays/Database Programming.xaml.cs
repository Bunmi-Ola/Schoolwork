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

namespace WpfApplication3
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
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer

                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\WpfApplication3\WpfApplication3\CustomerAccount.mdf; Integrated Security = True";
                connection.Open();

                // Create a SQL command object.
                //CustomerAccount is the name of table in the database
                string sql = "Select * From CustomerAccount";

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
                  @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\WpfApplication3\WpfApplication3\CustomerAccount.mdf; Integrated Security = True";
                connection.Open();

                // Create a SQL command object.
                string sql = $"DELETE From Customers WHERE AccountNumber = {CurrentCustomer.AccountNumber}";
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

            if (Convert.ToInt32(AccountNumbertextBox.Text) < 0)
            {
                MessageBox.Show("Account number can not have a negative value or a string");
                return; //no record saved
            }
            if (Convert.ToDouble(BalancetextBox.Text) < 0)
            {
                MessageBox.Show("Balance can not have a negative value or a string");
                return; //no record saved
            }

            if (!isNewRecord)
            {
                // update the list and the listbox

                // Create and open a connection.
                using (SqlConnection connection = new SqlConnection())
                {
                    // get this connection string from VS in the connection properties under Server Explorer

                    connection.ConnectionString =
                        @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\WpfApplication3\WpfApplication3\CustomerAccount.mdf; Integrated Security = True";
                    connection.Open();

                    // Create a SQL command object.
                    //CustomerAccount is the name of table in the database
                    string sql = "Add * From CustomerAccount";

                    SqlCommand myCommand = new SqlCommand(sql, connection);

                    CustomerAccounts NewcustomerAccounts = new CustomerAccounts(Convert.ToInt32(AccountNumbertextBox.Text), FirstNametextBox.Text, LastNametextBox.Text, EmailtextBox.Text, PhonetextBox.Text, Convert.ToDateTime(BalanceDatetextBox.Text), Convert.ToDecimal(BalancetextBox.Text));

                    int IndexToEdit = CurrentSelectedIndex;

                    CustomerList[CurrentSelectedIndex] = NewcustomerAccounts;
                    OutputlistBox.Items[CurrentSelectedIndex] = NewcustomerAccounts;

                    //reselect existing item
                    OutputlistBox.SelectedIndex = IndexToEdit;
                }
            }
            else
            {
                CustomerAccounts NewcustomerAccounts = new CustomerAccounts(Convert.ToInt32(AccountNumbertextBox.Text), FirstNametextBox.Text, LastNametextBox.Text, EmailtextBox.Text, PhonetextBox.Text, Convert.ToDateTime(BalanceDatetextBox.Text), Convert.ToDecimal(BalancetextBox.Text));
                CustomerList.Add(NewcustomerAccounts);
                OutputlistBox.Items.Add(NewcustomerAccounts);
                isNewRecord = false;
                DisplayCustomer();
            }

        }
        private void NextButton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();// save record before paging

            if (CurrentSelectedIndex < OutputlistBox.Items.Count - 1)
            {
                CurrentSelectedIndex += 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                DisplayCustomer();
            }
        }

        private void PreviousButton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();// save record before paging

            if (CurrentSelectedIndex >= 1)
            {

                CurrentSelectedIndex -= 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                DisplayCustomer();
            }
       
        }
    }

}

