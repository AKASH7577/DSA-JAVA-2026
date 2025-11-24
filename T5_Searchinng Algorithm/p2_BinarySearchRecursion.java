public class p2_BinarySearchRecursion {

    static int BinarySearch(int[] arr, int element, int startIndex, int endIndex ) {

            if(startIndex >endIndex) {
                return -1;
            }
            int  midIndex = (startIndex+endIndex)/2;
            if(arr[midIndex] ==element){
                return midIndex;
            }else if(arr[midIndex]<element){
                return BinarySearch(arr, element, midIndex+1, endIndex);
            }else{
                return BinarySearch(arr, element, startIndex, midIndex-1);
            }

        }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 24, 35, 46, 56, 67, 78 };
        int element = 56;
        int startIndex = 0;
        int endIndex = arr.length-1;

        int foundAtIndex = BinarySearch(arr, element,startIndex,endIndex);

        if (foundAtIndex == -1) {
            System.out.println("element not found\n");
        } else {
            System.out.println("element found at index  " + foundAtIndex);
        }
    }

}
