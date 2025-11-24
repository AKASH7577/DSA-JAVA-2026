public class C6_RecursiveSumHead {

    static int printNum(int num) {
        if (num == 0) {
            return 1;
        }
        printNum(--num);
        return 5 + num;
    }

    public static void main(String[] args) {
        System.out.println(printNum(3));
    }
}