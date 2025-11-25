package T7_LinkedList;

class DNode {

    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
    }
}

public class DoublyLL {

    DNode head;
    DNode tail;

    // print from head to tail
    static void printForward(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // print from tail to head
    static void printBackward(DNode tail) {
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // create nodes
        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(80);
        DNode d = new DNode(30);
        DNode e = new DNode(40);

        // manually link them (VERY SIMPLE)
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        // head and tail
        DoublyLL list = new DoublyLL();
        list.head = a;
        list.tail = e;

        System.out.println("Forward:");
        printForward(list.head);

        System.out.println("Backward:");
        printBackward(list.tail);
    }
}
