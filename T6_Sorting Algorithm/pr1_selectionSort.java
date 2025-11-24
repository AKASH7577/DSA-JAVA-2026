package Sorting;

public class pr1_selectionSort {
    static void selectionSort(int [] arr){
        for(int i =0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
        //swapping
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;

        }
    
    }
    public static void main(String[] args) {
        int arr [] = {7,9,8 ,4,1,3,6,2};
        System.out.println("Before Selcetion sort\n");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println("After Selection sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    
}
