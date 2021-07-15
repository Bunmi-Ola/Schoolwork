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

namespace Lab3ii
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();


        }

        private void calculatebutton_Click(object sender, RoutedEventArgs e)
        {

            //Declarations
            decimal LoanPrincipal, MonthlyPayments, AnnualInterestRate;
            decimal MonthlyRate, CurrentBalance = 0, InterestAmount;

            int NumMonth = 0;
            int Month = 0;
            //get Inputs

            LoanPrincipal = Convert.ToDecimal(loanPrincipal.Text);
            MonthlyPayments = Convert.ToDecimal(monthlypay.Text);
            AnnualInterestRate = Convert.ToDecimal(annualrate.Text);
            Month = Convert.ToInt32(NumMonths.Text);

            //Set up initial values
            //Monthly interest Rate

            MonthlyRate = AnnualInterestRate / 100 / 12;
            CurrentBalance = LoanPrincipal;

            outputlistBox.Items.Clear();
            outputlistBox.Items.Add (String.Format("{0,-6}{1,-15}{2,-15}{3,-15}", "Month", "Payment","Interest", "Balance"));
            outputlistBox.Items.Add ("=============================\n");

            //Loop

            do
            {
                Month += 1; //count month
                InterestAmount = CurrentBalance * MonthlyRate;//calculate interest
                CurrentBalance += InterestAmount - MonthlyPayments;
                outputlistBox.Items.Add($"{Month,-6:D} {MonthlyPayments,-15:N2} {InterestAmount,-15:N2} {CurrentBalance,-20:N2}\n");

            }
            while (CurrentBalance > 0);

        }

    }
}
