public class Factorial_Iterative {

    static void factorial(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}