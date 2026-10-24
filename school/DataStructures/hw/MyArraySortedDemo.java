package hw;

public class MyArraySortedDemo {
    public static void main(String[] args) {
        MyArraySorted nums1 = new MyArraySorted();
        nums1.add(30); nums1.add(10); nums1.add(5); nums1.add(20);
        nums1.printArray(); // printArray(4, 5): 5 10 20 30
        nums1.add(2); nums1.add(11);
        nums1.printArray(); // printArray(6, 10): 2 5 10 11 20 30

        System.out.println(nums1.findMax()); // 30
        nums1.remove(10);
        nums1.printArray(); // printArray(5, 10): 2 5 11 20 30
        nums1.remove(15);
        nums1.printArray(); // printArray(5, 10): 2 5 11 20 30
        nums1.remove(30);
        nums1.printArray(); // printArray(4, 10): 2 5 11 20
        System.out.println(nums1.findMax()); // 20

        nums1.add(5); nums1.add(2); nums1.add(20); nums1.add(20);
        nums1.printArray(); // printArray(8, 10): 2 2 5 5 11 20 20 20
        nums1.removeDuplicate();
        nums1.printArray(); // printArray(4, 10): 2 5 11 20
    }
}
