package apps;

public class MyArrayDemo
{
    public static void main(String[] args)
    {
//        MyArrayForInt myNums1 = new MyArrayForInt();
        MyArray<Integer> myNums1 = new MyArray<>();
        myNums1.add(10);
        myNums1.add(20);
        myNums1.printArray();
        myNums1.add(5);
        myNums1.printArray();
        System.out.println(myNums1.search(10)); // 0
        System.out.println(myNums1.search(5));  // 2
        System.out.println(myNums1.search(20)); // 1
        System.out.println(myNums1.search(3));  // -1
        myNums1.add(4);
        myNums1.add(-2);
        myNums1.add(9);
        myNums1.printArray();
        myNums1.remove(20);
        myNums1.printArray();
        System.out.println("max: " + myNums1.max());
        myNums1.sort();
        myNums1.printArray();

//        MyArrayForDouble myNums2 = new MyArrayForDouble();
        MyArray<Double> myNums2 = new MyArray<>();
        myNums2.add(3.14);
        myNums2.add(2.5);
        myNums2.add(10.0);
        myNums2.printArray();
        System.out.println(myNums2.search(2.5));
        System.out.println(myNums2.search(1.5));
        myNums2.remove(3.14);
        myNums2.printArray();
        System.out.println(myNums2.max());
        myNums2.sort();
        myNums2.printArray();

//        MyArrayForString names = new MyArrayForString();
        MyArray<String> names = new MyArray<>();
        names.add("Tom");
        names.add("Andy");
        names.add("Nicole");
        names.printArray();
        System.out.println(names.search("Andy"));
        System.out.println(names.search("John"));
        names.remove("Tom");
        names.printArray();
        System.out.println(names.max());
        names.sort();
        names.printArray();


    }
}
