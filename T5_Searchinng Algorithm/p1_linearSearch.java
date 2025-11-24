public class p1_linearSearch {

    static int linearSearch(int [] arr,int element ){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==element)
                return i; //if found
        }
        return -1; //not found
    }
    public static void main(String[] args) {
        int arr[] = {7,3,14,45,32,89};
        int element = 32;

        int foundAtIndex = linearSearch(arr,element);
        
        if(foundAtIndex ==-1){
            System.out.println("element not found\n");
        }else{
            System.out.println("element found at index  "+foundAtIndex);
        }
    }
    
}
