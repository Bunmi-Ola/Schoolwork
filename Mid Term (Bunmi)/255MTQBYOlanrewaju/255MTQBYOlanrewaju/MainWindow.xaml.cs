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

namespace _255MTQBYOlanrewaju
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
            //Declarations
            decimal NewServerPrice, Depreciation, currentValue = 0, depreciationrate;
            int year = 0;
            Decimal annualdepreciation = 30;

            NewServerPrice = Convert.ToDecimal(NewServerPricetextBox.Text);

            //Set up initial values            
            currentValue = NewServerPrice;
            depreciationrate = annualdepreciation / 100;

            outputlistBox.Items.Clear();
            outputlistBox.Items.Add(String.Format("{0,-15}{1,-25}{2,-15}", "Year", "Depreciation", "Value"));
            outputlistBox.Items.Add("=============================\n");

            do
            {
                year += 1; //count year

                Depreciation = currentValue * depreciationrate;  //calculate Depreciation
                currentValue = currentValue - Depreciation;
                outputlistBox.Items.Add($"{year,-20:D} {Depreciation,-25:N2} {currentValue,-15:N2}\n");

            }
            while (currentValue > 5000);

        }

    }
}
