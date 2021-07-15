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

namespace Comp255FinalProject
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private List<Invoice> CustomerInvoiceList = new List<Invoice>();
        private List<InvoiceItem> ItemList = new List<InvoiceItem>();
        private Invoice CurrentCustomerInvoice;
        private InvoiceItem CurrentCustomerItem;
        private int CurrentSelectedIndex;
       
        public MainWindow()
        {
            InitializeComponent();
        }

        private void IncoicesLoadbutton_Click(object sender, RoutedEventArgs e)
        {
            LoadCustomerInvocie();

        }
       
        void LoadCustomerInvocie()
        {
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer
                connection.ConnectionString =
                  @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                connection.Open();
                // Create a SQL command object.

                string sql = "Select * From Invoices";


                SqlCommand myCommand = new SqlCommand(sql, connection);

                // Obtain a data reader a la ExecuteReader().
                // SqlCommand.ExecuteReader returns a Datareader loaded with records
                // one recorde per row, one row per "read" operation
                using (SqlDataReader Reader = myCommand.ExecuteReader())
                {
                    // Loop over the results - one row at a time
                    // when no rows, .Read returns false

                    CustomerInvoiceList.Clear(); // empty out all displayed data
                    InvoiceslistBox.Items.Clear();
                
                    while (Reader.Read())
                    {
                        // load our list and listbox with this this record / row
                        // create a new Customer Object from the record (row)
                        // reference col values from the row by col name or by col index
                        // myDataReader["ColName"] or myDataReader[0]
                        // alternate way cats and read data Reader.GetDateTime(1)  
                        Invoice NewCustomerinvoice = new Invoice((int)Reader["InvoiceID"],
                                                                 (DateTime)Reader["InvoiceDate"],
                                                                 (bool)Reader["Shipped"],
                                                                 (String)Reader["CustomerName"],
                                                                 (String)Reader["CustomerAddress"],
                                                                 (String)Reader["CustomerEmail"]);

                        // add to list
                        CustomerInvoiceList.Add(NewCustomerinvoice);
                        InvoiceslistBox.Items.Add(NewCustomerinvoice);

                        // Create and open a connection.
                        using (SqlConnection connection1 = new SqlConnection())
                        {
                            // get this connection string from VS in the connection properties under Server Explorer
                            connection1.ConnectionString =
                              @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                            connection1.Open();
                            // Create a SQL command object.

                            string sql1 = "Select [ItemId], [InvoiceId], [ItemName], [ItemDescription], [ItemPrice], [ItemQuantity] From InvoiceItems WHERE InvoiceID = @Invoice";
                            SqlCommand myCommand1 = new SqlCommand(sql1, connection1);
                            if (CurrentCustomerInvoice != null)
                            {
                               
                                myCommand1.Parameters.AddWithValue("Invoice", CurrentCustomerInvoice.InvoiceID);
                            }
                            else
                            {
                                myCommand1.Parameters.AddWithValue("Invoice", 1);
                            }

                            // Obtain a data reader a la ExecuteReader().
                            // SqlCommand.ExecuteReader returns a Datareader loaded with records
                            // one recorde per row, one row per "read" operation
                            using (SqlDataReader Reader1 = myCommand1.ExecuteReader())
                            {
                                // Loop over the results - one row at a time
                                // when no rows, .Read returns false

                                // empty out all displayed data
                                ItemList.Clear();
                                ItemlistBox.Items.Clear();
                                InvoiceItem NewItemList = new InvoiceItem();
                                while (Reader1.Read())
                                {
                                    // load our list and listbox with this this record / row
                                    // create a new Customer Object from the record (row)
                                    // reference col values from the row by col name or by col index
                                    // myDataReader["ColName"] or myDataReader[0]
                                    // alternate way cats and read data Reader.GetDateTime(1)  


                                    NewItemList = new InvoiceItem();
                                    NewItemList.InvoiceID = (int)Reader1["InvoiceID"];                                  
                                 
                                    NewItemList.ItemDescription = (String)Reader1["ItemDescription"];
                                    NewItemList.ItemPrice = (Decimal)Reader1["ItemPrice"];
                                    NewItemList.ItemQuantity = (int)Reader1["ItemQuantity"];
                                    NewItemList.ItemID = (int)Reader1["ItemId"];
                                    NewItemList.ItemName = (String)Reader1["ItemName"];

                                    // add to list

                                    ItemList.Add(NewItemList);
                                    ItemlistBox.Items.Add(NewItemList);

                                }                               

                            }
                        }
                    }
                }

            }
        }

        private void InvoiceslistBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            // update form with selected record
            CurrentCustomerInvoice = (Invoice)InvoiceslistBox.SelectedItem;           
            CurrentSelectedIndex = InvoiceslistBox.SelectedIndex;



            // display the current record in the form
            DisplayCustomerInvoice();
        }
        private void DisplayCustomerInvoice()
        {
            if (CurrentCustomerInvoice != null)
            {

                InvoiceIDtextBox.Text = CurrentCustomerInvoice.InvoiceID.ToString();
                InvoiceDatetextBox.Text = CurrentCustomerInvoice.InvoiceDate.ToString();
                ShippingcheckBox.IsChecked = CurrentCustomerInvoice.Shipped;
                CustomerEmailtextBox.Text = CurrentCustomerInvoice.CustomerEmail;
                CustomerNametextBox.Text = CurrentCustomerInvoice.CustomerName;
                CustomerAddresstextBox.Text = CurrentCustomerInvoice.CustomerAddress;

                DisplayItemsForInvoice();

            }
            else
            {
                InvoiceIDtextBox.Text = "";
                InvoiceDatetextBox.Text = "";
                ShippingcheckBox.IsChecked = false;
                CustomerEmailtextBox.Text = "";
                CustomerNametextBox.Text = "";
                CustomerAddresstextBox.Text = "";
                
            }
        }

        private void ItemlistBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            // update form with selected record
            CurrentCustomerItem = (InvoiceItem)ItemlistBox.SelectedItem;            
            CurrentSelectedIndex = ItemlistBox.SelectedIndex;

            // display the current record in the form
            DisplayItemsList();
        }
        private void DisplayItemsList()
        {

            if (CurrentCustomerItem != null)
            {
                ItemIDtextBox.Text = CurrentCustomerItem.ItemID.ToString();
                ItemNametextBox.Text = CurrentCustomerItem.ItemName.ToString();
                ItemDescriptiontextBox.Text = CurrentCustomerItem.ItemDescription.ToString();
                ItemPricetextBox.Text = CurrentCustomerItem.ItemPrice.ToString();
                ItemQuantitytextBox.Text = CurrentCustomerItem.ItemQuantity.ToString();
                PSTtextBox.Text = CurrentCustomerItem.PST.ToString();
                GSTtextBox.Text = CurrentCustomerItem.GST.ToString();
                SubtotaltextBox.Text = CurrentCustomerItem.Subtotal.ToString();
                TotaltextBox.Text = CurrentCustomerItem.TotalPrice.ToString();
            }
            else
            {

                ItemIDtextBox.Text = "";
                ItemNametextBox.Text = "";
                ItemDescriptiontextBox.Text = "";
                ItemPricetextBox.Text = "";
                ItemQuantitytextBox.Text = "";
                PSTtextBox.Text = "";
                GSTtextBox.Text = "";
                SubtotaltextBox.Text = "";
                TotaltextBox.Text = "";

            }
        }
        private bool IsDataValid()
        {
            // validate data first, if not valid just return

            if (Convert.ToInt32(InvoiceIDtextBox.Text) < 0)
            {
                errorMessageLabel.Content = "ID can not have a negative value or a string";
                return false; //no record saved
            }

           
            if (InvoiceDatetextBox.Text == "")
            {

                errorMessageLabel.Content = "Must enter a valid date";
                return false; //no record saved
            }

            if (CustomerEmailtextBox.Text == "")
            {

                errorMessageLabel.Content = "Must enter an E-mail";
                return false; //no record saved
            }

            if (CustomerNametextBox.Text == "")
            {
                // also notify user (error) message                
                errorMessageLabel.Content = "Must enter a name";
                return false; //no record saved
            }


            if (CustomerAddresstextBox.Text == "")
            {

                errorMessageLabel.Content = "Must enter an address";
                return false; //no record saved
            }
            if (Convert.ToInt32(ItemIDtextBox.Text) < 0)
            {
                errorMessageLabel.Content = "ItemID can not have a negative value or a string";
                return false; //no record saved
            }

            if (ItemNametextBox.Text == "")
            {
                // also notify user (error) message
                errorMessageLabel.Content = "Must enter an Item name";
                return false; //no record saved
            }

            if (ItemDescriptiontextBox.Text == "")
            {

                errorMessageLabel.Content = "Must enter an item description";
                return false; //no record saved
            }
            if (Convert.ToDouble(ItemPricetextBox.Text) < 0)
            {

                errorMessageLabel.Content = "Item Price can not have a negative value or a string";
                return false; //no record saved
            }
            if (Convert.ToInt32(ItemQuantitytextBox.Text) < 0)
            {

                errorMessageLabel.Content = "Item Quantity can not have a negative value or a string";
                return false; //no record saved
            }

            else return true;
        }
        private void IncoicesNewbutton_Click(object sender, RoutedEventArgs e)
        {
            InvoiceIDtextBox.Clear();
            InvoiceDatetextBox.Clear();
            ShippingcheckBox.IsChecked = false;
            CustomerEmailtextBox.Clear();
            CustomerNametextBox.Clear();
            CustomerAddresstextBox.Clear();
            ItemlistBox.Items.Clear();
        }

        private void IncoicesSaveNewbutton_Click(object sender, RoutedEventArgs e)
        {
            if (IsDataValid() == false)
            {
                
                errorMessageLabel.Foreground = Brushes.Red;

                return;
            }


            string sql = null;

                  
            Invoice NewCustomerInvoice = new Invoice();

                // get the changed data from the form
                NewCustomerInvoice.InvoiceDate = Convert.ToDateTime(InvoiceDatetextBox.Text);
                NewCustomerInvoice.Shipped = ShippingcheckBox.IsChecked.Value;
            NewCustomerInvoice.CustomerName = CustomerNametextBox.Text;
                NewCustomerInvoice.CustomerAddress = CustomerAddresstextBox.Text;
                NewCustomerInvoice.CustomerEmail = CustomerEmailtextBox.Text;

                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                    // open connection
                    connection.Open();

                    //find the last used primary key ( the maximum CustomerNumber)
                    sql = $"SELECT MAX(InvoiceID) FROM Invoices;";

                    int NewInvoiceID;
                    using (SqlCommand SelectCommand = new SqlCommand(sql, connection))

                    {
                        NewInvoiceID = Convert.ToInt32(SelectCommand.ExecuteScalar()) + 1;
                        NewCustomerInvoice.InvoiceID = NewInvoiceID; // record the new Primary Key
                    }
                    // NO PROTECTION FROM SQL INJECTION HERE
                    sql = $"INSERT INTO Invoice " +
                          "(InvoiceID, InvoiceDate, Shipped, CustomerName, CustomerAddress, CustomerEmail) " +
                            "VALUES " +
                          $"( {NewInvoiceID}, " +
                          $"'{NewCustomerInvoice.InvoiceDate}', " +
                          $"'{NewCustomerInvoice.Shipped}', " +
                          $"'{NewCustomerInvoice.CustomerName}')" +
                          $"'{NewCustomerInvoice.CustomerAddress}', " +
                          $"'{NewCustomerInvoice.CustomerEmail}', ;";

                    using (SqlCommand InsertCommand = new SqlCommand(sql, connection))
                    {

                    try
                    {
                        InsertCommand.ExecuteNonQuery();
                        MessageBox.Show("Information has been saved.");

                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                }
                connection.Close();

              
                    }

                    // update display
                    LoadCustomerInvocie();

                    // Find index of new item
                    int NewIndex = InvoiceslistBox.Items.IndexOf(NewCustomerInvoice);

                    //select the new item
                    InvoiceslistBox.SelectedIndex = NewIndex;
                    InvoiceslistBox.ScrollIntoView(NewCustomerInvoice);
                }

            
        
        private void IncoicesDeletebutton_Click(object sender, RoutedEventArgs e)
        {
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer
                // replace absolute file path with |DataDirectory| 
                connection.ConnectionString =
                            @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                connection.Open();

                // Create a SQL command object.
                string sql = $"DELETE From Invoices WHERE InvoiceID = {CurrentCustomerInvoice.InvoiceID}";
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
            CustomerInvoiceList.Remove(CurrentCustomerInvoice); // uses Equals method to find

            // remove the current object from the ListBox
            InvoiceslistBox.Items.Remove(CurrentCustomerInvoice); // uses Equals method to find

            // may want to reselct the next item in the list
            if (IndexToDelete == CustomerInvoiceList.Count) // last record deleted
            {
                CurrentSelectedIndex = CustomerInvoiceList.Count - 1; //select last record
            }
            else
            {
                CurrentSelectedIndex = IndexToDelete; // reselect same position in list  
            }

            // now select that item
            InvoiceslistBox.SelectedIndex = CurrentSelectedIndex;
        }

        private void IncoicesUpdatebutton_Click(object sender, RoutedEventArgs e)
        {
            // get the changed data from the form (update the CurrentCustomer Object)
            CurrentCustomerInvoice.InvoiceID = Convert.ToInt32(InvoiceIDtextBox.Text);
            CurrentCustomerInvoice.InvoiceDate = Convert.ToDateTime(InvoiceDatetextBox.Text);
            CurrentCustomerInvoice.Shipped = ShippingcheckBox.IsChecked.Value;
            CurrentCustomerInvoice.CustomerName = CustomerNametextBox.Text;
            CurrentCustomerInvoice.CustomerAddress = CustomerAddresstextBox.Text;
            CurrentCustomerInvoice.CustomerEmail = CustomerEmailtextBox.Text;

            using (SqlConnection connection = new SqlConnection())
            {   // @"" supresses escape chars
                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                // open connection
                connection.Open();

                string sql = $"UPDATE Invoice SET " +

                             $"InvoiceDate = '{CurrentCustomerInvoice.InvoiceDate.ToShortDateString()}', " +
                             $"Shipped = '{CurrentCustomerInvoice.Shipped}', " +
                             $"CustomerName = '{CurrentCustomerInvoice.CustomerName}', " +
                             $"CustomerAddress = '{CurrentCustomerInvoice.CustomerAddress}', " +
                             $"CustomerEmail = '{CurrentCustomerInvoice.CustomerEmail}', " +
                             $"WHERE InvoiceID = {CurrentCustomerInvoice.InvoiceID.ToString()};";

                using (SqlCommand UpdateCommand = new SqlCommand(sql, connection))
                {
                    // could protect with Try ... Catch ...
                    UpdateCommand.ExecuteNonQuery();
                }

            }
            //  now update the displayed data and the lists
            LoadCustomerInvocie();

        }

        private void IncoiceItemsNewbutton_Click(object sender, RoutedEventArgs e)
        {
           
            ItemIDtextBox.Clear();
            ItemNametextBox.Clear();
            ItemDescriptiontextBox.Clear();
            ItemPricetextBox.Clear();
            ItemQuantitytextBox.Clear();
            PSTtextBox.Clear();
            GSTtextBox.Clear();
            SubtotaltextBox.Clear();
            TotaltextBox.Clear();
        }

        private void IncoiceItemsDeletebutton_Click(object sender, RoutedEventArgs e)
        {
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                // get this connection string from VS in the connection properties under Server Explorer
                // replace absolute file path with |DataDirectory| 
                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                connection.Open();

                // Create a SQL command object.
                string sql = $"DELETE From InvoiceItems WHERE ItemID = {CurrentCustomerItem.ItemID}";
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
            ItemList.Remove(CurrentCustomerItem);

            // remove the current object from the ListBox
            ItemlistBox.Items.Remove(CurrentCustomerItem);

            // may want to reselct the next item in the list
            if (IndexToDelete == ItemList.Count) // last record deleted
            {
                CurrentSelectedIndex = ItemList.Count - 1; //select last record
            }
            else
            {
                CurrentSelectedIndex = IndexToDelete; // reselect same position in list  
            }

            // now select that item
            ItemlistBox.SelectedIndex = CurrentSelectedIndex;
        }

        private void IncoicesUpdatebutton_Click_1(object sender, RoutedEventArgs e) { 
            // get the changed data from the form (update the CurrentCustomer Object)
           CurrentCustomerItem.ItemID = Convert.ToInt32(ItemIDtextBox.Text);
            CurrentCustomerItem.ItemName = ItemNametextBox.Text;
            CurrentCustomerItem.ItemDescription = ItemDescriptiontextBox.Text;
            CurrentCustomerItem.ItemPrice = Convert.ToDecimal(ItemPricetextBox.Text);
            CurrentCustomerItem.ItemQuantity = Convert.ToInt32(ItemQuantitytextBox.Text);
            PSTtextBox.Text = Convert.ToString(CurrentCustomerItem.PST);
            GSTtextBox.Text = Convert.ToString(CurrentCustomerItem.GST);
            SubtotaltextBox.Text = Convert.ToString(CurrentCustomerItem.Subtotal);
            TotaltextBox.Text = Convert.ToString(CurrentCustomerItem.TotalPrice);
 
            using (SqlConnection connection = new SqlConnection())
            {   // @"" supresses escape chars
                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                // open connection
                connection.Open();

                string sql = $"UPDATE InvoiceItems SET " +

                             $"InvoiceID = '{CurrentCustomerInvoice.InvoiceID}', " +
                             $"ItemName = '{CurrentCustomerItem.ItemName}', " +
                             $"ItemDescription = '{CurrentCustomerItem.ItemDescription}', " +
                             $"ItemPrice = '{CurrentCustomerItem.ItemPrice}', " +
                             $"ItemQuantity = '{CurrentCustomerItem.ItemQuantity.ToString()}', " +
                             $"WHERE AccountNumber = {CurrentCustomerItem.ItemID.ToString()};";

            }
        }

        private void IncoiceItemsSaveNewbutton_Click(object sender, RoutedEventArgs e)
        {

            // validate data first, if not valid just return
            if (IsDataValid() == false)
            {
                errorMessageLabel.Content = "Please Input complete information";
                errorMessageLabel.Foreground = Brushes.Red;

                return;
            }

            string sql;

            // make a new object from form data
            InvoiceItem NewItem = new InvoiceItem();

            // get the changed data from the form
            NewItem.ItemID = Convert.ToInt32(ItemIDtextBox.Text);
            NewItem.InvoiceID = Convert.ToInt32(InvoiceIDtextBox.Text);
            NewItem.ItemName = ItemNametextBox.Text;
            NewItem.ItemDescription = ItemDescriptiontextBox.Text;
            NewItem.ItemPrice = Convert.ToDecimal(ItemPricetextBox.Text);
            NewItem.ItemQuantity = Convert.ToInt32(ItemQuantitytextBox.Text);
            PSTtextBox.Text = Convert.ToString(CurrentCustomerItem.PST);
            GSTtextBox.Text = Convert.ToString(CurrentCustomerItem.GST);
            SubtotaltextBox.Text = Convert.ToString(CurrentCustomerItem.Subtotal);
            TotaltextBox.Text = Convert.ToString(CurrentCustomerItem.TotalPrice);


            using (SqlConnection connection = new SqlConnection())
            {
                connection.ConnectionString =
                    @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
                // open connection
                connection.Open();

                //find the last used primary key ( the maximum CustomerNumber)
                sql = $"SELECT MAX(ItemID) FROM InvoiceItems;";

                // NO PROTECTION FROM SQL INJECTION HERE
                sql = $"INSERT INTO InvoiceItems " +
                      "(ItemID, InvoiceID, ItemName, ItemDescription, ItemPrice, ItemQuantity) " +
                        "VALUES " +
                      $"( {NewItem.ItemID.ToString()}, " +
                      $"'{NewItem.InvoiceID.ToString()}', " +
                      $"'{NewItem.ItemName}', " +
                      $"'{NewItem.ItemDescription}', " +
                      $"'{NewItem.ItemPrice.ToString()}', " +
                      $"'{ NewItem.ItemQuantity.ToString()}') ;";

                using (SqlCommand InsertCommand = new SqlCommand(sql, connection))
                {
                    InsertCommand.ExecuteNonQuery();
                }

                // update display
                LoadCustomerInvocie();

                // Find index of new item
                int NewIndex = ItemlistBox.Items.IndexOf(NewItem);

                //select the new item
                ItemlistBox.SelectedIndex = NewIndex;
                ItemlistBox.ScrollIntoView(NewItem);
            }

        }

        public void DisplayItemsForInvoice()
        {

            SqlConnection connection1 = new SqlConnection();
            // get this connection string from VS in the connection properties under Server Explorer
            connection1.ConnectionString =
             @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = X:\Arrays\Comp255FinalProject\Comp255FinalProject\ShoppingCart.mdf; Integrated Security = True";
            connection1.Open();
            // Create a SQL command object.

            string sql1 = "Select [ItemId], [InvoiceId], [ItemName], [ItemDescription], [ItemPrice], [ItemQuantity] From InvoiceItems WHERE InvoiceID = @Invoice";
            SqlCommand myCommand1 = new SqlCommand(sql1, connection1);
            if (CurrentCustomerInvoice != null)
            {

                myCommand1.Parameters.AddWithValue("Invoice", CurrentCustomerInvoice.InvoiceID);
            }
            else
            {
                myCommand1.Parameters.AddWithValue("Invoice", -1);
            }

            // Obtain a data reader a la ExecuteReader().
            // SqlCommand.ExecuteReader returns a Datareader loaded with records
            // one recorde per row, one row per "read" operation
            using (SqlDataReader Reader1 = myCommand1.ExecuteReader())
            {
                // Loop over the results - one row at a time
                // when no rows, .Read returns false

                // empty out all displayed data
                ItemList.Clear();
                ItemlistBox.Items.Clear();
                InvoiceItem NewItemList = new InvoiceItem();
                while (Reader1.Read())
                {
                    // load our list and listbox with this this record / row
                    // create a new Customer Object from the record (row)
                    // reference col values from the row by col name or by col index
                    // myDataReader["ColName"] or myDataReader[0]
                    // alternate way cats and read data Reader.GetDateTime(1)  


                    NewItemList = new InvoiceItem();
                    NewItemList.InvoiceID = (int)Reader1["InvoiceID"];

                    NewItemList.ItemDescription = (String)Reader1["ItemDescription"];
                    NewItemList.ItemPrice = (Decimal)Reader1["ItemPrice"];
                    NewItemList.ItemQuantity = (int)Reader1["ItemQuantity"];
                    NewItemList.ItemID = (int)Reader1["ItemId"];
                    NewItemList.ItemName = (String)Reader1["ItemName"];

                    // add to list

                    ItemList.Add(NewItemList);
                    ItemlistBox.Items.Add(NewItemList);
                    
                }

            }
        }

        
    }
}
