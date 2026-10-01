package apps;

public class MyArrayForString
{
    private String[] elements;
    private int numElements;
    public MyArrayForString()
    {
        elements = new String[5];
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
        String[] nums2 = new String[elements.length * 2];
        for (int i = 0; i < numElements; i++)
        {
            nums2[i] = elements[i];
        }
        elements = nums2;
    }
    public void add(String val)
    {
        if(numElements == elements.length)
        {
            enlarge();
        }
        elements[numElements++] = val;
    }
    public void remove(String val)
    {
        int index = search(val);
        if (index != -1)
        {
            elements[index] = elements[numElements - 1];
            numElements--;
        }
    }
    public int search(String val)
    {
        return linearSearch(val);
    }
    private int linearSearch(String val)
    {
        for (int i = 0; i < numElements; i++)
        {
            if (elements[i] == val)
            {
                return i;
            }
        }
        return -1;
    }
    private int binarySearch(String val)
    {
        int start = 0, end = numElements - 1;
        int mid;

        while (start < end - 1)
        {
            mid = (start + end) / 2;
            if(val.compareTo(elements[mid]) > 0)
            {
                start = mid + 1;
            } else if (val.compareTo(elements[mid]) < 0)
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
    public String max()
    {
        String max = elements[0];
        for (int i = 1; i < numElements; i++)
        {
            if(elements[i].compareTo(max) > 0)
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
                if (elements[i].compareTo(elements[minSlot]) < 0)
                {
                    minSlot = i;
                }
            }
            String temp = elements[j];
            elements[j] = elements[minSlot];
            elements[minSlot] = temp;
        }
    }
}
