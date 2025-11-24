public class C2_TailRecursionExample {

    static int count = 3;

    static void fun() {
        if (count == 0) {
            return;
        }
        System.out.println("Hello");
        count--;
        fun();
    }

    public static void main(String[] args) {
        fun();
    }
}