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

namespace ArraysDiceLap
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {


        }

        private void DisplayButton_Click(object sender, RoutedEventArgs e)
        {
            Random randomNumbers = new Random();

            int NumbersofDiceSides, numberofrolls;
            string output = "";

            int.TryParse(diceSize.Text, out NumbersofDiceSides);
            int.TryParse(NumberofRolls.Text, out numberofrolls);

            int [] frequency = new int[NumbersofDiceSides + 1];


            for (int i = 1; i < numberofrolls; ++i)
            {
                ++frequency[ randomNumbers.Next(1, NumbersofDiceSides+1)];               
            }

            output += (String.Format("{0,-20}{1,-15}{2}", "Dice Side", "Frequency", "\n"));

            output += ShowGraph(numberofrolls, NumbersofDiceSides, frequency);

            Outputbox.Text = output;
        }

        static string ShowGraph(int Labels, int Values, int [] freq) {
            string Output = ""; String message = "";
            const int MaxCols = 30;
            double ScaleFactor = (double)MaxCols / ((double)Labels / (double)Values);

            if (ScaleFactor > 1) ScaleFactor = 1;
            for (int i = 1; i < Values; ++i)
            {
                message = "";
                for (int star = 1; star <= freq[i] * ScaleFactor; ++star)
                {
                    message += "*";
                }
                Output += ($"{i,5}{freq[i],20}{message}\n ");
            }

            Output += "";
            return Output;
        }


    }
}
