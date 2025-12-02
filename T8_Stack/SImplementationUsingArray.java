package T8_Stack;


public class SImplementationUsingArray {


    public static class Stack {

        int arr[] = new int[6];
        int index = 0;

        void push(int ele){
            if(isFull()){
                System.out.println("Stack is fulll");
                return;
            }
            arr[index] = ele;
            index++;

        }
        
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] =0;
            index--;
            return top;

        }
        
         int peek() {
            if (index ==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            
            return arr[index-1];

        }

        boolean isEmpty(){
            if(index ==0)return true;
            else return false;
        }

        boolean isFull(){
            
            if(arr.length ==index){
                return true;

            }
            return false;

        }

        int size(){
            return index;
        }
        
        void display(){
            for(int i =0 ; i<= index-1; i++){
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);

            System.out.println(st.peek());
            System.out.println(st.size());

        }
    
}


}
