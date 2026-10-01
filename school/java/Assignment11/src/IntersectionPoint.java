import java.util.Scanner;

public class IntersectionPoint
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Point for First Line: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter Second Point for First Line: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter First Point for Second Line: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Enter Second Point for Second Line: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = -1 * y1 * (x1 - x2) + (y1 - y2) * x1;
        double f = -1 * y3 * (x3 - x4) + (y3 - y4) * x3;

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if(linearEquation.isSolvable())
        {
            System.out.println("\nIntersection Point: (" + linearEquation.getX() + ", " + linearEquation.getY() + ")");
        }
        else
        {
            System.out.println("\nNo Intersection: Parallel Lines");
        }
    }
}
