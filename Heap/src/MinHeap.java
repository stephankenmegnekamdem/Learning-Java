import java.util.Arrays;
import java.util.Scanner;


public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
    }

    // Insert a new value
    public void insert(int value) {
        ensureCapacity();
        heap[size] = value;
        int current = size;
        size++;

        // Bubble up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    // Search for an element and return its index, or -1 if not found
    public int search(int value) {
        for (int j = 0; j < capacity; j++) {
            if (heap[j] == value) {
                return j; // Found at index j
            }
        }
        return -1; // Not found
    }

    // Extract the root (minimum element)
    public int deleteRoot() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    // Heapify down from index i
    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Sort the heap (Heap Sort)
    public int[] heapSort() {
        int[] sorted = new int[size];
        int originalSize = size;
        for (int i = 0; i < originalSize; i++) {
            sorted[i] = deleteRoot();
        }
        return sorted;
    }



    public void printHeap() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOfRange(heap, 0, size)));

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the heap");
        int N = in.nextInt();
        MinHeap heap = new MinHeap(N);
        System.out.println("Enter the elements of the heap");
        int[] elements = new int[N];
        for (int k = 0; k < N; k++) {
            elements[k] = in.nextInt();
        }

        for (int elem : elements) {
            heap.insert(elem);
        }

        heap.printHeap();
        System.out.println("Press 0 if you want to delete the root element");
        int del= in.nextInt();
        if (del == 0) {
            System.out.println("Deleted root: " + heap.deleteRoot());
        }
        heap.printHeap();

        int[] sorted = heap.heapSort();
        System.out.println("Sorted elements: " + Arrays.toString(sorted));

        System.out.println("Enter the element to be searched");
        int target = in.nextInt();
        int index = heap.search(target);
        if (index != (-1)) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in heap.");
        }

    }
}

//🔁 To use a Max-Heap instead:
//Just modify comparisons:
//
//In insert(): change heap[current] < heap[parent(current)] to heap[current] > heap[parent(current)]
//In heapify(): switch < comparisons to >