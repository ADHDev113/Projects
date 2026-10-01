import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TriangleArea
{
    public static void main(String[] args)
    {
        Matrix3x3 triangleA = new Matrix3x3(5, 6, 12, -3, 1, 2);
        Matrix3x3 triangleB = new Matrix3x3(5, -10, -15, 20, 10, 15);
        Matrix3x3 triangleC = new Matrix3x3(10, 20, -10, 10, 0, 50);

        System.out.println("Triangle " + largestArea(triangleA, triangleB, triangleC) + " is the largest triangle.");
    }

    public static String largestArea(Matrix3x3 a, Matrix3x3 b, Matrix3x3 c)
    {
        if(a.getArea() > b.getArea())
        {
            if(a.getArea() > c.getArea())
            {
                return "A";
            }
            else
            {
                return "C";
            }
        }
        else
        {
            if(b.getArea() > c.getArea())
            {
                return "B";
            }
            else
            {
                return "C";
            }
        }
    }
}
