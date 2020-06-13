package Sorting;

public class InsertionSort {
    // Sort array
    void sort(int A[]) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            // insert A[j] into the sorted sequence A[1...j-1].
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i -= 1;
            }
            A[i + 1] = key;
        }
    }

    // Print array of size n
    static void printArray(int A[]) {
        for (int item : A) System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = { 31, 41, 59, 26, 61, 58 };
        InsertionSort is = new InsertionSort();
        is.sort(A);

        printArray(A);
    }
}
