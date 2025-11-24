import java.util.*;

class palindrome_Number {

    // 1.using simple method
    static int palindrome(int num) {
        int ReverseNum = 0;

        while (num > 0) {
            int digits = num % 10;
            num = num / 10;
            ReverseNum = ReverseNum * 10 + digits;
        }

        return ReverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

       int Reverse = palindrome(num);
       if(num == Reverse){
            System.out.println("Number is palindrome");
       }else{
            System.out.println("Number is not palindrome");
       }

        sc.close();
    }
}
