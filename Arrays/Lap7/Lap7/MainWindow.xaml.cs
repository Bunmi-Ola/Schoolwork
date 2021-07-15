using System;
using System.Collections.Generic;
using System.Linq;
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

namespace Lap7
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        List<customerAccounts> CustomerList = new List<customerAccounts>();
        int CurrentSelectedIndex;
        customerAccounts CurrentSelectedItem;
        bool isNewRecord;
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Loadbutton_Click(object sender, RoutedEventArgs e)
        {
            // Clear the ListBox and the List
            OutputlistBox.Items.Clear();
            CustomerList.Clear();

            // Create some Contact records and display in the ListBox
            AddCustomerItem("Robin", "Jo", 1001, 5000);
            AddCustomerItem("Kelly", "Jaimie", 1002, 100);
            AddCustomerItem("Pat", "Green", 1003, 70);
        }

        void AddCustomerItem(string firstname, string lastname, int Accountnumber, double Balance)
        {
            customerAccounts customerAccountsItem = new customerAccounts(firstname, lastname, Accountnumber, Balance);

            // Note: a refernce to the same objects is added to both Lists
            CustomerList.Add(customerAccountsItem);
            OutputlistBox.Items.Add(customerAccountsItem);

        }

        private void OutputlistBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            // get the index of the selected item
            CurrentSelectedIndex = OutputlistBox.SelectedIndex;

            // Cast the selected OBJECT from listbox into a Contact
            CurrentSelectedItem = (customerAccounts)OutputlistBox.SelectedItem;

            //if (ContactListBox.SelectedItem == null) // OK
            if (OutputlistBox.SelectedIndex == -1)
            {
                // blank out the display
                FirstNametextBox.Clear();
                LastNametextBox.Clear();
                AccountNumbertextBox.Clear();
                BalancetextBox.Clear();

            }
            else
            {
                FirstNametextBox.Text = CurrentSelectedItem.FirstName;
                LastNametextBox.Text = CurrentSelectedItem.LastName;
                BalancetextBox.Text = CurrentSelectedItem.balance.ToString();
                AccountNumbertextBox.Text = CurrentSelectedItem.AccountNumber.ToString();
            }
        }

        private void DeleteButton_Click(object sender, RoutedEventArgs e)
        {
            if (OutputlistBox.SelectedIndex == -1)
            {
                // no record selected
                MessageBox.Show("No Record Selected to Remove");
                return;
            }

            int SelectedIndex = CurrentSelectedIndex;
            CustomerList.Remove(CurrentSelectedItem);
            OutputlistBox.Items.Remove(CurrentSelectedItem);

            if (SelectedIndex <= CustomerList.Count - 1) // reselect
            {
                OutputlistBox.SelectedIndex = SelectedIndex;
            }
            else // select last
            {
                OutputlistBox.SelectedIndex = CustomerList.Count - 1;
            }
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

                customerAccounts NewcustomerAccounts = new customerAccounts(FirstNametextBox.Text, LastNametextBox.Text, Convert.ToInt32(AccountNumbertextBox.Text), Convert.ToDouble(BalancetextBox.Text));

                int IndexToEdit = CurrentSelectedIndex;

                CustomerList[CurrentSelectedIndex] = NewcustomerAccounts;
                OutputlistBox.Items[CurrentSelectedIndex] = NewcustomerAccounts;

                //reselect existing item
                OutputlistBox.SelectedIndex = IndexToEdit;

            }
            else
            {
                
                customerAccounts NewcustomerAccounts = new customerAccounts(FirstNametextBox.Text, LastNametextBox.Text, Convert.ToInt32(AccountNumbertextBox.Text), Convert.ToDouble(BalancetextBox.Text));
                CustomerList.Add(NewcustomerAccounts);
                OutputlistBox.Items.Add(NewcustomerAccounts);
                isNewRecord = false;
                displayRecord();
            }

        }
        public void displayRecord()
        {
                FirstNametextBox.Text = CurrentSelectedItem.FirstName;
                LastNametextBox.Text = CurrentSelectedItem.LastName;
                BalancetextBox.Text = CurrentSelectedItem.balance.ToString();
                AccountNumbertextBox.Text = CurrentSelectedItem.AccountNumber.ToString();           
        }

        private void previusbutton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();// save record before paging

            if (CurrentSelectedIndex >= 1)
            {

                CurrentSelectedIndex -= 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                displayRecord();
            }
        }

        private void nextbutton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();// save record before paging

            if (CurrentSelectedIndex < OutputlistBox.Items.Count - 1)
            {
                CurrentSelectedIndex += 1;
                OutputlistBox.SelectedIndex = CurrentSelectedIndex;
                displayRecord();                
            }
        }

        private void AddNewButton_Click(object sender, RoutedEventArgs e)
        {
            // blank out form
            isNewRecord = true;
            FirstNametextBox.Clear();
            LastNametextBox.Clear();
            BalancetextBox.Clear();
            AccountNumbertextBox.Clear();
        }
    }
}