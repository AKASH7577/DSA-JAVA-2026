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
    int size;
    //-------------------Insert the Node At the tail----------------------------
    void insertNodeAtTail(int val) {
        // create the node
        DNode temp = new DNode(val);
        if (size ==0)
            head = tail = temp;
        else {
            //actual logic
            tail.next = temp; // add the node to the tail next
            temp.prev = tail;
            tail = temp;
        }

        size++;

    }

    //----------------------Insert the add the head----------------------------------
    void insertNodeAtHead(int val) {
        // create the node
        DNode temp = new DNode(val);
        if (size == 0)
            head = tail = temp;
        else {
            // actual logic
            head.prev = temp; // add the node to the tail next
            temp.next = head;
            head = temp;
        }

        size++;

    }


    // ----------------------Insert the at any index--------------------------
    void insertNodeAtAnyIndex(int index,int val) {
        // create the node

        if(index >size||index <0){
            System.out.println("Invalid index");
            return;

        }

        DNode temp = new DNode(val);

        if(index ==0){
            insertNodeAtHead(val);
            return;
        }
        if(index == size){
            insertNodeAtTail(val);
            return;
        }

        DNode x = head;
        
        for(int i = 0;i<index-1; i++){
            x = x.next;
        }
        DNode y = x.next;

        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;

        size++;

    }

    //-------------------------Delete the Head--------------------

    void DeletHead()throws Error{
        if(head==null){
            throw new Error("List is Empty");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    //---------------------Delete the Tail------------------------
    void DeletTail() throws Error {
        if (head == null) {
            throw new Error("List is Empty");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }


    // ----------------------Insert the at any index--------------------------
    void Delete(int index) {
        // create the node

        if (index > size || index < 0) {
            System.out.println("Invalid index");
            return;

        }


        if (index == 0) {
            DeletHead();
            return;
        }
        if (index == size) {
            DeletTail();
            return;
        }

        DNode x = head;

        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        

        x.next = x.next.next;
        x = x.next;
        x.prev = x.prev.prev;

        size--;

    }


    // -------------------------Helper Method to print from head to tail--------------------------
    public void printlist() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //------------------------ get the size of the list-----------------------------------------------
    public void getSize() {
        System.out.println("size of the list :" + size);
    }



    public static void main(String[] args) {
        
        DoublyLLImplemetation Dlist =  new DoublyLLImplemetation();
        Dlist.insertNodeAtTail(10);
        Dlist.insertNodeAtTail(20);
        Dlist.insertNodeAtTail(30);
        Dlist.insertNodeAtTail(40);
        Dlist.insertNodeAtTail(50);
        System.out.println("\nDoubly Link list(insert the tail)");
        Dlist.printlist();
        Dlist.insertNodeAtTail(300);
        Dlist.insertNodeAtTail(48);
        Dlist.insertNodeAtTail(57);
        System.out.println("\nDoubly Link list After the adding(through the tail) the node");

        Dlist.printlist();

        System.out.println("\nDoubly Link list(insert the head)");
        Dlist.insertNodeAtHead(3);
        Dlist.insertNodeAtHead(4);
        Dlist.printlist();

        System.out.println("\nDoubly Link list(at any index)");
        Dlist.insertNodeAtAnyIndex(3, 700);
        Dlist.insertNodeAtAnyIndex(11, 70);
        Dlist.printlist();
        Dlist.getSize();

        System.out.println("\nDelete the Head");
        Dlist.DeletHead();
        Dlist.printlist();
        Dlist.getSize();

        System.out.println("\nDelete the Tail");
        Dlist.DeletTail();
        Dlist.printlist();
        Dlist.getSize();

        System.out.println("\nDelete the any index");
        Dlist.Delete(4);
        Dlist.printlist();
        Dlist.getSize();


    }
    
    
}
