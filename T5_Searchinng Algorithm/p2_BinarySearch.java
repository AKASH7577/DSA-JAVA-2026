public class p2_BinarySearch {

    static int BinarySearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            int startIndex = 0;
            int endIndex = arr.length-1;

            while(startIndex<=endIndex){
                //formula to finde the midIndex
                int midIndex = (startIndex+endIndex)/2;

                if(arr[midIndex] == element){
                    return midIndex;
                }else if(arr[midIndex] <element){
                    startIndex = midIndex+1;
                }else{
                    endIndex = midIndex-1;
                }
            }
          
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = { 2,13,24,35,46,56,67,78};
        int element = 56;

        int foundAtIndex = BinarySearch(arr, element);

        if (foundAtIndex == -1) {
            System.out.println("element not found\n");
        } else {
            System.out.println("element found at index  " + foundAtIndex);
        }
    }

}
