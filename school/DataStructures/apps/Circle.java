package apps;

public class Circle implements Comparable<Circle>
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o)
    {
        Circle c = (Circle)o;
        return radius == c.radius;
    }

    @Override
    public String toString()
    {
        return "Circle(" + radius + ")";
    }

    public int compareTo(Circle c)
    {
        if (radius < c.radius)
        {
            return -1;
        }
        else if (radius > c.radius)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Circle c1 = new Circle(2);
        System.out.println(c1.getArea());
        System.out.println(c1);

        Circle c2 = new Circle(3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        Circle c3 = new Circle(2);
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c3));

        Circle c4 = c1;
        System.out.println(c1 == c4);

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));
        System.out.println(c1.compareTo(c3));
    }
}
