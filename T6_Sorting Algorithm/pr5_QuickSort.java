package Sorting;

public class pr5_QuickSort {

    //swap function
    static void swap(int [] arr,int a ,int b){

    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;

    }

    static int partation(int [] arr,int start ,int end){
        //taking the last element as the pivot index
        int pivot = arr[end];
        int pivotIndex = start-1;//actual logic
        
        for(int i = start;i<end; i++){
            if(arr[i]<pivot){
                pivotIndex++;

                //calling to the swap function
                swap(arr, i, pivotIndex);

                // int temp = arr[i];
                // arr[i] = arr[pivotIndex];
                // arr[pivotIndex] = temp;

            }
        }
        pivotIndex++;

        //calling the swap function
        swap(arr, pivotIndex, end);

        // int temp = arr[pivotIndex];
        // arr[pivotIndex] =  arr[end];
        // arr[end] = temp;

        return pivotIndex;
    }

     static void quickSort(int [] arr,int start ,int end){
        ///Base Condition
        if(start>= end){
            return;
        }

        int pivotIndex = partation(arr,start ,end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
;
    }
    public static void main(String[] args) {

        int arr[] = new int[] { 8, 4, 11, 2, 3, 7, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, (arr.length-1) );
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
    
}
