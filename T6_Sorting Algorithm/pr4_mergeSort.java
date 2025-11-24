package Sorting;

public class pr4_mergeSort {

    static void merge(int [] arr,int start ,int mid,int end){

        //left and right array size
        int n1 = mid-start+1;
        int n2 = end-mid;

        //creating the new left and right array 
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        //copy the array element to the left arr
        for(int i = 0; i<n1; i++){
            leftArr[i] = arr[start+i];

        }
        // copy the array element to the right arr
        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid+1+i];

        }

        int i =0,j=0,k=start; 
        //comparing the the both array then then place it new index
        while(i<n1 && j<n2){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;

        }
        //copy the  remaing elmwnt of the left array to the array
        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        //copy the remaining  element of the right array to the array
        while(j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }


    }
     static void mergeSort(int [] arr, int start ,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        //1.Divide the Array unti it become one or sorted
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        //2.merege
        merge(arr,start ,mid,end);

    }
    public static void main(String[] args) {
        int arr [] = new int[]{8,4,11,2,3,7,5};
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
