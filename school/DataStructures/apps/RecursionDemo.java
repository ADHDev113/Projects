package apps;

public class RecursionDemo
{
    public static void main(String[] args)
    {
        System.out.println(factorial(4));
    }

    static int factorial(int n)
    {
        System.out.printf("factorial(%d)\n", n);
        if (n == 1)
        {
            return 1;
        }
        int res = n * factorial(n - 1);
        System.out.printf("factorial(%d) about to return %d\n", n, res);
        return res;
    }
}
