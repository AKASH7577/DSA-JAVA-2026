package Sorting;

public class pr2_bubbleSort {

    static void pr2_bubbleSort(int[] arr) {
        boolean swapped; 

        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 8, 4, 1, 3, 6, 2 };

        System.out.println("Before Bubble Sort:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        pr2_bubbleSort(arr);

         System.out.println("\n\nAfter Bubble Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}