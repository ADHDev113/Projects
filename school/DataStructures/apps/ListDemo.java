package apps;

public class ListDemo
{
    static void displayLinkedList(SLLNode<Integer> node)
    {
        while (node != null)
        {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }
    static int sumLinkedList(SLLNode<Integer> node)
    {
        int sum = 0;
        while (node != null)
        {
            sum += node.info;
            node = node.next;
        }
        return sum;
    }
    static SLLNode<Integer> search(SLLNode<Integer> node, int val)
    {
        while (node != null)
        {
            if (node.info == val)
            {
                return node;
            }
            else
            {
                node = node.next;
            }
        }
        return null;
    }
    static void addAtTheEnd(SLLNode<Integer> node, int val)
    {
        SLLNode<Integer> newNode = new SLLNode<>(val);
        while (node.next != null)
        {
            node = node.next;
        }
        node.next = newNode;
    }
    static SLLNode<Integer> generateLinkedList (int a, int b, int c)
    {
        SLLNode<Integer> node1 = new SLLNode<>(a);
        SLLNode<Integer> node2 = new SLLNode<>(b);
        SLLNode<Integer> node3 = new SLLNode<>(c);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }
    static SLLNode<Integer> generateLinkedList(int cnt)
    {
        SLLNode<Integer> tail = new SLLNode<>(1);
        SLLNode<Integer> head = tail;
        for (int i = 2; i <= cnt; i++)
        {
           SLLNode<Integer> newNode = new SLLNode<>(i);
           tail.next = newNode;
           tail = newNode;
        }
        return head;
//        SLLNode<Integer> node1 = new SLLNode<>(1);
//        for (int i = 2; i <= cnt ; i++)
//        {
//            addAtTheEnd(node1, i);
//        }
//        return node1;
    }
    static SLLNode<Integer> generateLinkedList(int[] nums)
    {
        SLLNode<Integer> tail = new SLLNode<>(nums[0]);
        SLLNode<Integer> head = tail;
        for (int i = 1; i < nums.length; i++)
        {
            SLLNode<Integer> newNode = new SLLNode<>(nums[i]);
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    public static void main(String[] args)
    {
        displayLinkedList(generateLinkedList(10, 20, 30));
        displayLinkedList(generateLinkedList(3));
        displayLinkedList(generateLinkedList(5  ));
        displayLinkedList(generateLinkedList(new int[]{10, 2, 4}));
//        SLLNode<Integer> node1 = new SLLNode<>(10);
//        SLLNode<Integer> node2 = new SLLNode<>(20);
//        node1.next = node2;
//        displayLinkedList(node1);
//        SLLNode<Integer> node3 = new SLLNode<>(30);
//        node2.next = node3;
//        displayLinkedList(node1);
//        System.out.println(sumLinkedList(node1));
//        System.out.println(sumLinkedList(node2));
//        System.out.println(sumLinkedList(node3));
//        System.out.println(sumLinkedList(node3.next));
//        System.out.println(search(node1, 20));
//        System.out.println(search(node1, 30));
//        System.out.println(search(node1, 15));
//
//        addAtTheEnd(node1, 40);
//        displayLinkedList(node1);
//        addAtTheEnd(node1, 5);
//        displayLinkedList(node1);
    }
}
