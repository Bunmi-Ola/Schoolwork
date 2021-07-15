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
        static Random LotteryNum = new Random();
        public MainWindow()
        {
            InitializeComponent();
        }


        private void generatebutton_Click(object sender, RoutedEventArgs e)
        {
            threeNumber.Text = getRandomNumber(0, 9, 3);
            fourNumber.Text = getRandomNumber(0, 9, 4);
            fiveNumber.Text = getRandomNumber(1, 39, 5);
            fiveNumber1.Text = getRandomNumber(1, 49, 5);
            fivenumext.Text = getRandomNumber(1, 42, 1);
        }

        static String getDigitsRamdom(int a, int b)
        {
            String output = "";

            int randomNumber = LotteryNum.Next(a, b);
            //output += Convert.ToString(randomNumber);
            output += String.Format(" {0:D2}", randomNumber);// just a space in font of { to make a space

            return output;

        }
        static String getRandomNumber(int a, int b, int repetition)
        {
            String output = "";
            for (int i = 0; i < repetition; i++)
            {
                output += getDigitsRamdom(a, b);
            }

            return output;
        }
    }
}

