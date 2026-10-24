package hw;

public class Rectangle implements Comparable<Rectangle>
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o)
    {
        Rectangle r = (Rectangle)o;
        if (width == r.width && height == r.height)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int compareTo(Rectangle o)
    {
        if (width > o.width)
        {
            return 1;
        }
        else if (width < o.width)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return String.format("Rect(%.1f,%.1f)", width, height);
    }
}
