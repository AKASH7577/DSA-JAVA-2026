package T8_Stack;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class SimpleUsingLL{
        Node head = null;
        int size =0;

    
        void push(int x) {
           Node temp = new Node(x);
           temp.next = head;
           head = temp;
           size++;
        }

        int pop() {
              if(head ==null){
                 System.out.println("Stack is empty");
                 return -1;
              }
              int top = head.val;
              head = head.next;
              size--;

              return top;

        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int x = head.val;
            return x;

        }

        boolean isEmpty() {
            if (size== 0)
                return true;
            else
                return false;
        }

        

        int size() {
            return size;
        }

        void display() {
            Node temp = head;
           while(temp!= null){
                System.out.println(temp.val);
                temp = temp.next;
           }
        }

        public static void main(String[] args) {
            SimpleUsingLL st = new SimpleUsingLL();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);

            System.out.println(st.peek());
            System.out.println(st.size());

        }

    }

