public class C7_TreeRecursion {

    static void printN(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printN(num - 1);
        printN(num - 1);
    }

    public static void main(String[] args) {
        printN(2);
    }
}