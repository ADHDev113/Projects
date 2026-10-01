// This file does not need to be modified.

public class Rectangle
{
    // Variables
    private double x;
    private double y;
    private double width;
    private double height;

    // Constructors
    public Rectangle()
    {
        x = 0.0;
        y = 0.0;
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Methods
    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public double getArea()
    {
        return width * height;
    }

    public boolean contains(double x, double y)
    {
        return Math.abs(x - this.x) <= width / 2 &&
               Math.abs(y - this.y) <= height / 2;
    }

    public boolean contains(Rectangle r)
    {
        return contains(r.x - r.width / 2, r.y + r.height / 2) &&
               contains(r.x - r.width / 2, r.y - r.height / 2) &&
               contains(r.x + r.width / 2, r.y + r.height / 2) &&
               contains(r.x + r.width / 2, r.y - r.height / 2);
    }

    public boolean overlaps(Rectangle r)
    {
        return Math.abs(this.x - r.x) <= (this.width + r.width) / 2 &&
               Math.abs(this.y - r.y) <= (this.height + r.height) / 2;
    }
}
