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
        public MainWindow()
        {   //WPF App entry point
            // our code goes here
            InitializeComponent();

            MessageBox.Show("Application is Started");
        }

        
        private void botton_Click(object sender, RoutedEventArgs e)
        { // Click event handler for our button
          // code here is executed every time user Clicks the button 

            // create (Declare) a variable to hold the name
            // <Datatype> VariableName
            string PersonName; // declare a string datatype called "PersonName"
            string Message; //declare a string datatype called "Message"

            MessageBox.Show("The first desktop app in the book!");

            //Store Textbox Text Proberty in our Variable
            //LHS Gets or is assined the value or results of the RHS Expression
            PersonName = NameTextbox.Text; // =is an Assignment operator

            //Compose an output message
            Message = "The PersonName is " + PersonName;

            //output the message
           MessageBox.Show(PersonName);
         }
    }
}
