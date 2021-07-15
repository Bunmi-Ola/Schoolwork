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

namespace Calculator_simple_function_demo
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        //declare globals here

        public MainWindow() // constuctor method of Window Class
        {
            InitializeComponent();
            // set ip default values
            addRadioButton.IsChecked = true;
        }

        private void calculateButton_Click(object sender, RoutedEventArgs e)
        {
            // define variables
            double Num1, Num2, Result = 0;
            string Operator = "";

            // get inputs
            Double.TryParse(num1TextBox.Text, out Num1);
            Double.TryParse(num2TextBox.Text, out Num2);

            // Perform Calculation 

            //Method 1 - using Separate functions
            //if (addRadioButton.IsChecked.Value)
            //{
            //    //Add
            //    //Result = Num1 + Num2;
            //    Result = Add(Num1, Num2); // Argument "Num1" gets passed into "Parameter "A"
            //}
            //else if (subtractRadioButton.IsChecked.Value)
            //{
            //    //Subt
            //    Result = Subtract(Num1, Num2);

            //}
            //else if (multiplyRadioButton.IsChecked.Value)
            //{
            //    //Mult
            //    Result = Multiply(Num1, Num2);

            //}
            //else if (divideRadioButton.IsChecked.Value)
            //{
            //    //Divide
            //    Result = Divide(Num1, Num2);
            //}

            //Method 2 - using General Calculate function
            if (addRadioButton.IsChecked.Value)
            {
                //Add
                //Result = Num1 + Num2;
                Operator = "+";
            }
            else if (subtractRadioButton.IsChecked.Value)
            {
                //Subt
                Operator = "-";

            }
            else if (multiplyRadioButton.IsChecked.Value)
            {
                //Mult
                Operator = "*";

            }
            else if (divideRadioButton.IsChecked.Value)
            {
                //Divide
                Operator = "/";
            }

            Result = Calculate(Num1, Num2, Operator);

            //output
            resultTextBox.Text = Convert.ToString(Result);
        }

        // Declare our functions inside Window Class, Outside of other Functions

        // Add Function takes 2 double Arguments, and Returns Sum as Double    
        // Prototype: Name: Add, ( Parameter List )
        static double Add(double A, double B) // Function Declaration or Signature
        {
            // local variable Result exists only in Add function
            // and overides any "Result" variable outside
            double Result;
            Result = A + B;

            return Result;
        }
        static double Subtract(double A, double B) // Function Declaration or Signature
        {
            double Result;
            Result = A - B;

            return Result;
        }
        static double Divide(double A, double B) // Function Declaration or Signature
        {
            double Result;
            Result = A / B;

            return Result;
        }
        static double Multiply(double A, double B) // Function Declaration or Signature
        {
            double Result;
            Result = A * B;

            return Result;
        }

        // General Method to hadle the whole process
        static double Calculate(double A, double B, string Op )
        {
            double Result = 0;

            if (Op == "+")
            {
                //Add
                Result = Add(A,B);
            }
            else if (Op == "-")
            {
                //Subt
                Result = Subtract(A,B);
            }
            // Exercise - do Mult and Div here

            return Result;
        }
    }
}
