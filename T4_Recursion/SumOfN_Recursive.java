public class SumOfN_Recursive {

    static int sumN(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumN(--num);
    }

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }
}