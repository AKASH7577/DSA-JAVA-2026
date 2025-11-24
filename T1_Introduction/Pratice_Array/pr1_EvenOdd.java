
import java.util.*;

class Even_Odd {

    static void EvenOdd(int [] arr){

        for(int i =0;i<arr.length; i++){
            if(arr[i]%2 ==0){
                System.out.println("Even number:"+arr[i]);
            }else{
                System.out.println("Odd Number:"+arr[i]);

            }
        }



    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");

        // Input loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        // Output loop
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        EvenOdd(arr);

        sc.close();
    }
}
