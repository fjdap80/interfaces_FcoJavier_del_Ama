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
using System.Windows.Shapes;

namespace ProyectoFJDAP_GRID
{
    /// <summary>
    /// Lógica de interacción para VentanaNuevoRegistro.xaml
    /// </summary>
    public partial class VentanaNuevoRegistro : Window
    {
        public VentanaNuevoRegistro()
        {
            InitializeComponent();
        }

        private void Button_Click_Volver(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Click_VOLVER_Inicio(object sender, RoutedEventArgs e)
        {

            MainWindow MainWindow = new MainWindow();
            this.Close();
            MainWindow.Show();
        }
    }
}
