package hw;

public class MyArraySorted {
    int[] elements;
    int numElements;
    public MyArraySorted(){
        elements = new int[5];
        numElements = 0;
    }
    void printArray(){
        System.out.printf("printArray(%d, %d): ", numElements, elements.length);
        for(int i=0; i<numElements ; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    private void enlarge(){
        int[] newArr = new int[elements.length * 2];
        for(int i=0; i< numElements; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }
    void add(int val){ // Time complexity O(numElements) is required.
        // Make change to the array and add val to the array at the end.
        // Note that the existing elements are already sorted.
        // Insert val into the right place to keep all the elements sorted.
        // Hint:
        // - The elements greater than val should be shifted to the right before insertion.
        // - Start from the right most element.
        if (numElements + 1 > elements.length)
        {
            enlarge();
        }
        if (numElements == 0)
        {
            elements[0] = val;
        }
        else if (val > elements[numElements - 1])
        {
            elements[numElements] = val;
        }
        else
        {
            for (int i = numElements - 1; i >= 0; i--)
            {
                if (elements[i] >= val)
                {
                    elements[i + 1] = elements[i];
                    elements[i] = val;
                }
            }
        }
        numElements++;
    }
    int search(int val){ // Time complexity O(log(numElements)) is required.
       return binarySearch(val);
    }
    private int linearSearch(int val){
        for(int i=0; i<numElements; i++)
            if(elements[i] == val)
                return i;
        // val is not found
        return -1;
    }
    private int binarySearch(int val){
        int start = 0;
        int end = numElements -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(val < elements[mid])
                end = mid - 1;
            else if(val > elements[mid])
                start = mid + 1;
            else // val == elements[mid]
                return mid;
        }
        // val is not found
        return -1;
    }
    void remove(int val){ // Time complexity O(numElements) is required.
        // Make change to the array.
        // Remove one element equal to val.
        // Make sure to keep the elements sorted after removal.
        // Hint: The elements to the right side of the removed element should be shifted to the left.

        int index = search(val);
        if(index == -1)
        {
            return;
        }
        for (int i = index; i < numElements - 1; i++)
        {
            elements[i] = elements[i + 1];
        }
        numElements--;
    }
    int findMax(){ // Time complexity O(1) is required.
        // return the maximum element in the array
        // Assume there is at least one element
        // This is easy

        return elements[numElements - 1];
    }
    void removeDuplicate(){ // Time complexity O(numElements) is required.
        // Make change to the array and remove duplicates.
        // eg) {10 10 20 20 20 30} --> {10, 20, 30}
        // Hint:
        // - Elements of the same value are located next to each other.
        // - Using two indice - one for reading, the other for writing would be useful.

        int i = 0;
        while (i < numElements - 1)
        {
            if (elements[i] == elements[i + 1])
            {
                remove(elements[i]);
            }
            else
            {
                i++;
            }
        }


    }
}
