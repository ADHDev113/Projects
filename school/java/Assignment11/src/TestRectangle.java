//Rectangle is mostly correct, except for the overlaps() method
//I wrote 3 test cases

public class TestRectangle
{
    public static void main(String[] args)
    {
        //tests the noArgs constructor
        Rectangle r1 = new Rectangle();
        System.out.println("r1:");
        System.out.println("X: " + r1.getX());
        System.out.println("Y: " + r1.getY());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Area: " + r1.getArea());
        //tests the default constructor
        Rectangle r2 = new Rectangle(1, 1, 10, 10);
        System.out.println("\nr2: ");
        System.out.println("X: " + r2.getX());
        System.out.println("Y: " + r2.getY());
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println("Area: " + r2.getArea());
        //test setters
        r1.setX(2);
        r1.setY(2);
        r1.setHeight(5);
        r1.setWidth(5);
        //test contains()
        System.out.println("\nr2.contains(r1): " + r2.contains(r1));
        System.out.println("r1.contains(r2): " + r1.contains(r2));
        //test overlaps()
        System.out.println("r1.overlaps(r2)" + r1.overlaps(r2));
    }
}
