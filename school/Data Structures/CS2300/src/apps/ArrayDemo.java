package apps;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class ArrayDemo
{
    static int sumArray(int[] nums) // T(nums.length) = 0(nums.length)
    {                                           // cost         // times
        int sum = 0;                            // c1           // 1
        for (int i = 0; i < nums.length; i++)   // c2           // nums.length + 1
        {
            sum += nums[i];                     // c3           //nums.length
        }
        return sum;                             // c4           // 1
    }
    static void swapFirstLast(int[] nums) // T(nums.length) = 0(1)
    {
        //Make change to the array so that the first and last elements are swapped.
        //eg) suppose nums = {10, 20, 30, 40},
        //the swapFirstLast(nums) will change it to {40, 20, 30, 10}
        int lastNum = nums.length - 1;
        int first = nums[0];
        nums[0] = nums[lastNum];
        nums[lastNum] = first;
    }
    static int[] swapFirstLastNew(int[] nums)
    {
        int[] output = new int[nums.length];
        output[0] = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++)
        {
            output[i] = nums[i];
        }
        output[nums.length - 1] = nums[0];
        return output;
    }

    static void shiftLeft(int[] nums) // 0(nums.length)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            nums[i] = nums[i + 1];
        }
    }

    static int[] shiftLeftNew(int[] nums) // 0(nums.length)
    {
        int[] shifted = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++)
        {
            shifted[i] = nums[i + 1];
        }
        shifted[nums.length - 1] = nums[nums.length - 1];
        return shifted;
    }

    static int countPositive(int[] nums) // 0(nums.length)
    {
        int positive = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                positive++;
            }
        }
        return positive;
    }

    static void shiftRight(int[] nums) // 0(nums.length)
    {
        for (int i = nums.length - 1; i > 0; i--)
        {
            nums[i] = nums[i - 1];
        }
    }

    static int[] shiftRightNew(int[] nums) // 0(nums.length)
    {
        int[] nums2 = new int[nums.length];
        for (int i = nums.length - 1; i > 0; i--)
        {
            nums2[i] = nums[i - 1];
        }
        nums2[0] = nums[0];
        return nums2;
    }

    static int findMax(int[] nums) // 0(nums.length)
    {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        return max;
    }

    static int findMin(int[] nums) // 0(nums.length)
    {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        return min;
    }

    static void sort(int[] nums) // 0(nums.length**2)
    {
        for (int j = 0; j < nums.length; j++)
        {
            int minSlot = j;
            for (int i = j + 1; i < nums.length; i++)
            {
                if (nums[i] < nums[minSlot])
                {
                    minSlot = i;
                }
            }
            int temp = nums[j];
            nums[j] = nums[minSlot];
            nums[minSlot] = temp;
        }
    }

    static int linearSearch(int[] nums, int val) // 0(1) ~ 0(nums.length)
    {
                                                // best-case            // worst-case
                                                // nums[0] == val       // val is not found
                                                // 0(1)                 0(nums.length)
        for (int i = 0; i < nums.length; i++)   // c1   // 1            // c1   // nums.length + 1
        {
            if (nums[i] == val)                 // c2   // 1            // c2   // nums.length
            {
                return i;                       // c3   // 1            // c3   // 0
            }
        }
        return -1;                              // c4   // 0            // c4   // 1
    }

    static int binarySearch(int[] nums, int val)// cost     // times(best-case)     // times(worst)
    {                                                       // 0(1)                 // 0(log(nums.length)
        int start = 0, end = nums.length - 1;   // c1       // 1                    // 1
        int mid;                                // c2       // 1                    // 1

        while (start < end - 1)                 // c3       // 1                    // log(nums.length)
        {
            mid = (start + end) / 2;            // c4       // 1                    // log(nums.length)
            if(val > nums[mid])                 // c5       // 1                    // log(nums.length)
            {
                start = mid + 1;                // c6       // 0                    // 0 ~ log(nums.length)
            } else if (val < nums[mid])         // c7       // 1                    // 0 ~ log(nums.length)
            {
                end = mid - 1;                  // c8       // 0                    // 0 ~ log(nums.length)
            }
            else
            {
                return mid;                     // c9       // 1                    // 0
            }
        }
        return -1;                              // c10      // 0                    // 1
    }
    
    static int[] generateNumbers(int cnt)
    {
        int[] nums2 = new int[cnt];
        for (int i = 0; i < cnt; i++)
        {
            nums2[i] = (int)(Math.random() * 10) + 1;
        }
        return nums2;
    }

    public static void main(String[] args)
    {
//        int[] nums1 = {10, 20, 30};
//        System.out.println(sumArray(nums1));// 60
//        System.out.println(sumArray(new int[]{2, 4, 5, 10}));
//        System.out.println(sumArray(new int[]{}));
//
//        int[] nums2 = new int[]{10, 20, 30, 40};
//        Practice.displayArray(nums2);
//        swapFirstLast(nums2);
//        Practice.displayArray(nums2);
//
//        Practice.displayArray(swapFirstLastNew(nums2));
//        Practice.displayArray(nums2);

//        int[] nums3 = {10, 20, 30, 40};
//        Practice.displayArray(nums3);
//        Practice.displayArray(shiftLeftNew(nums3));
//        Practice.displayArray(nums3);
//        shiftLeft(nums3);
//        Practice.displayArray(nums3);
//        System.out.println(countPositive(nums3));
//        int[] nums4 = {1, 4, 7, 6, 8};
//        Practice.displayArray(shiftRightNew(nums4));
//        Practice.displayArray(nums4);
//        shiftRight(nums4);
//        Practice.displayArray(nums4);
//        System.out.println(findMax(nums4));
//
//        int[] bugNums = {10, 40, 2, 8, 39, 100};
//        Practice.displayArray(bugNums);
//        sort(bugNums);
//        Practice.displayArray(nums5);
//        System.out.println(linearSearch(nums5, 8));
//        System.out.println(linearSearch(nums5, 20));

        int[] bigNums = generateNumbers(100000);
        sort(bigNums);

        long t1 = System.nanoTime();
        System.out.println(linearSearch(bigNums, 13));
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        System.out.println(binarySearch(bigNums, 13));
        long t4 = System.nanoTime();

        System.out.println("linearSearch() takes " + (t2 - t1));
        System.out.println("binarySearch() takes " + (t4 - t3));
    }
}
