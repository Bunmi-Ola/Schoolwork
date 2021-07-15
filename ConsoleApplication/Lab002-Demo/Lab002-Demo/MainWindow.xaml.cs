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

namespace Lab002_Demo
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
        private void Gobutton_Click(object sender, RoutedEventArgs e)

        {
            double Number1;
            double Number2;
            double Number3;
            double Number4;
            double Subtotal;
            double Shipping = 0;
            double GSTItem1 = 0;
            double PSTItem1 = 0;
            double GSTItem2 = 0;
            double PSTItem2 = 0;
            double GSTItem3 = 0;
            double PSTItem3 = 0;
            double GSTItem4 = 0;
            double PSTItem4 = 0;
            double sumPST;
            double sumGST;
            double Total;
            string CommissionRate;
            double TotalSalesCommission;

            SolidColorBrush Commission = new SolidColorBrush();

            if (Double.TryParse(txtitem1.Text, out Number1) == false || Number1 < 0)
            {
                ErrorBox.Text = "Enter a valid number.";
                ErrorBox.Foreground = Brushes.Red;
                txtitem1.Focus();
                return;
            }

            if (Double.TryParse(txtitem2.Text, out Number2) == false || Number2 < 0)
            {
                ErrorBox.Text = "Enter a valid number.";
                ErrorBox.Foreground = Brushes.Red;
                txtitem1.Focus();
                return;
            }

            if (Double.TryParse(txtitem3.Text, out Number3) == false || Number3 < 0)
            {
                ErrorBox.Text = "Enter a valid number.";
                ErrorBox.Foreground = Brushes.Red;
                txtitem1.Focus();
                return;
            }

            if (Double.TryParse(txtitem4.Text, out Number4) == false || Number4 < 0)
            {
                ErrorBox.Text = "Enter a valid number.";
                ErrorBox.Foreground = Brushes.Red;
                txtitem1.Focus();
                return;
            }

            txtitem1.Text = String.Format("{0:N2}", Number1);
            txtitem2.Text = String.Format("{0:N2}", Number2);
            txtitem3.Text = String.Format("{0:N2}", Number3);
            txtitem4.Text = String.Format("{0:N2}", Number4);

            Subtotal = Number1 + Number2 + Number3 + Number4;
          
            
            if (checkBoxPST1.IsChecked == true) PSTItem1 = Number1 * 0.06; //apply 6% to item1

            if (checkBoxPST2.IsChecked == true) PSTItem2 = Number2 * 0.06;//apply 6% to item2
          
            if (checkBoxPST3.IsChecked == true) PSTItem3 = Number3 * 0.06;//apply 6% to item3

            if (checkBoxPST4.IsChecked == true) PSTItem4 = Number4 * 0.06;//apply 6% to item4
            
            sumPST = (PSTItem1 + PSTItem2 + PSTItem3 + PSTItem4);

            if (checkBoxGST1.IsChecked == true) GSTItem1 = Number1 * 0.05;//apply 5% to item1
           
            if (checkBoxGST2.IsChecked == true) GSTItem2 = Number2 * 0.05;//apply 5% to item2
            
            if (checkBoxGST3.IsChecked == true) GSTItem3 = Number3 * 0.05;//apply 5% to item3
            
            if (checkBoxGST4.IsChecked == true) GSTItem4 = Number4 * 0.05;//apply 5% to item4
           
            sumGST = GSTItem1 + GSTItem2 + GSTItem3 + GSTItem4;
                      
            if (radioButton.IsChecked == true) Shipping = Subtotal * 0.02;//Ship (add 2%)
           
            Total = Subtotal + Shipping + sumPST + sumGST;

            if (Total > 0 && Total <= 100)
            {
                CommissionRate = "0.035";
                TOTAL.Background = Brushes.Black;
            }
            else if (Total > 100 && Total <= 225)
            {
                CommissionRate = "0.05";
                TOTAL.Background = Brushes.Blue;
            }
            else if (Total > 225 && Total <= 500)
            {
                CommissionRate = "0.07";
                TOTAL.Background = Brushes.Green;
            }
            else if (Total > 500)
            {
                CommissionRate = "0.11";
                TOTAL.Background = Brushes.Red;
            }
            else
            {
                CommissionRate = "0";
            }


            //outputs
            TotalSalesCommission = Double.Parse(CommissionRate) * Total;                                 
            subtotal.Text = Convert.ToString(Subtotal);
            shipping.Text = Convert.ToString(Shipping);
            SumPST.Text = Convert.ToString(sumPST);
            SumGST.Text = Convert.ToString(sumGST);
            TOTAL.Text = Convert.ToString(Total);
            COMMISSION.Text = Convert.ToString(TotalSalesCommission);

        }
    }
}








