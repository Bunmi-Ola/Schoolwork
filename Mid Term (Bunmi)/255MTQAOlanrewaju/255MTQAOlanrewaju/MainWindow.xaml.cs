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

namespace _255MTQAOlanrewaju
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

        private void Calculatebutton_Click(object sender, RoutedEventArgs e)
        {
            // declare variable
            double originalTicketPrice, distanceTraveled, NewTicketPrice;

            // get inputs
            double.TryParse(OriginalTicketpricetextBox.Text, out originalTicketPrice);
            double.TryParse(DistanceTraveledtextBox.Text, out distanceTraveled);

            if (originalTicketPrice >= 1 && distanceTraveled >= 1)
            {
                NewTicketPrice = NewPrice(originalTicketPrice, distanceTraveled);
                NewTickettextBox.Text = $"{NewTicketPrice:C}";
            }

            else NewTickettextBox.Text = "Vaild number for Original ticket price or for distance travelled required";
        }

        static double NewPrice(double originalticketprice, double distancetraveled)
        {
            double newTicketPrice = 0;

            if (distancetraveled <= 1000)
            {
                newTicketPrice = originalticketprice - (originalticketprice * 0.01);
            }

            else if (distancetraveled > 1000 && distancetraveled <= 1500)
            {
                newTicketPrice = originalticketprice - (originalticketprice * 0.03);
            }

            else if (distancetraveled > 1500 && distancetraveled <= 2000)
            {
                newTicketPrice = originalticketprice - (originalticketprice * 0.06);
            }

            else if (distancetraveled > 2000 && distancetraveled <= 5000)
            {
                newTicketPrice = originalticketprice - (originalticketprice * 0.10);
            }

            else if (distancetraveled > 5000)
            {
                newTicketPrice = originalticketprice - (originalticketprice * 0.15);
            }

            return newTicketPrice;
        }
    }
}
