using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FoodTruck
{
    public partial class Form3 : Form
    {
        public static ArrayList orders = new ArrayList();
        public Form3()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < orders.Count; i++)
            {
                listBox1.Items.Add(orders[i]);
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            listBox2.Items.Clear();
            Order selectedOrder = (Order)listBox1.Items[listBox1.SelectedIndex];
            for (int i = 0; i < selectedOrder.GetItemAmount(); i++)
            {
                listBox2.Items.Add(selectedOrder.ItemAt(i));
            }
        }
    }
}
