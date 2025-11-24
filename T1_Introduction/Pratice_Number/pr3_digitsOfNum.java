import java.util.*;

class DigitsOf_Number {

    // 1.using simple method
    static void digits_num(int num) {
        while(num>0){
        int digits = num%10;
        num = num/10;
        System.out.println(digits);
        }
        
    }

    // 2. Using the Built in Method
    static void digits_num2(int num){

        String s = String.valueOf(num); // convert number to string

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        digits_num(num);
        digits_num2(num);

        sc.close();
    }
}
