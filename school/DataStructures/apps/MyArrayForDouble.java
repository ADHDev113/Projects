package apps;

public class MyArrayForDouble
{
    private double[] elements;
    private int numElements;
    public MyArrayForDouble()
    {
        elements = new double[5];
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
        double[] nums2 = new double[elements.length * 2];
        for (int i = 0; i < numElements; i++)
        {
            nums2[i] = elements[i];
        }
        elements = nums2;
    }
    public void add(double val)
    {
        if(numElements == elements.length)
        {
            enlarge();
        }
        elements[numElements++] = val;
    }
    public void remove(double val)
    {
        int index = search(val);
        if (index != -1)
        {
            elements[index] = elements[numElements - 1];
            numElements--;
        }
    }
    public int search(double val)
    {
        return linearSearch(val);
    }
    private int linearSearch(double val)
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
    private int binarySearch(double val)
    {
        int start = 0, end = numElements - 1;
        int mid;

        while (start < end - 1)
        {
            mid = (start + end) / 2;
            if(val > elements[mid])
            {
                start = mid + 1;
            } else if (val < elements[mid])
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
    public double max()
    {
        double max = elements[0];
        for (int i = 1; i < numElements; i++)
        {
            if(elements[i] > max)
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
                if (elements[i] < elements[minSlot])
                {
                    minSlot = i;
                }
            }
            double temp = elements[j];
            elements[j] = elements[minSlot];
            elements[minSlot] = temp;
        }
    }
}
