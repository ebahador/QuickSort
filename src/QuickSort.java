class QuickSort {

    /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    private int partition(int array[], int lowNumber, int highNumber) {
        int i, j, pivot, temp;
        pivot = array[highNumber];
        i = (lowNumber - 1); // index of smaller element
        for (j = lowNumber; j < highNumber; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot) {
                i++;

                // swap array[i] and array[j]
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[highNumber] (or pivot)
        temp = array[i + 1];
        array[i + 1] = array[highNumber];
        array[highNumber] = temp;
        return i + 1;
    }

    /* The main function that implements QuickSort()
    array[] --> Array to be sorted,
    lowNumber --> Starting index,
    highNumber --> Ending index */
    void sort(int array[], int lowNumber, int highNumber) {
        if (lowNumber < highNumber) {
			/* pi is partitioning index, array[pi] is
			now at right place */
            int pi = partition(array, lowNumber, highNumber);

            // Recursively sort elements before
            // partition and after partition
            sort(array, lowNumber, pi - 1);
            sort(array, pi + 1, highNumber);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        for (int anArr : arr) System.out.print(anArr + " ");
        System.out.println();
    }
    //for understanding who is works, see "src --> QuickSort.png"
}