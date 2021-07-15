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

namespace PrimeNumApp
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

        private void Calculate_Click(object sender, RoutedEventArgs e)
        {
            int Num1, Num2, Number;
            String Prime = "";

            int.TryParse(Lowernum.Text, out Num1);
            int.TryParse(Uppernum.Text, out Num2);

            // VALIDATE L < H, L >= 2

            if (Num1 < Num2 && Num1 >= 2)

            {
                for (Number = Num1; Number <= Num2; Number++)
                {
                    if (Primenum(Number))
                    {
                        Prime += Number + "\n";
                    }
                }

                outputtextBox.Text = Prime;
                }

            else
            { outputtextBox.Text = "Please put in a lower boundry less than upper boundry and greater than 1";
            }
        }
        static bool Primenum(int num) {

            for (int div = 2; div <= Math.Sqrt(num); div++)
            {
                if (num % div == 0) return false;
            }
                   
            return true;
        }

    }
}
