
import java.util.*;

class Even_Odd {

    static void averageNum(int[] arr) {
        int average = 0;
        int sum =0;
        int totalElement = arr.length;

        for (int i = 0; i < arr.length; i++) {
           
            sum+=arr[i];
        }
        average = sum/totalElement;

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

        averageNum(arr);

        sc.close();
    }
}
