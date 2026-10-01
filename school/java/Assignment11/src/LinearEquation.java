// This file does not need to be modified.

public class LinearEquation
{
    // Variables
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructors
    public LinearEquation(double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Methods
    public boolean isSolvable()
    {
        return (a * d - b * c) != 0;
    }

    public double getX()
    {
        double x = (e * d - b * f) / (a * d - b * c);
        return x;
    }

    public double getY()
    {
        double y = (a * f - e * c) / (a * d - b * c);
        return y;
    }
}
