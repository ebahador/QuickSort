public class Main {
    public static void main(String[] args) {
        int array[] = {7, 4, 9, 1, 5, 3, 2, 6, 8}, n = array.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, n - 1);
        System.out.println("sorted array");
        QuickSort.printArray(array);
    }
}