using System.Drawing.Text;

namespace FoodTruck
{
    public partial class Form1 : Form
    {
        string[] foodNames = { "Hot Dog", "Pizza", "Spaghetti" };
        Image[] images = { Properties.Resources.HotDog, Properties.Resources.Pizza, Properties.Resources.Spaghetti };
        double[] prices = { 0.99, 8.99, 7.99 };
        int[] available = { 20, 5, 3 };
        int[] ordered = { 0, 0, 0 };
        double subtotal;
        int ordersPlaced;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < foodNames.Length; i++)
            {
                listBox1.Items.Add(foodNames[i]);
            }
            subtotal = 0;
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int idx = listBox1.SelectedIndex;
            pictureBox1.Image = images[idx];
            tboxPrice.Text = $"{prices[idx]:C}";


            comboQty.Items.Clear();
            for (int i = 1; i <= available[idx]; i++)
            {
                comboQty.Items.Add(i);
            }
            comboQty.SelectedIndex = 0;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void btnAddToCart_Click(object sender, EventArgs e)
        {
            int idx = listBox1.SelectedIndex;
            if (idx < 0)
            {
                MessageBox.Show("No Item Selected");
            }
            else
            {
                double price = prices[idx];
                int quantity = (int)comboQty.SelectedItem;
                if (ordered[idx] + quantity > available[idx])
                {
                    MessageBox.Show("Amount Selected Is More Than Is Available");
                }
                else
                {
                    ordered[idx] += quantity;
                    subtotal += price * quantity;
                    labelDisplay.Text = $"Subtotal : {subtotal:C}";
                    listBox2.Items.Add(new OrderItem(foodNames[idx], quantity));
                }
            }
        }

        private void btnPlaceOrder_Click(object sender, EventArgs e)
        {
            if (listBox2.Items.Count == 0)
            {
                MessageBox.Show("Cart is Empty");
            }
            else
            {
                OrderItem[] items = new OrderItem[listBox2.Items.Count];
                for (int i = 0; i < items.Length; i++)
                {
                    items[i] = (OrderItem)listBox2.Items[i];
                }
                Order order = new Order(items, $"Order{++ordersPlaced}");
                Form3.orders.Add(order);
                ClearCart();
            }
        }

        private void btnClearCart_Click(object sender, EventArgs e)
        {
            ClearCart();
        }

        private void ClearCart()
        {
            for (int i = 0; i < ordered.Length; i++)
            {
                ordered[i] = 0;
            }
            subtotal = 0;
            listBox2.Items.Clear();
            labelDisplay.Text = "";
        }
    }
}
