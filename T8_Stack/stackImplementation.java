package T8_Stack;

import java.util.Stack;

public class stackImplementation {
    public static void main(String[] args) {
        //statck Declaration
        Stack<Integer> st = new Stack<>();

        /*
        the key operation on the stack
        1.push()
        2.pop()
        3.isEmpty()
        4.isFull()
        5.size()
        6.peek()
        
        
        
        
        */

        System.out.println(st.isEmpty());    // isEmpty()
        System.out.println(st.size()); // size()

        //----------------insert the element in the stack------------------
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.size()); // size()
        System.out.println("Last Element in the stack or the first elemenet  is: "+st.peek());
        System.out.println(st);
        System.out.println(st.size()); // size()

        //to access the first element in the array

        while(st.size()>1){
            st.pop();
        }
        System.out.println("First element in the array: " + st.peek());


    }
    
}
