namespace FoodTruck
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            pictureBox1 = new PictureBox();
            listBox1 = new ListBox();
            label1 = new Label();
            tboxPrice = new TextBox();
            comboQty = new ComboBox();
            label2 = new Label();
            labelDisplay = new Label();
            btnAddToCart = new Button();
            listBox2 = new ListBox();
            label3 = new Label();
            btnPlaceOrder = new Button();
            btnClearCart = new Button();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // pictureBox1
            // 
            pictureBox1.Image = Properties.Resources.Spaghetti;
            pictureBox1.Location = new Point(199, 29);
            pictureBox1.Margin = new Padding(2, 2, 2, 2);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(218, 153);
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
            pictureBox1.TabIndex = 0;
            pictureBox1.TabStop = false;
            pictureBox1.Click += pictureBox1_Click;
            // 
            // listBox1
            // 
            listBox1.Font = new Font("Segoe UI", 12F);
            listBox1.FormattingEnabled = true;
            listBox1.Location = new Point(18, 29);
            listBox1.Margin = new Padding(2, 2, 2, 2);
            listBox1.Name = "listBox1";
            listBox1.Size = new Size(159, 151);
            listBox1.TabIndex = 1;
            listBox1.SelectedIndexChanged += listBox1_SelectedIndexChanged;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 12F);
            label1.Location = new Point(199, 191);
            label1.Margin = new Padding(2, 0, 2, 0);
            label1.Name = "label1";
            label1.Size = new Size(44, 21);
            label1.TabIndex = 2;
            label1.Text = "Price";
            // 
            // tboxPrice
            // 
            tboxPrice.Font = new Font("Segoe UI", 12F);
            tboxPrice.Location = new Point(277, 190);
            tboxPrice.Margin = new Padding(2, 2, 2, 2);
            tboxPrice.Name = "tboxPrice";
            tboxPrice.ReadOnly = true;
            tboxPrice.Size = new Size(106, 29);
            tboxPrice.TabIndex = 3;
            // 
            // comboQty
            // 
            comboQty.FormattingEnabled = true;
            comboQty.Location = new Point(277, 224);
            comboQty.Margin = new Padding(2, 2, 2, 2);
            comboQty.Name = "comboQty";
            comboQty.Size = new Size(129, 23);
            comboQty.TabIndex = 4;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 12F);
            label2.Location = new Point(199, 222);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(70, 21);
            label2.TabIndex = 5;
            label2.Text = "Quantity";
            // 
            // labelDisplay
            // 
            labelDisplay.BorderStyle = BorderStyle.Fixed3D;
            labelDisplay.Font = new Font("Segoe UI", 12F);
            labelDisplay.Location = new Point(199, 253);
            labelDisplay.Margin = new Padding(2, 0, 2, 0);
            labelDisplay.Name = "labelDisplay";
            labelDisplay.Size = new Size(218, 98);
            labelDisplay.TabIndex = 6;
            // 
            // btnAddToCart
            // 
            btnAddToCart.Font = new Font("Segoe UI", 12F);
            btnAddToCart.Location = new Point(18, 199);
            btnAddToCart.Margin = new Padding(2, 2, 2, 2);
            btnAddToCart.Name = "btnAddToCart";
            btnAddToCart.Size = new Size(158, 46);
            btnAddToCart.TabIndex = 7;
            btnAddToCart.Text = "Add To Cart";
            btnAddToCart.UseVisualStyleBackColor = true;
            btnAddToCart.Click += btnAddToCart_Click;
            // 
            // listBox2
            // 
            listBox2.Font = new Font("Segoe UI", 12F);
            listBox2.FormattingEnabled = true;
            listBox2.Location = new Point(452, 29);
            listBox2.Margin = new Padding(2, 2, 2, 2);
            listBox2.Name = "listBox2";
            listBox2.Size = new Size(157, 130);
            listBox2.TabIndex = 8;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Segoe UI", 12F);
            label3.Location = new Point(509, 167);
            label3.Margin = new Padding(2, 0, 2, 0);
            label3.Name = "label3";
            label3.Size = new Size(39, 21);
            label3.TabIndex = 9;
            label3.Text = "Cart";
            // 
            // btnPlaceOrder
            // 
            btnPlaceOrder.Font = new Font("Segoe UI", 12F);
            btnPlaceOrder.Location = new Point(449, 199);
            btnPlaceOrder.Margin = new Padding(2, 2, 2, 2);
            btnPlaceOrder.Name = "btnPlaceOrder";
            btnPlaceOrder.Size = new Size(158, 46);
            btnPlaceOrder.TabIndex = 10;
            btnPlaceOrder.Text = "Place an Order";
            btnPlaceOrder.UseVisualStyleBackColor = true;
            btnPlaceOrder.Click += btnPlaceOrder_Click;
            // 
            // btnClearCart
            // 
            btnClearCart.Font = new Font("Segoe UI", 12F);
            btnClearCart.Location = new Point(449, 253);
            btnClearCart.Margin = new Padding(2);
            btnClearCart.Name = "btnClearCart";
            btnClearCart.Size = new Size(158, 46);
            btnClearCart.TabIndex = 11;
            btnClearCart.Text = "Clear Cart";
            btnClearCart.UseVisualStyleBackColor = true;
            btnClearCart.Click += btnClearCart_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(626, 356);
            Controls.Add(btnClearCart);
            Controls.Add(btnPlaceOrder);
            Controls.Add(label3);
            Controls.Add(listBox2);
            Controls.Add(btnAddToCart);
            Controls.Add(labelDisplay);
            Controls.Add(label2);
            Controls.Add(comboQty);
            Controls.Add(tboxPrice);
            Controls.Add(label1);
            Controls.Add(listBox1);
            Controls.Add(pictureBox1);
            Margin = new Padding(2, 2, 2, 2);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private PictureBox pictureBox1;
        private ListBox listBox1;
        private Label label1;
        private TextBox tboxPrice;
        private ComboBox comboQty;
        private Label label2;
        private Label labelDisplay;
        private Button btnAddToCart;
        private ListBox listBox2;
        private Label label3;
        private Button btnPlaceOrder;
        private Button btnClearCart;
    }
}
