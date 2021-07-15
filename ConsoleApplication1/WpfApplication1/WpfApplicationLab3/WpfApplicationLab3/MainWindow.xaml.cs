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

namespace WpfApplicationLab3
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            //set up intial form values
            SavingsGoal.Text = "3000";
           MonthlySave.Text = "225";
           AnnualRate.Text = "5";

        }

        private void button_Click(object sender, RoutedEventArgs e)
        {
            //Declarations
            decimal savingsGoal, SavedEachMonth, AnnualInterestRate;
            decimal MonthlyRate, CurrentBalance = 0, InterestAmount;

            int NumMonths=0;

            //get Inputs

            savingsGoal = Convert.ToDecimal(SavingsGoal.Text);
            SavedEachMonth = Convert.ToDecimal(MonthlySave.Text);
            AnnualInterestRate = Convert.ToDecimal(AnnualRate.Text);

            //Set up initial values
            //Monthly interest Rate

            MonthlyRate =AnnualInterestRate/100 / 12;

            //output a header row

            //OutputtextBox.Text += "Month Saved Interest Balance\n"; OR
            OutputtextBox.Text += String.Format("{0,-5} {1,-10} {2,-10} {3,-10}", "Month", "Saved", "Interest", "Balance");
            OutputtextBox.Text += "======================================\n";


            //Loop

            while (CurrentBalance < savingsGoal) //run as so on the current balance is less than saving Goal
            {
                NumMonths += 1;//count months
                InterestAmount = CurrentBalance * MonthlyRate;//calculate interest
                CurrentBalance += SavedEachMonth + InterestAmount;

                // OutputtextBox.Text = OutputtextBox.Text + $"{NumMonths}{ SavedEachMonth} { InterestAmount}  { CurrentBalance}";
                //OutputtextBox.Text +=  $"{NumMonths:N2 }{ SavedEachMonth:N2} { InterestAmount:N2}  { CurrentBalance:N2}\n";
                OutputtextBox.Text += $"{NumMonths,-5:D} {SavedEachMonth,-10:N2} {InterestAmount,-10:N2} { CurrentBalance,-10:N2}\n";

            }

          

        }
    }
}
