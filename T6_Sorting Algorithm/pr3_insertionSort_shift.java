package Sorting;

 class pr3_insertioSort_shift {

    static void insertionSortShift(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            
            while (j>=0 && arr[j]>key) {

                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;

           
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 8, 4, 1, 3, 6, 2 };

        System.out.println("Before insertion Sort:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSortShift(arr);

        System.out.println("\n\n After insertion Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}