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

namespace Lab3iii
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

        private void outputbutton_Click(object sender, RoutedEventArgs e)
        {

            //Declarations
            decimal LoanPrincipal, MonthlyPayments, AnnualInterestRate, extraPay;
            decimal MonthlyRate, CurrentBalance = 0, InterestAmount, Extrapayment = 0;
            string Output = "";

            int NthMonth;
            int Month;

            //get Inputs

            LoanPrincipal = Convert.ToDecimal(loanPrincipal.Text);
            MonthlyPayments = Convert.ToDecimal(monthlypay.Text);
            AnnualInterestRate = Convert.ToDecimal(annualrate.Text);
            Month = Convert.ToInt32(NumMonths.Text);
            NthMonth = Convert.ToInt32(extraPaymentFrequency.Text);
            extraPay = Convert.ToDecimal(extraPaymentAmount.Text);

            //Set up initial values
            //Monthly interest Rate

            MonthlyRate = AnnualInterestRate / 100 / 12;
            CurrentBalance = LoanPrincipal;

            Output += (String.Format("{0,-6}{1,-15}{2,-15}{3,-15}{4,-15}", "Month", "Payment", "Extra", "Interest", "Balance"));
            Output += ("======================================\n");

            //Loop

            for (int numMonth = 1; numMonth <= Month; numMonth++)

            {
                //numMonth += 1; //count month (used only in do and while loop)
                InterestAmount = CurrentBalance * MonthlyRate;//calculate interest

                if (numMonth % NthMonth == 0)
                {
                    Extrapayment = extraPay;
                    CurrentBalance += (InterestAmount - MonthlyPayments - Extrapayment);
                    Output += ($"{numMonth,-10} {MonthlyPayments,-15:N2} {Extrapayment,-15:N2}{InterestAmount,-15:N2} {CurrentBalance,-20:N2}\n");
                }
                else
                {
                    Extrapayment = 0;
                    CurrentBalance += (InterestAmount - MonthlyPayments - Extrapayment);
                    Output += ($"{numMonth,-10} {MonthlyPayments,-35:N2} {InterestAmount,-15:N2} {CurrentBalance,-20:N2}\n");
                }

            }

            outputtextBox.Text = Output;
        }

    }
}

