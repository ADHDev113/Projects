using System;
using System.Collections.Generic;
using System.Text;

namespace StudentDemo
{
    internal class Student
    {
        private double average;

        public Student(string name, double average)
        {
            Name = name;
            Average = average;
        }

        public string Name { get; set; }

        public double Average
        {
            get { return average; }
            set
            {
                if (value >= 0) { average = value; }
            }
        }

        //public char LetterGrade()
        //{
        //    if (Average >= 90) { return  'A'; }
        //    else if (Average >= 80) { return 'B'; }
        //    else if (Average >= 70) { return 'C'; }
        //    else if (Average >= 60) { return 'D'; }
        //    else { return 'F'; }
        //}

        public string LetterGrade
        {
            get
            {
                //string grade = string.Empty; // same as " "
                //if (Average >= 90) 
                //{
                //    grade = "A"; 
                //}
                //else if (Average >= 80) 
                //{ 
                //    grade = "B"; 
                //}
                //else if (Average >= 70) 
                //{ 
                //    grade = "C";
                //}
                //else if (Average >= 60) 
                //{ 
                //    grade = "D"; 
                //}
                //else 
                //{ 
                //    grade = "F"; 
                //}
                //return grade;
                string grade = Average >= 90 ? "A" : Average >= 80 ? "B" : Average >= 70 ? "C" : Average >= 60 ? "D" : "F";
                return grade;
            }
        }
    }
}
