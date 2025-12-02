package T8_Stack;

import java.util.Stack;

public class CopyStackIntoAnother {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        Stack<Integer> st_temp = new Stack<>();
        Stack<Integer> st_Final = new Stack<>();

        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        System.out.println("Original Stack: " + st_original);

        //Reverse the Stack 
        while (!st_original.isEmpty()) {
            //First the Reverse the Stack 
            st_temp.push(st_original.pop());
        }

        //copy the stack
        while(!st_temp.isEmpty()){
            
            // copying the Another stack
            st_Final.push(st_temp.pop());

        }


        System.out.println("Original Stack: " + st_original);
        System.out.println("Reverse stack : " + st_temp);
        System.out.println("Final Stack : " + st_Final);

    }

}
