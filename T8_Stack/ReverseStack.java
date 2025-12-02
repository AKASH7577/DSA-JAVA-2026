package T8_Stack;

import java.util.Stack;

public class ReverseStack {

     static void ReverseStack(Stack<Integer> st){

        if(st.isEmpty()){
            return ;
        }
        int  top =  st.pop();
        System.out.println(top);
        ReverseStack(st);
        st.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        Stack<Integer> st_Rev = new Stack<>();

        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        System.out.println("Original Stack: "+ st_original);
        while(!st_original.isEmpty()){
            /*
            inte temp = st_original.pop();
            st_Rev.push(temp);
            */

            st_Rev.push(st_original.pop());
        }
        System.out.println("Original Stack: "+st_original);
        System.out.println("Reverse stack : "+ st_Rev);

        System.out.println("\nREverse the Stack Using the Recursive Method:");
        
        ReverseStack(st_original);


        
    }
   

    
}
