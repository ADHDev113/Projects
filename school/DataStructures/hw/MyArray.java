package hw;

public class MyArray<E> {
    private E[] elements;
    private int numElements;
    public MyArray(){
        elements = (E[])new Object[5];
        numElements = 0;
    }
    public void printArray(){
        System.out.printf("printArray(%d,%d): ", numElements, elements.length);
        for(int i=0; i<numElements; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }
    private void enlarge(){
        E[] nums2 = (E[]) new Object[elements.length * 2];
        for(int i=0; i<numElements;i++)
            nums2[i] = elements[i];
        elements = nums2;
    }
    public void add(E val){
        if(numElements == elements.length) // array is full
            enlarge();
        elements[numElements++] = val;
    }
    public void remove(E val){
        int idx = search(val);
        if(idx >= 0){
            // fill the position with the last element
            // cut out the last element
            elements[idx] = elements[--numElements];
//            numElements--;
        }
    }
    public int search(E val){
        // returns the index of the element equal to val
        // return -1 if val is not found.
        // linearSearch() if not sorted, binarySearch() if sorted
        return linearSearch(val);
    }
    private int linearSearch(E val){
        for(int i=0; i<numElements;i++)
            if(elements[i].equals(val))
                return i;
        // val is not found
        return -1;
    }
    private int binarySearch(E val){
        int start = 0, end = numElements-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(((Comparable)val).compareTo(elements[mid]) > 0) //if(val > elements[mid])
                start = mid + 1;
            else if(((Comparable)val).compareTo(elements[mid]) < 0) // if(val < elements[mid])
                end = mid - 1;
            else // val == elements[mid]
                return mid;
        }
        return -1;
    }
    public E max(){
        // return the maximum element.
        // Assume that the array is not empty
        E maxV = elements[0];
        for(int i=1; i<numElements; i++)
            if(((Comparable)elements[i]).compareTo(maxV) > 0) //if(elements[i] > maxV)
                maxV = elements[i];
        return maxV;
    }
    public void sort(){
        // Make changes to elements so that the elements are sorted in non-descending order
        int minIdx;
        E t;
        for(int j=0; j<numElements;j++){
            minIdx = j;
            for(int i=j+1; i<numElements;i++)
                if(((Comparable)elements[i]).compareTo(elements[minIdx]) < 0) // if(elements[i] < elements[minIdx])
                    minIdx = i;
            t = elements[j];
            elements[j] = elements[minIdx];
            elements[minIdx] = t;
        }
    }
}
