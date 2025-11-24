import java.util.*;

class composite_Number {

    /*
     * A composite number is:
     * 
     * ✅ A positive integer that has more than two factors.
     * 
     * In simple words:
     * A number that is not prime(only two factor )
     * A number that can be divided by 1, itself, and also some other number
     */

    //compoite function to check the number 
    static void composite_num(int num) {
        int fact = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                fact++;
            }
        }

        if (fact > 2) {
            System.out.println("Composite number");
        } else {
            System.out.println("Not composite number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        composite_num(num); // corrected function name

        sc.close();
    }
}
