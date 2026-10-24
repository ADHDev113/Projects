package apps;

public class MyArray<E>
{
    private E[] elements;
    private int numElements;
    public MyArray()
    {
        elements = (E[])new Object[5];
        numElements = 0;
    }
    public void printArray()
    {
        System.out.printf("printArray(%d,%d): ", numElements, elements.length);
        for (int i = 0; i < numElements; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    private void enlarge()
    {
        E[] nums2 = (E[])new Object[elements.length * 2];
        for (int i = 0; i < numElements; i++)
        {
            nums2[i] = elements[i];
        }
        elements = nums2;
    }
    public void add(E val)
    {
        if(numElements == elements.length)
        {
            enlarge();
        }
        elements[numElements++] = val;
    }
    public void remove(E val)
    {
        int index = search(val);
        if (index != -1)
        {
            elements[index] = elements[numElements - 1];
            numElements--;
        }
    }
    public int search(E val)
    {
        return linearSearch(val);
    }
    private int linearSearch(E val)
    {
        for (int i = 0; i < numElements; i++)
        {
            if (elements[i].equals(val))
            {
                return i;
            }
        }
        return -1;
    }
    private int binarySearch(E val)
    {
        int start = 0, end = numElements - 1;
        int mid;

        while (start < end - 1)
        {
            mid = (start + end) / 2;
            if(((Comparable)val).compareTo(elements[mid]) > 0)
            {
                start = mid + 1;
            } else if (((Comparable)val).compareTo(elements[mid]) < 0)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public E max()
    {
        E max = elements[0];
        for (int i = 1; i < numElements; i++)
        {
            if(((Comparable)elements[i]).compareTo(max) > 0)
            {
                max = elements[i];
            }
        }
        return max;
    }
    public void sort()
    {
        for (int j = 0; j < numElements; j++)
        {
            int minSlot = j;
            for (int i = j + 1; i < numElements; i++)
            {
                if (((Comparable)elements[i]).compareTo(elements[minSlot]) < 0)
                {
                    minSlot = i;
                }
            }
            E temp = elements[j];
            elements[j] = elements[minSlot];
            elements[minSlot] = temp;
        }
    }
}
