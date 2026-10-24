package apps;

public class MyLinkedList<E>
{
    SLLNode<E> head = null;
    void printLinkedList()
    {
        SLLNode<E> node = head;
        while (node != null)
        {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }
    void add(E val)
    {
        SLLNode<E> node = new SLLNode<>(val);
        node.next = head;
        head = node;
    }
    SLLNode<E> search(E val)
    {
        // returns the node whose value is equal to val
        // Return null if val is not found
        return null;
    }
    void remove(E val)
    {

    }
    int size()
    {
        // Return the number of elements in list
        return 0;
    }
    E[] toArray()
    {
        // Create and return a new array of the elements in the list
        E[] newArr = (E[])new Object[size()];
        // Add your work
        return newArr;
    }
}
