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
    /// Lógica de interacción para VentanaFormulario.xaml
    /// </summary>
    public partial class VentanaFormulario : Window
    {
        public VentanaFormulario()
        {
            InitializeComponent();
        }      

       
          

        private void Button_Click_SALIR(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("VAS A SALIR DE TU ÁREA!");
        }
    }
}
