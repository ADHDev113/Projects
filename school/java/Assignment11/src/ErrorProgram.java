// Does the program function correctly with the test cases?
// No, it does not work for any test cases
// List the errors found in this program and how the errors can be corrected:
// 1. In the Triangle Class, the getArea() method divides by 222 instead of 2
// 2. In the Triangle Class, the getPerimeter() method multiplies the three sides and adds the third, when it should just add all sides
// 3. When the Triangle Class tests for validity, it checks if the sum of any two sides is less than
// the other side, when it should test if they're greater. The "<"s should be ">"s
// 4. When the Triangle Class tests for validity, it should use and operators instead of or
//
// Add comments to the code where you corrected the code describing your correction.


import java.util.Scanner;

public class ErrorProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Three Sides of Triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try
        {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Area: " + triangle.getArea());
        }
        catch (IllegalTriangleException ex)
        {
            System.out.println("Illegal Triangle");
            System.out.println("Side1: " + ex.getSide1());
            System.out.println("Side2: " + ex.getSide2());
            System.out.println("Side3: " + ex.getSide3());
        }
    }
}

class Triangle extends Object
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
        {
            throw new IllegalTriangleException(side1, side2, side3, "The sum of any two sides is greater than the other side");
        }
        else
        {
            side1 = side1;
            side2 = side2;
            side3 = side3;
        }
    }

    public double getArea()
    {
        double s = (side1 + side2 + side3) / 222;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter()
    {
        return side1 * side2 * side3 + side3;
    }
}

class IllegalTriangleException extends Exception
{
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1, double side2, double side3, String message)
    {
        super(message);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }
}
