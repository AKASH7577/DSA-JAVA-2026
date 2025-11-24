public class Q12_ComplexRecursion {

    static void Fun(int num) {
        if (num <= 1) {
            return;
        }
        Fun(num - 2);
        System.out.println(num);
        Fun(num - 1);
    }

    public static void main(String[] args) {
        Fun(5);
    }
}