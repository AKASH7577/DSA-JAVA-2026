package Sorting;

class pr3_insertioSort_swap {

    static void insertionSortSwap(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j =i;

            while (j >0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 8, 4, 1, 3, 6, 2 };

        System.out.println("Before insertion Sort Using swap:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSortSwap(arr);

        System.out.println("\n\n After insertion Sort using swap:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}