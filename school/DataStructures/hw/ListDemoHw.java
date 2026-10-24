package hw;

public class ListDemoHw {
    public static void displayLinkedList(SLLNode<Integer> node) {
        // display all elements in the linked list. This is complete. Provided for testing.
        while(node != null) {
            System.out.print(node.info + " ");
            node = node.next; // move to the next node
        }
        System.out.println();
    }
    static SLLNode<Integer> generateLinkedList(int[] nums){
        if(nums == null)
            return null;
        // Create and return a new linked list with an array. This is complete. Provided for testing.
        SLLNode<Integer> head = new SLLNode<>(nums[nums.length-1]);
        for(int i=nums.length-2; i>=0; i--){
            SLLNode<Integer> newNode = new SLLNode<>(nums[i]);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    static SLLNode<Integer> generateLL_sorted(int a, int b) {
        // Create/return a new linked list that has the two integers in ascending order
        // eg) generateLL2(10,20) returns a list {10,20}
        // eg) generateLL2(20,10) also returns a list {10,20}
        if (a < b)
        {
            SLLNode<Integer> node = new SLLNode<>(a);
            node.next = new SLLNode(b);
            return node;
        }
        else
        {
            SLLNode<Integer> node = new SLLNode<>(b);
            node.next = new SLLNode(a);
            return node;
        }
    }
    static SLLNode<Integer> cons(int a, SLLNode<Integer> ls) {
        // Given an integer value and a linked list,
        // Return the linked list after adding the integer at the beginning.
        // eg) Suppose ls1={1,2,3}, cons(10, ls1) returns the added list {10, 1, 2, 3}
        SLLNode<Integer> newNode = new SLLNode<>(a);
        newNode.next = ls;
        return newNode;
    }
    static SLLNode<Integer> cdr(SLLNode<Integer> ls) {
        // Given a non-empty linked list, return the lnked list excluding the first element.
        // eg) Suppose ls1={1,2,3}, cdr(ls1) skps the first element and returns the rest of list {2, 3}
        // eg) Suppose ls1={1}, cdr(ls1) skips 1 and returns null
        return ls.next;
    }
    static SLLNode<Integer> getTail(SLLNode<Integer> ls){
        // Return the last node of the list.
        // Return null if the list is empty.
        SLLNode<Integer> node = ls;
        while (node.next != null)
        {
            node = node.next;
        }
        return node;
    }
    static void attach(SLLNode<Integer> ls1, SLLNode<Integer> ls2) {
        // Given two linked lists, attach the second list at the end of the first list
        // eg) Suppose ls1={1,2,3}, ls2={50,60} as lists, attach(ls1, ls2) makes ls1 = {1,2,3,50,60}
        // Assume ls1 is not empty.
        // Hint: You need to go to the last node of ls1 and make a connection from it to the ls2
        SLLNode<Integer> tail = ls1;
        while (tail.next != null)
        {
            tail = tail.next;
        }
        tail.next = ls2;
    }
    static boolean isSorted(SLLNode<Integer> node) {
        // Return true if the linked list is sorted in non-descending order.
        // Return false otherwise.
        // eg) Let list be 10->30->25->40, isSorted(list) returns false
        // eg) Let list be 10->10->20, isSorted(list) returns true
        // eg) Let list be 10, isSorted(list) returns true
        // Return true if the list is empty.
        // HINT: if node.next is not null, you can use node.next.info
        if (node == null)
        {
            return true;
        }
        else
        {
            SLLNode<Integer> currentNode = node;
            while (currentNode.next != null)
            {
                if ((int) currentNode.next.info < currentNode.info)
                {
                    return false;
                }
                currentNode = currentNode.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        displayLinkedList(generateLL_sorted(3, 2)); // 2 3
        SLLNode<Integer> ls1 = generateLL_sorted(10, 20);
        displayLinkedList(ls1); // 10 20

        ls1 = cons(30, ls1);
        displayLinkedList(ls1); // 30 10 20
        displayLinkedList(cons(-5,null)); // -5
        displayLinkedList(cons(-10, cons(-5,null))); // -10 -5

        displayLinkedList(cdr(ls1)); // 10 20
        displayLinkedList(cdr(cdr(ls1))); // 20
        displayLinkedList(cdr(cdr(cdr(ls1)))); // (blank line)

        SLLNode<Integer> ls2 = generateLinkedList(new int[] {2,3,4,5});

        System.out.println(getTail(ls1)); // SLLNode(20)
        System.out.println(getTail(ls2)); // SLLNode(5)

        attach(ls1,ls2); displayLinkedList(ls1); // 30 10 20 2 3 4 5
        attach(ls1,generateLL_sorted(-1,-2)); displayLinkedList(ls1); // 30 10 20 2 3 4 5 -2 -1

        System.out.println(isSorted(generateLinkedList(new int[]{-2,0,1}))); // true
        System.out.println(isSorted(generateLinkedList(new int[]{10}))); // true
        System.out.println(isSorted(generateLinkedList(null))); // true
        System.out.println(isSorted(generateLinkedList(new int[]{10,20,1}))); // false
        System.out.println(isSorted(generateLinkedList(new int[]{10,1,20}))); // false
    }
}
