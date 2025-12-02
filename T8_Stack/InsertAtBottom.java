package T8_Stack;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        Stack<Integer> st_temp = new Stack<>();
       

        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        System.out.println("Original Stack: " + st_original);

        // Reverse the Stack
        while (!st_original.isEmpty()) {
            // First the Reverse the Stack
            st_temp.push(st_original.pop());
        }

        //Inserting At the Bottom
        st_original.push(70);


        // copy the stack
        while (!st_temp.isEmpty()) {

            st_original.push(st_temp.pop());

        }

        System.out.println("Original Stack: " + st_original);
        System.out.println("Tempery Stack : " + st_temp);
        System.out.println("Original Stack After the Inserting at the Bottom: " + st_original);

    }

}
