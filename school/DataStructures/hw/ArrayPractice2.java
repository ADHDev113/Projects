package hw;

public class ArrayPractice2 {
    static void displayArray(int[] nums) {
        // This function is complete. Here to help your test
        for(int i=0; i<nums.length;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    static double median(int[] nums)
    {
        double med;
        int mid = nums.length / 2;
        // Assume that the array is sorted and not empty.
        // Return the median value (located in the middle).
        // If there are even numbers of elements, the average of the two elements in the middle is the median (possibly a decimal number)
        // eg) median([1, 2, 3]) returns 2.0
        // eg) median([1, 4, 6, 10]) returns 5.0
        // eg) median([1, 2, 4, 5, 8, 10]) returns 4.5
        if (nums.length % 2 == 0)
        {
            med = (double)(nums[mid - 1] + nums[mid]) / 2;
        }
        else
        {
            med = nums[mid];
        }

        return med;
    }
    static int[] getExceptFirstLast(int[] nums){
        // Return a new array that contains all the elements of nums except the first and last one.
        // Assume the input array has at least two elements.
        // eg) getExceptFirstLast({10,20,30,40}) returns {20, 30}

        int[] nums2 = new int[nums.length - 2];

        for (int i = 0; i < nums2.length; i++)
        {
            nums2[i] = nums[i + 1];
        }

        return nums2; // this is here to avoid syntax error. Feel free to change.
    }
    static boolean isSorted(int[] nums){
        // Return true if the array is sorted in ascending (to be exact, non-descending)
        // eg) isSorted({1, 5, 5, 7}) returns true
        // eg) isSorted({1, 5, 3, 7}) returns false

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
            {
                return false;
            }
        }

        return true;
    }
    static int[] addFirst(int[] nums, int val) {
        // Return a new array that includes all the elements of nums and a new element val at the beginning.
        // Let nums = {10, 20}, append(nums, 5) returns a new array {5, 10, 20}

        int[] nums2 = new int[nums.length + 1];
        nums2[0] = val;

        for (int i = 0; i < nums.length; i++)
        {
            nums2[i + 1] = nums[i];
        }

        return nums2; // this is here to avoid syntax error. Feel free to change.
    }

    static int[] reverse(int[] nums){
        // Return a new array that contains all the element of nums but in reverse order.
        // eg) reverse({10,20,30,40}) returns {40,30,20,10}

        int[] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            nums2[i] = nums[nums.length - 1 - i];
        }

        return nums2; // this is here to avoid syntax error. Feel free to change.
    }

    static int[] removeRange(int[] nums, int start, int end) {
        // Return a new int array that has all the elements from nums except the ones between start and end.
        // Assume that the index start and end are valid and start <= end.
        // How many elements are removed? Need this expression using the given parameters start and end
        // eg)	Let nums = {10, 20, 30, 40, 50},
        //      removeRange(nums,2,2) will return {10, 20, 40, 50}
        //      removeRange(nums,1,3) will return {10, 50}

        int[] nums2 = new int[nums.length - (end - start) - 1];
        int index = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (start > i || i > end)
            {
                nums2[index] = nums[i];
                index++;
            }
        }

        return nums2; // this is here to avoid syntax error. Feel free to change.
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {10,20,30,40,50,60};

        System.out.println("testing median()");
        System.out.println(median(new int[]{10,20,30})); // 20.0
        System.out.println(median(new int[]{1,4,7,10})); // 5.5
        System.out.println(median(nums1)); // 35.0

        System.out.println("testing getExceptFirstLast()");
        displayArray(getExceptFirstLast(new int[]{10,20,30})); // 20
        displayArray(getExceptFirstLast(new int[]{10,20})); // (empty array. blank line)
        displayArray(getExceptFirstLast(nums1)); // 20 30 40 50

        System.out.println("testing isSorted()");
        System.out.println(isSorted(nums1)); // true
        System.out.println(isSorted(new int[]{10,-20,30,0,5})); // false
        System.out.println(isSorted(new int[]{-2,-1,0})); // true
        System.out.println(isSorted(new int[]{-2,-2, -1,0})); // true

        System.out.println("testing addFirst()");
        displayArray(addFirst(new int[]{10,20,30},-10)); // -10 10 20 30
        displayArray(addFirst(new int[]{5},-10)); // -10 5
        displayArray(addFirst(nums1, -10)); // -10 10 20 30 40 50 60

        System.out.println("testing reverse()");
        displayArray(reverse(nums1)); // 60 50 40 30 20 10
        displayArray(reverse(new int[]{-1, 0})); // 0 -1
        displayArray(reverse(new int[]{1, 2, 5, 5, 4})); // 4 5 5 2 1

        System.out.println("testing removeRange()");
        displayArray(removeRange(nums1,1,4)); // 10 60
        displayArray(removeRange(nums1,3,5)); // 10 20 30
        displayArray(removeRange(nums1,2,2)); // 10 20 40 50 60
    }
}
