package T7_LinkedList;

class DNode {

    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
    }
}

public class DoublyLLImplemetation {

    DNode head;
    DNode tail;
    int size =0;

    public void insertNodeAtTail(int val) {
        // create the node
        DNode temp = new DNode(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp; // add the node to the tail next
            tail = temp;
        }

        size++;

    }

    // print from head to tail
    public void printForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        
        DoublyLLImplemetation Dlist =  new DoublyLLImplemetation();
        Dlist.insertNodeAtTail(10);
        Dlist.insertNodeAtTail(20);
        Dlist.insertNodeAtTail(30);
        Dlist.insertNodeAtTail(40);
        Dlist.insertNodeAtTail(50);
        Dlist.printForward();

    }
    
    
}
