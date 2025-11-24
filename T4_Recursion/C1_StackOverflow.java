public class C1_StackOverflow {

    static void fun() {
        System.out.println("Hello");
        fun();
    }

    public static void main(String[] args) {
        fun();
    }
}