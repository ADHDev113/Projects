namespace MathLearning
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
            components = new System.ComponentModel.Container();
            labelDisplay = new Label();
            label2 = new Label();
            tboxAnswer = new TextBox();
            btnSubmit = new Button();
            btnNext = new Button();
            btnStart = new Button();
            labelCorrect = new Label();
            labelIncorrect = new Label();
            labelCorrectCount = new Label();
            labelIncorrectCount = new Label();
            groupBox1 = new GroupBox();
            radioDivision = new RadioButton();
            radioMultiplication = new RadioButton();
            radioSubtraction = new RadioButton();
            radioAddition = new RadioButton();
            checkBoxTimer = new CheckBox();
            label1 = new Label();
            tboxTime = new TextBox();
            timer1 = new System.Windows.Forms.Timer(components);
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // labelDisplay
            // 
            labelDisplay.BorderStyle = BorderStyle.Fixed3D;
            labelDisplay.Font = new Font("Segoe UI", 15F);
            labelDisplay.Location = new Point(281, 63);
            labelDisplay.Margin = new Padding(2, 0, 2, 0);
            labelDisplay.Name = "labelDisplay";
            labelDisplay.Size = new Size(341, 130);
            labelDisplay.TabIndex = 0;
            labelDisplay.Text = "Press Start to begin";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 15F);
            label2.Location = new Point(274, 204);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(79, 28);
            label2.TabIndex = 1;
            label2.Text = "Answer:";
            // 
            // tboxAnswer
            // 
            tboxAnswer.Font = new Font("Segoe UI", 15F);
            tboxAnswer.Location = new Point(364, 202);
            tboxAnswer.Margin = new Padding(2);
            tboxAnswer.Name = "tboxAnswer";
            tboxAnswer.Size = new Size(106, 34);
            tboxAnswer.TabIndex = 2;
            // 
            // btnSubmit
            // 
            btnSubmit.Font = new Font("Segoe UI", 15F);
            btnSubmit.Location = new Point(483, 204);
            btnSubmit.Margin = new Padding(2);
            btnSubmit.Name = "btnSubmit";
            btnSubmit.Size = new Size(122, 38);
            btnSubmit.TabIndex = 3;
            btnSubmit.Text = "Submit";
            btnSubmit.UseVisualStyleBackColor = true;
            btnSubmit.Click += btnSubmit_Click;
            // 
            // btnNext
            // 
            btnNext.Font = new Font("Segoe UI", 15F);
            btnNext.Location = new Point(483, 243);
            btnNext.Margin = new Padding(2);
            btnNext.Name = "btnNext";
            btnNext.Size = new Size(122, 38);
            btnNext.TabIndex = 4;
            btnNext.Text = "Next";
            btnNext.UseVisualStyleBackColor = true;
            btnNext.Click += btnNext_Click;
            // 
            // btnStart
            // 
            btnStart.Font = new Font("Segoe UI", 15F);
            btnStart.Location = new Point(13, 7);
            btnStart.Margin = new Padding(2);
            btnStart.Name = "btnStart";
            btnStart.Size = new Size(624, 39);
            btnStart.TabIndex = 5;
            btnStart.Text = "Start";
            btnStart.UseVisualStyleBackColor = true;
            btnStart.Click += btnStart_Click;
            // 
            // labelCorrect
            // 
            labelCorrect.AutoSize = true;
            labelCorrect.Font = new Font("Segoe UI", 15F);
            labelCorrect.Location = new Point(344, 243);
            labelCorrect.Margin = new Padding(2, 0, 2, 0);
            labelCorrect.Name = "labelCorrect";
            labelCorrect.Size = new Size(80, 28);
            labelCorrect.TabIndex = 7;
            labelCorrect.Text = "Correct:";
            labelCorrect.Click += labelCorrect_Click;
            // 
            // labelIncorrect
            // 
            labelIncorrect.AutoSize = true;
            labelIncorrect.Font = new Font("Segoe UI", 15F);
            labelIncorrect.Location = new Point(344, 282);
            labelIncorrect.Margin = new Padding(2, 0, 2, 0);
            labelIncorrect.Name = "labelIncorrect";
            labelIncorrect.Size = new Size(93, 28);
            labelIncorrect.TabIndex = 8;
            labelIncorrect.Text = "Incorrect:";
            // 
            // labelCorrectCount
            // 
            labelCorrectCount.AutoSize = true;
            labelCorrectCount.BorderStyle = BorderStyle.FixedSingle;
            labelCorrectCount.Font = new Font("Segoe UI", 15F);
            labelCorrectCount.Location = new Point(433, 243);
            labelCorrectCount.Margin = new Padding(2, 0, 2, 0);
            labelCorrectCount.Name = "labelCorrectCount";
            labelCorrectCount.Size = new Size(25, 30);
            labelCorrectCount.TabIndex = 9;
            labelCorrectCount.Text = "0";
            // 
            // labelIncorrectCount
            // 
            labelIncorrectCount.AutoSize = true;
            labelIncorrectCount.BorderStyle = BorderStyle.FixedSingle;
            labelIncorrectCount.Font = new Font("Segoe UI", 15F);
            labelIncorrectCount.Location = new Point(447, 282);
            labelIncorrectCount.Margin = new Padding(2, 0, 2, 0);
            labelIncorrectCount.Name = "labelIncorrectCount";
            labelIncorrectCount.Size = new Size(25, 30);
            labelIncorrectCount.TabIndex = 10;
            labelIncorrectCount.Text = "0";
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(radioDivision);
            groupBox1.Controls.Add(radioMultiplication);
            groupBox1.Controls.Add(radioSubtraction);
            groupBox1.Controls.Add(radioAddition);
            groupBox1.Font = new Font("Segoe UI", 12F);
            groupBox1.Location = new Point(19, 50);
            groupBox1.Margin = new Padding(2);
            groupBox1.Name = "groupBox1";
            groupBox1.Padding = new Padding(2);
            groupBox1.Size = new Size(220, 179);
            groupBox1.TabIndex = 11;
            groupBox1.TabStop = false;
            groupBox1.Text = "Arithmetic Operations";
            // 
            // radioDivision
            // 
            radioDivision.AutoSize = true;
            radioDivision.Location = new Point(11, 137);
            radioDivision.Margin = new Padding(2);
            radioDivision.Name = "radioDivision";
            radioDivision.Size = new Size(84, 25);
            radioDivision.TabIndex = 3;
            radioDivision.Text = "Division";
            radioDivision.UseVisualStyleBackColor = true;
            radioDivision.CheckedChanged += radioDivision_CheckedChanged;
            // 
            // radioMultiplication
            // 
            radioMultiplication.AutoSize = true;
            radioMultiplication.Location = new Point(11, 100);
            radioMultiplication.Margin = new Padding(2);
            radioMultiplication.Name = "radioMultiplication";
            radioMultiplication.Size = new Size(123, 25);
            radioMultiplication.TabIndex = 2;
            radioMultiplication.Text = "Multiplication";
            radioMultiplication.UseVisualStyleBackColor = true;
            radioMultiplication.CheckedChanged += radioMultiplication_CheckedChanged;
            // 
            // radioSubtraction
            // 
            radioSubtraction.AutoSize = true;
            radioSubtraction.Location = new Point(11, 64);
            radioSubtraction.Margin = new Padding(2);
            radioSubtraction.Name = "radioSubtraction";
            radioSubtraction.Size = new Size(108, 25);
            radioSubtraction.TabIndex = 1;
            radioSubtraction.Text = "Subtraction";
            radioSubtraction.UseVisualStyleBackColor = true;
            radioSubtraction.CheckedChanged += radioSubtraction_CheckedChanged;
            // 
            // radioAddition
            // 
            radioAddition.AutoSize = true;
            radioAddition.Checked = true;
            radioAddition.Location = new Point(11, 31);
            radioAddition.Margin = new Padding(2);
            radioAddition.Name = "radioAddition";
            radioAddition.Size = new Size(87, 25);
            radioAddition.TabIndex = 0;
            radioAddition.TabStop = true;
            radioAddition.Text = "Addition";
            radioAddition.UseVisualStyleBackColor = true;
            radioAddition.CheckedChanged += radioAddition_CheckedChanged;
            // 
            // checkBoxTimer
            // 
            checkBoxTimer.AutoSize = true;
            checkBoxTimer.Font = new Font("Segoe UI", 12F);
            checkBoxTimer.Location = new Point(19, 287);
            checkBoxTimer.Margin = new Padding(2);
            checkBoxTimer.Name = "checkBoxTimer";
            checkBoxTimer.Size = new Size(76, 25);
            checkBoxTimer.TabIndex = 13;
            checkBoxTimer.Text = "Timer?";
            checkBoxTimer.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 12F);
            label1.Location = new Point(111, 290);
            label1.Margin = new Padding(2, 0, 2, 0);
            label1.Name = "label1";
            label1.Size = new Size(106, 21);
            label1.TabIndex = 14;
            label1.Text = "Time left (sec)";
            // 
            // tboxTime
            // 
            tboxTime.Font = new Font("Segoe UI", 12F);
            tboxTime.Location = new Point(230, 288);
            tboxTime.Margin = new Padding(2);
            tboxTime.Name = "tboxTime";
            tboxTime.Size = new Size(36, 29);
            tboxTime.TabIndex = 15;
            // 
            // timer1
            // 
            timer1.Interval = 1000;
            timer1.Tick += timer1_Tick;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(645, 346);
            Controls.Add(tboxTime);
            Controls.Add(label1);
            Controls.Add(checkBoxTimer);
            Controls.Add(groupBox1);
            Controls.Add(labelIncorrectCount);
            Controls.Add(labelCorrectCount);
            Controls.Add(labelIncorrect);
            Controls.Add(labelCorrect);
            Controls.Add(btnStart);
            Controls.Add(btnNext);
            Controls.Add(btnSubmit);
            Controls.Add(tboxAnswer);
            Controls.Add(label2);
            Controls.Add(labelDisplay);
            Margin = new Padding(2);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label labelDisplay;
        private Label label2;
        private TextBox tboxAnswer;
        private Button btnSubmit;
        private Button btnNext;
        private Button btnStart;
        private Label labelCorrect;
        private Label labelIncorrect;
        private Label labelCorrectCount;
        private Label labelIncorrectCount;
        private GroupBox groupBox1;
        private RadioButton radioDivision;
        private RadioButton radioMultiplication;
        private RadioButton radioSubtraction;
        private RadioButton radioAddition;
        private CheckBox checkBoxTimer;
        private Label label1;
        private TextBox tboxTime;
        private System.Windows.Forms.Timer timer1;
    }
}
