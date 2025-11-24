public class Factorial_StaticVar {

    static int fact = 1;

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        fact = fact * num;
        factorial(--num);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}