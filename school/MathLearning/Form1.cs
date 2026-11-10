namespace MathLearning
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        Random rand;
        int answer;
        int correctCount;
        int count;
        string operation;
        int time;

        private void GenerateQuestion()
        {
            labelCorrectCount.Text = correctCount.ToString();
            labelIncorrectCount.Text = (count - correctCount).ToString();
            int n1 = rand.Next(0, 100);
            int n2 = rand.Next(0, 100);
            switch (operation)
            {
                case "addition":
                    labelDisplay.Text = $"{n1} + {n2} = ?";
                    answer = n1 + n2;
                    break;
                case "subtraction":
                    labelDisplay.Text = $"{n1} - {n2} = ?";
                    answer = n1 - n2;
                    break;
                case "multiplication":
                    labelDisplay.Text = $"{n1} x {n2} = ?";
                    answer = n1 * n2;
                    break;
                case "division":
                    n2 = rand.Next(1, 10);
                    int n3 = n1 * n2;
                    labelDisplay.Text = $"{n3} / {n2} = ?";
                    answer = n1;
                    break;
                default:
                    break;
            }
            btnSubmit.Enabled = true;
            if (checkBoxTimer.Checked)
            {
                time = 5;
                tboxTime.Text = "5";
                timer1.Start();
            }
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            count = 0;
            correctCount = 0;
            GenerateQuestion();
            btnStart.Text = "Restart";
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            int submission;
            if (int.TryParse(tboxAnswer.Text, out submission))
            {
                btnNext.Enabled = true;
                count++;
                if (submission == answer)
                {
                    labelDisplay.Text += $"\nCorrect! you have gotten {++correctCount} out of {count} correct";
                }
                else
                {
                    labelDisplay.Text += $"\nIncorrect! The answer is {answer}\nYou have gotten {correctCount} out of {count} correct";
                }
                tboxAnswer.Text = "";
                btnSubmit.Enabled = false;
                timer1.Stop();
            }
            else
            {
                MessageBox.Show("Invalid Input!");
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            rand = new Random();
            btnSubmit.Enabled = false;
            btnNext.Enabled = false;
            operation = "addition";
            time = 5;
            timer1.Stop();
        }

        private void btnNext_Click(object sender, EventArgs e)
        {
            GenerateQuestion();
            btnNext.Enabled = false;
        }

        private void labelCorrect_Click(object sender, EventArgs e)
        {

        }

        private void radioAddition_CheckedChanged(object sender, EventArgs e)
        {
            if (radioAddition.Checked) { operation = "addition"; }
            ;
        }

        private void radioSubtraction_CheckedChanged(object sender, EventArgs e)
        {
            if (radioSubtraction.Checked) { operation = "subtraction"; }
        }

        private void radioMultiplication_CheckedChanged(object sender, EventArgs e)
        {
            if (radioMultiplication.Checked) { operation = "multiplication"; }
        }

        private void radioDivision_CheckedChanged(object sender, EventArgs e)
        {
            if (radioDivision.Checked) { operation = "division"; }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
           time -= 1;
           tboxTime.Text = time.ToString();
           if (time == 0)
           {
                timer1.Stop();
                labelDisplay.Text += $"\nOut of Time! You have gotten {correctCount} out of {++count} correct";
                btnSubmit.Enabled = false;
                btnNext.Enabled = true;
           }
        }
    }
}
