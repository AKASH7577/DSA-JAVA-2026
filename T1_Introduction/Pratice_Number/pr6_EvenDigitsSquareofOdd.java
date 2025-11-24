import java.util.*;

class EvenDiy_Number {

    // 1.using simple method
    static void digits_num(int num) {
        int sumEven = 0;
        while (num > 0) {
            int digits = num % 10;
            num = num / 10;

            if(digits%2 ==0){
                System.out.println("Even Digits:"+digits);
            }else{
                System.out.println("Odd Digits:" + digits*digits);

            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        digits_num(num);

        sc.close();
    }
}
