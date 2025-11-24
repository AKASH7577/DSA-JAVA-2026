public class C5_RecursiveSum {

    static int printNum(int num) {
        if (num == 0) {
            return 1;
        }
        return 5 + printNum(--num);
    }

    public static void main(String[] args) {
        System.out.println(printNum(3));
    }
}