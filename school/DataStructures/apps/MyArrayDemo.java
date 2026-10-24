package apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyArrayDemo
{
//    static int[] commonElements(int[] A, int[] B)
//    {
//        int[] output = new int[A.length];
//
//        int j = 0;
//        for (int i = 0; i < A.length; i++)
//        {
//            if (ArrayDemo.linearSearch(B, A[i]) != -1)
//            {
//                output[j++] = A[i];
//            }
//        }
//        return Arrays.copyOf(output, j);
//    }

static int[] commonElements(int[] A, int[] B)
{
    Arrays.sort(B);
    int[] output = new int[A.length];
    int j = 0;
    for (int i = 0; i < A.length; i++)
    {
        if (ArrayDemo.binarySearch(B, A[i]) != -1)
        {
            output[j++] = A[i];
        }
    }
    return Arrays.copyOf(output, j);
}

    public static void main(String[] args)
    {
        int[] nums1 = {20, 15, 3, 30};
        int[] nums2 = {2, 30, 15};
        Practice.displayArray(commonElements(nums1, nums2));
//        MyArrayForInt myNums1 = new MyArrayForInt();
//        MyArray<Integer> myNums1 = new MyArray<>();
//        myNums1.add(10);
//        myNums1.add(20);
//        myNums1.printArray();
//        myNums1.add(5);
//        myNums1.printArray();
//        System.out.println(myNums1.search(10)); // 0
//        System.out.println(myNums1.search(5));  // 2
//        System.out.println(myNums1.search(20)); // 1
//        System.out.println(myNums1.search(3));  // -1
//        myNums1.add(4);
//        myNums1.add(-2);
//        myNums1.add(9);
//        myNums1.printArray();
//        myNums1.remove(20);
//        myNums1.printArray();
//        System.out.println("max: " + myNums1.max());
//        myNums1.sort();
//        myNums1.printArray();
//        System.out.println();
//
////        MyArrayForDouble myNums2 = new MyArrayForDouble();
////        MyArray<Double> myNums2 = new MyArray<>();
//        ArrayList<Double> myNums2 = new ArrayList<>();
//        myNums2.add(3.14);
//        myNums2.add(2.5);
//        myNums2.add(10.0);
////        myNums2.printArray();
//        System.out.println(myNums2);
////        System.out.println(myNums2.search(2.5));
////        System.out.println(myNums2.search(1.5));
//        System.out.println(myNums2.indexOf(2.5));
//        System.out.println(myNums2.indexOf(1.5));
//        myNums2.remove(3.14);
////        myNums2.printArray();
//        System.out.println(myNums2);
////        System.out.println(myNums2.max());
//        System.out.println(Collections.max(myNums2));
////        myNums2.sort();
//        Collections.sort(myNums2);
////        myNums2.printArray();
//        System.out.println(myNums2);
//        System.out.println();
//
////        MyArrayForString names = new MyArrayForString();
//        MyArray<String> names = new MyArray<>();
//        names.add("Tom");
//        names.add("Andy");
//        names.add("Nicole");
//        names.printArray();
//        System.out.println(names.search("Andy"));
//        System.out.println(names.search("John"));
//        names.remove("Tom");
//        names.printArray();
//        System.out.println(names.max());
//        names.sort();
//        names.printArray();
//
//        //Test Circle class in MyArray, ArrayList
//        MyArray<Circle> circles = new MyArray<>();
//        circles.add(new Circle(2));
//        circles.add(new Circle(1));
//        circles.add(new Circle(3.5));
//        circles.printArray();
//        System.out.println(circles.search(new Circle(2))); // 0
//        System.out.println(circles.search(new Circle(10))); // -1
//        circles.remove(new Circle(2));
//        circles.printArray();
//        System.out.println(circles.max());
//        circles.sort();
//        circles.printArray();
//        System.out.println();
//
//        MyArray<Student> students = new MyArray<>();
//        students.add(new Student("Tom", 123, "tom123@ucmo.edu"));
//        students.add(new Student("Andy", 907, "aipark@ucmo.edu"));
//        students.add(new Student("Tom", 900, "bigtom@ucmo.edu"));
//        students.printArray();
//        System.out.println(students.search(new Student(123)));
//        students.remove(new Student(123));
//        students.printArray();
//        System.out.println(students.max());
//        students.sort();
//        students.printArray();
    }
}
