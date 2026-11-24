import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // TODO: Find the pivot index after partitioning
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
            // TODO: Recursively sort the left and right subarrays
        }
    }

        // Partition method that rearranges elements and returns the pivot index
        public static int partition(int[] arr, int low, int high) {
            // TODO: Choose a pivot (usually the last element)
            int temp;
            int pivot = arr[high];
            // TODO: Initialize index i to track smaller-than-pivot region
            int i = low - 1;
            // TODO: Loop over the array from low to high - 1
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            // If arr[j] < pivot:
            //     increment i
            //     swap arr[i] and arr[j]

            // TODO: After the loop, swap pivot into the correct place
            return i + 1;
            // TODO: Return the index of the pivot
            // placeholder
        }




        public static void main (String[] args) {
            int[] arr = {6, 3, 8, 4, 7, 2, 5};
            System.out.println("Original array: " + Arrays.toString(arr));

            quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array:   " + Arrays.toString(arr));
        }

        // Recursive quick sort method
