package T8_Stack;

import java.util.*;

public class ReverseString {

    public static String revString(String str) {
        char[] stackArr = new char[str.length()];
        Stack<Character> st = new Stack<>();

        // push every character
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i)); // <-- was charAt(0) in your code
        }

        int i = 0;
        while (!st.isEmpty()) {
            stackArr[i++] = st.pop();
        }
        return new String(stackArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String to reverse: ");
        String str = sc.nextLine(); // use nextLine() to allow spaces

        String rev = revString(str); // call revString with the String
        System.out.println("String Reverse: " + rev);

        sc.close();
    }
}
