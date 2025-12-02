package T7_LinkedList;

class DNode {

    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
    }
}

public class demo {

    DNode head;
    DNode tail;
    int size;

    public void insertNodeAtTail(int val) {
        // create the node
        DNode temp = new DNode(val);
        if (size == 0)
            head = tail = temp;
        else {
            // actual logic
            tail.next = temp; // add the node to the tail next
            temp.next = tail;
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

        demo Dlist = new demo();
        Dlist.insertNodeAtTail(10);
        Dlist.insertNodeAtTail(20);
        Dlist.insertNodeAtTail(30);
        Dlist.insertNodeAtTail(40);
        Dlist.insertNodeAtTail(50);
        Dlist.printForward();

    }

}
