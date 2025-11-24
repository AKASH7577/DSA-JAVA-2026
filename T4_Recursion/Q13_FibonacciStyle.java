public class Q13_FibonacciStyle {

    static int fun(int num) {
        if (num <= 0) {
            return 1;
        }

        int ans1 = num + fun(num - 1);
        System.out.println("ans1 (num=" + num + "): " + ans1);

        int ans2 = num + fun(num - 2);
        System.out.println("ans2 (num=" + num + "): " + ans2);

        return ans1 + ans2;
    }

    public static void main(String[] args) {
        System.out.println("Final Result: " + fun(3));
    }
}