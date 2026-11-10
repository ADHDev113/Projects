using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FoodTruck
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void btnPlaceOrderForm_Click(object sender, EventArgs e)
        {
            Form1 placeOrderForm = new Form1();
            placeOrderForm.ShowDialog();
        }

        private void btnProcessOrdersForm_Click(object sender, EventArgs e)
        {
            Form3 processOrderForm = new Form3();
            processOrderForm.ShowDialog();
        }
    }
}
