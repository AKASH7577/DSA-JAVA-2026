import java.util.*;

class Reverse_Number {

    // 1.using simple method
    static void reversenum(int num) {
        int ReverseNum = 0;

        while (num  > 0) {
            int digits = num % 10;
            num = num / 10;
            ReverseNum = ReverseNum * 10 + digits;
        }
        System.out.println(ReverseNum);

    }
    

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        reversenum(num);

        sc.close();
    }
}
