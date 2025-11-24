import java.util.*;

class SquareRoot_Number {

   
    static void squareRootOf_num(int num) {
        double sRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is: " + sRoot);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        squareRootOf_num(num);

        sc.close();
    }
}
