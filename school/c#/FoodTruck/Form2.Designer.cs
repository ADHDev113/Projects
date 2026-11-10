namespace FoodTruck
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            btnPlaceOrderForm = new Button();
            btnProcessOrdersForm = new Button();
            SuspendLayout();
            // 
            // btnPlaceOrderForm
            // 
            btnPlaceOrderForm.Font = new Font("Segoe UI", 12F);
            btnPlaceOrderForm.Location = new Point(59, 105);
            btnPlaceOrderForm.Name = "btnPlaceOrderForm";
            btnPlaceOrderForm.Size = new Size(279, 119);
            btnPlaceOrderForm.TabIndex = 0;
            btnPlaceOrderForm.Text = "Place an Order";
            btnPlaceOrderForm.UseVisualStyleBackColor = true;
            btnPlaceOrderForm.Click += btnPlaceOrderForm_Click;
            // 
            // btnProcessOrdersForm
            // 
            btnProcessOrdersForm.Font = new Font("Segoe UI", 12F);
            btnProcessOrdersForm.Location = new Point(401, 105);
            btnProcessOrdersForm.Name = "btnProcessOrdersForm";
            btnProcessOrdersForm.Size = new Size(279, 119);
            btnProcessOrdersForm.TabIndex = 1;
            btnProcessOrdersForm.Text = "Process Orders";
            btnProcessOrdersForm.UseVisualStyleBackColor = true;
            btnProcessOrdersForm.Click += btnProcessOrdersForm_Click;
            // 
            // Form2
            // 
            AutoScaleDimensions = new SizeF(10F, 25F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(752, 323);
            Controls.Add(btnProcessOrdersForm);
            Controls.Add(btnPlaceOrderForm);
            Name = "Form2";
            Text = "Form2";
            ResumeLayout(false);
        }

        #endregion

        private Button btnPlaceOrderForm;
        private Button btnProcessOrdersForm;
    }
}