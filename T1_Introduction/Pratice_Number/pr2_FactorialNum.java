import java.util.*;

class Factorial_Number {

    /*
     * A factorial number is:
     * 
     * ✅ Factorial Definition
     * 
     * Factorial of a number (n!) is the product of all positive integers from 1 to n
     * n! = n × (n − 1) × (n − 2) × ... × 1
     * 
     */

    // compoite function to check the number
    static void factorial_num(int num) {
        int fact = 1;

        for (int i = num; i >0; i--) {
            fact  = fact*i;
        }

        System.out.println("Factoral of the number "+ num+ "is: "+fact);

       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        factorial_num(num);

        sc.close();
    }
}
