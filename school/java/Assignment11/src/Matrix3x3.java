// This file does not need to be modified.

public class Matrix3x3
{
    // Variables
    double[][] values = new double[3][3];

    // Constructors
    public Matrix3x3(double a, double b, double c,
                     double d, double e, double f)
    {
        values[0][0] = a;
        values[0][1] = b;
        values[0][2] = 1;

        values[1][0] = c;
        values[1][1] = d;
        values[1][2] = 1;

        values[2][0] = e;
        values[2][1] = f;
        values[2][2] = 1;
    }

    // Methods
    public double getArea()
    {
        double sub1 = (values[1][0] * values[2][1]) - (values[1][1] * values[2][0]);
        double sub2 = (values[0][0] * values[2][1]) - (values[0][1] * values[2][0]);
        double sub3 = (values[0][0] * values[1][1]) - (values[0][1] * values[1][0]);

        double area = (1 / 2.0) * (sub1 - sub2 + sub3);

        return Math.abs(area);
    }

    public String toString()
    {
        return String.format("%8.2f%8.2f%8.2f\n", values[0][0], values[0][1], values[0][2]) +
               String.format("%8.2f%8.2f%8.2f\n", values[1][0], values[1][1], values[1][2]) +
               String.format("%8.2f%8.2f%8.2f\n", values[2][0], values[2][1], values[2][2]);
    }
}



