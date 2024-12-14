package olga.queue.classActivity1B;

public class PriorityQueueEx {

   // Declares a static integer array heap with a size of 40 -- assuming we will not exceed the fixed size of the array.
   // This array is used to store the elements of the heap.
    private static int[] heap = new int[40];

    //The size variable keeps track of the number of elements in the heap.
    // It is initialized to -1 since the heap starts empty.
    private static int size = -1;

    // Retrieving the parent node of the child node
//    The parent method calculates the index of the parent node for a given child node i. In a binary heap:
//    Parent of index i is at (i - 1) / 2.

//        Input: i — the index of a child node in the array.
//        Output: The index of the parent node.
    public static int parent(int i) {
        return (i - 1) / 2;

       // The logic works as follows:

//        i - 1: Since arrays are zero-indexed, subtracting 1 adjusts the index to account for this.
//            2: Dividing by 2 gives the index of the parent node because, in a binary tree,
//               each parent node can have two children. Integer division truncates the result
//               to ensure the index is correct.


    }

    // Retrieving the left child of the parent node
//    The leftChild method calculates the index of the left child of a node i:
//    Left child is at 2 * i + 1.
    public static int leftChild(int i) {
        return (2 * i) + 1;
    }

    // Retrieving the right child of the parent node
//    The rightChild method calculates the index of the right child of a node i:
//    Right child is at 2 * i + 2.
    public static int rightChild(int i) {
        return (2 * i) + 2;
    }

    // Returning the element with the highest priority
    //Returns the maximum value in the heap, which is always at index 0 (the root) in a max-heap.

    public static int getMax() {
        return heap[0];
    }

    // Returning the element with the lowest priority
   // Returns the minimum value in the heap,
    // which is assumed to be at the last position (smallest element after heap inserts).
    public static int getMin() {
        return heap[size];
    }

    // Function to move the node up the tree to restore the heap property
//    This loop moves a node up the tree to maintain the max-heap property:
//    The node i is compared with its parent. If the parent's value is smaller, they are swapped.
    public static void moveUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            // Swap parent and current node
            int temp = heap[parent(i)];
            heap[parent(i)] = heap[i];
            heap[i] = temp;

            // Move i to the parent
           // After the swap, i is updated to its parent's
            // index to continue checking higher levels of the tree.
            i = parent(i);
        }
    }

    // Function to move the node down the tree to restore the heap property
    public static void moveDown(int k) {
        int index = k;
        int left = leftChild(k);
        int right = rightChild(k);

        // Find the largest among parent, left, and right
        if (left <= size && heap[left] > heap[index]) {
            index = left;
        }
        if (right <= size && heap[right] > heap[index]) {
            index = right;
        }

        // If the largest is not the current node
        if (index != k) {
            int temp = heap[k];
            heap[k] = heap[index];
            heap[index] = temp;

            // Recursively move down
            moveDown(index);
        }
    }

    // Removing the element with the highest priority
    public static void removeMax() {
        if (size < 0) return;

        heap[0] = heap[size];
        size--;
        moveDown(0);
    }

    // Inserting an element into the priority queue
    public static void insert(int p) {
        size++;
        heap[size] = p;
        moveUp(size);
    }


    // Removing the element from the priority queue at a given index
    public static void delete(int i) {
        heap[i] = heap[0] + 1; // Assign a value greater than the current max
        moveUp(i); // Move the value to the root
        removeMax(); // Remove the root
    }

    public static void main(String[] args) {
        // Insert elements into the priority queue
        insert(20);
        insert(19);
        insert(21);
        insert(18);
        insert(12);
        insert(17);
        insert(15);
        insert(16);
        insert(14);

        // Display elements in the priority queue
        System.out.print("Elements in the priority queue are: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }


        // Delete an element at index 2

        delete(2);

        // Display elements after deletion
        System.out.print("\nElements in the priority queue after deleting the element are: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }

        int max = getMax();
        System.out.println("\nThe element with the highest priority is: " + max);

        int min = getMin();
        System.out.println("The element with the lowest priority is: " + min);
    }
}
