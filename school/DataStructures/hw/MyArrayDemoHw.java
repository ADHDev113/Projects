package hw;

import apps.ArrayDemo;

public class MyArrayDemoHw {

    public static void main(String[] args) {
        // MyArray for Circle
        MyArray<Rectangle> rectangles = new MyArray<>();
        rectangles.add(new Rectangle(5,3));
        rectangles.add(new Rectangle(10,1));
        rectangles.add(new Rectangle(2,8));
        rectangles.add(new Rectangle(5,2.0));
        rectangles.printArray(); // printArray(4,5): Rect(5.0,3.0) Rect(10.0,1.0) Rect(2.0,8.0) Rect(5.0,2.0)
        rectangles.add(new Rectangle(1.5,4));
        rectangles.add(new Rectangle(4,2));
        rectangles.printArray(); // printArray(6,10): Rect(5.0,3.0) Rect(10.0,1.0) Rect(2.0,8.0) Rect(5.0,2.0) Rect(1.5,4.0) Rect(4.0,2.0)
        System.out.println(rectangles.search(new Rectangle(10,1))); // 1
        System.out.println(rectangles.search(new Rectangle(2,5))); // -1
        System.out.println(rectangles.search(new Rectangle(1,10))); // -1
        rectangles.remove(new Rectangle(2,8));
        rectangles.printArray(); // printArray(5,10): Rect(5.0,3.0) Rect(10.0,1.0) Rect(4.0,2.0) Rect(5.0,2.0) Rect(1.5,4.0)
        System.out.println(rectangles.max()); // Rect(10.0,1.0)
        rectangles.sort();
        rectangles.printArray(); // printArray(5,10): Rect(1.5,4.0) Rect(4.0,2.0) Rect(5.0,2.0) Rect(5.0,3.0) Rect(10.0,1.0)

        MyArray<Student> students = new MyArray<>();
        students.add(new Student("Tom",123,"tom123@ucmo.edu"));
        students.add(new Student("Peter",630,"ppp@ucmo.edu"));
        students.add(new Student("Andy",800,"ipark@ucmo.edu"));
        students.add(new Student("Cody",777,"cody@ucmo.edu"));
        students.printArray(); // printArray(4,5): St(Tom,123,tom123@ucmo.edu) St(Peter,630,ppp@ucmo.edu) St(Andy,800,ipark@ucmo.edu) St(Cody,777,cody@ucmo.edu)
        System.out.println(students.search(new Student("ipark@ucmo.edu"))); // 2
        System.out.println(students.search(new Student("ipark@gmail.com"))); // -1
        students.remove(new Student("tom123@ucmo.edu"));
        students.printArray(); // St(Cody,777,cody@ucmo.edu) St(Peter,630,ppp@ucmo.edu) St(Andy,800,ipark@ucmo.edu)
        System.out.println(students.max()); // St(Peter,630,ppp@ucmo.edu)
        students.sort();
        students.printArray(); // St(Cody,777,cody@ucmo.edu) St(Andy,800,ipark@ucmo.edu) St(Peter,630,ppp@ucmo.edu)


    }
}
