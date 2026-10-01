package apps;

public class Practice
{
    static int sumUpTo(int n)
    {
        // Return the total sum of 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }

    static void displayArray(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        // display 1 through 10
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(i);
//        }

        //sum 1 to 10 and display the total
//        int sum = 0;
//        for (int i = 1; i <= 10; i++)
//        {
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(sumUpTo(100));

        int[] nums;
        nums = new int[5];
        nums[0] = 10;
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
        displayArray(nums);
        int[] nums1 = {10, 5, -2};
        displayArray(nums1); // 10 50 -2
    }
}
