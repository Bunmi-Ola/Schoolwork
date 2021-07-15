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

namespace WpfApplication1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
       int CurrentRecord; 
        bool isNewRecord;
        int accountNumber;
        double Balance;

        CustomerAccount[] customerArray = new CustomerAccount[3];
        public MainWindow()
        {
            InitializeComponent();
        
            customerArray[0] = new CustomerAccount("Robin", "Jo", 1001, 5000);
            customerArray[1] = new CustomerAccount("Kelly", "Jaimie", 1002, 100);
            customerArray[2] = new CustomerAccount("Pat", "Green", 1003, 70);
            CurrentRecord = 0;
           
            isNewRecord = false;
            //FirstNametextBox.Text = customerArray[0].FirstName;
            //LastNametextBox.Text = customerArray[0].LastName;
            //BalancetextBox.Text =customerArray[0].balance.ToString();
            //BalancetextBox.Text = customerArray[0].AccountNumber.ToString();
            displayRecord(CurrentRecord);
        }
        public void displayRecord(int RecNum)
        {
            FirstNametextBox.Text = customerArray[RecNum].FirstName;
            LastNametextBox.Text = customerArray[RecNum].LastName;
            BalancetextBox.Text = customerArray[RecNum].balance.ToString();
            AccountNumbertextBox.Text = customerArray[RecNum].AccountNumber.ToString();
        }

        private void previousbutton_Click(object sender, RoutedEventArgs e)
        {           
            SaveRecord();// save record before paging

            if (CurrentRecord >= 1) CurrentRecord--; // move to prev record, if possible

            //now display it
            displayRecord(CurrentRecord);
        }

        private void nextbutton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();
           
            if (CurrentRecord < customerArray.Length - 1) CurrentRecord++; // move to next record, if possible

            //now display it
            displayRecord(CurrentRecord);
        }

        private void addbutton_Click(object sender, RoutedEventArgs e)
        {
            SaveRecord();
           
            FirstNametextBox.Clear();
            LastNametextBox.Clear();
            BalancetextBox.Clear();
            AccountNumbertextBox.Clear();
            isNewRecord = true; 
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
            if (Convert.ToDouble(BalancetextBox.Text) < 0)
            {               
                MessageBox.Show("Balance can not have a negative value");
                return; //no record saved
            }           

            if (isNewRecord)
            {
                // save new record
                // expand the array by one element
                Array.Resize(ref customerArray, customerArray.Length + 1);
                CurrentRecord = customerArray.Length -1;
                customerArray[CurrentRecord] = new CustomerAccount(FirstNametextBox.Text, LastNametextBox.Text, Convert.ToInt32(BalancetextBox.Text), Convert.ToDouble(BalancetextBox.Text));
                // reset flag
                isNewRecord = false;
                // Display the new Current Record
                displayRecord(CurrentRecord);
            }
            else
            {
                // Save existing record
                Double.TryParse(BalancetextBox.Text, out Balance);
                int.TryParse(AccountNumbertextBox.Text, out accountNumber);
                customerArray[CurrentRecord].FirstName = FirstNametextBox.Text;
                customerArray[CurrentRecord].LastName = LastNametextBox.Text;
                customerArray[CurrentRecord].AccountNumber = accountNumber;
                customerArray[CurrentRecord].balance = Balance;
            }

          
        }        

    }
}
