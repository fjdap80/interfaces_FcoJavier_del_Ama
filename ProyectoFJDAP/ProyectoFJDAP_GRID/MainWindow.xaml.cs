﻿using System;
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

namespace ProyectoFJDAP_GRID
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

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            

            VentanaFormulario ventanaFormulario= new VentanaFormulario();
            this.Close();
            ventanaFormulario.Show();
        }

        private void Button_Click_Registro(object sender, RoutedEventArgs e)
        {
            VentanaNuevoRegistro VentanaNuevoRegistro = new VentanaNuevoRegistro();
            this.Close();
            VentanaNuevoRegistro.Show();

        }
    }
}
