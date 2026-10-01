package hw;

public class ArrayPractice1 {
    static void displayArray(int[] nums) {
        // This function is complete. Here to help your test
        for(int i=0; i<nums.length;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    static int[] getFirstLast(int[] nums){
        // Return a new array of size two that has the first and last element of the input array nums.
        // Assume the input array has at least two elements.
        // getFirstLast({10,20,30,40}) returns {10, 40}
        int[] array = {nums[0], nums[nums.length - 1]};
        return array;

    }
    static int[] copyArray(int[] nums){
        // Return a new array that contains all the elements of the input array.
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            array[i] = nums[i];
        }
        return array;
    }
    static int[] getFirstN(int[] nums, int n){
        // Return a new array that conatins the first n elements of the input array
        // eg) getFirstN({1,5,3,7}, 2) returns {1, 5}
        // eg) getFirstN({1,5,3,7}, 3) returns {1, 5, 3}
        // Return an empty array if n <= 0
        // Return a new array of all the elements if n >= nums.length.
        int[] array;
        if (n <= 0)
        {
            array = new int[]{};
        }
        else if (n > nums.length)
        {
            array = new int[nums.length];
            for (int i = 0; i < nums.length; i++)
            {
                array[i] = nums[i];
            }
        }
        else
        {
            array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = nums[i];
            }
        }
        return array;
    }
    static int[] addAtTheEnd(int[] nums, int val) { // 0(nums.length)
        // Return a new array that includes all the elements of nums and a new element val at the end.
        // Let nums = {10, 20}, append(nums, 5) returns a new array {5, 10, 20}
        int[] array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
        {
            array[i] = nums[i];
        }
        array[nums.length] = val;
        return array;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {10,20,30,40,50,60};

        System.out.println("testing getFirstLast()");
        displayArray(getFirstLast(new int[]{10,20,30})); // 10 30
        displayArray(getFirstLast(nums1)); // 10 60

        System.out.println("testing copyArray()");
        int[] nums2 = copyArray(nums1);
        displayArray(nums2); // 10 20 30 40 50 60
        nums2[0] = 99; // change in nums2. should not change nums1.
        displayArray(nums2); // 99 20 30 40 50 60
        displayArray(nums1); // 10 20 30 40 50 60

        System.out.println("testing getFirstN()");
        displayArray(getFirstN(nums1, 2)); // 10 20
        displayArray(getFirstN(nums1, 3)); // 10 20 30
        displayArray(getFirstN(new int[]{-5,-4}, 3)); // -5 -4
        displayArray(getFirstN(new int[]{-5,-4}, -1)); // (blank line)

        System.out.println("testing addAtTheEnd()");
        displayArray(addAtTheEnd(nums1, 11)); // 10 20 30 40 50 60 11
        displayArray(addAtTheEnd(addAtTheEnd(nums1,-1), -2)); // 10 20 30 40 50 60 -1 -2
    }
}
