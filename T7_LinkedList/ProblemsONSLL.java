package T7_LinkedList;
class Node {

    int val;
    Node next;

    // constructor
    Node(int val) {
        this.val = val;
    }
}




public class ProblemsONSLL {

    Node head;
    Node tail;
    int size;

    // Insert the node at the end or tail
    public void insertNodeAtTail(int val) {
        // create the node
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp; // add the node to the tail next
            tail = temp;
        }

        size++;

    }

    // printing the nodes
    public void printNodes() {

        Node temp = head; // shallow copy

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //get the size  of the list 
    public void getSize() {
        System.out.println("size of the list :" + size);
    }




    void deleteNode2(Node nodeToDelete) {

        nodeToDelete.val = nodeToDelete.next.val;
        nodeToDelete.next = nodeToDelete.next.next;
        if (nodeToDelete.next == null) {
            tail = nodeToDelete;
        }

        size--;

    }

    // helper method
    Node findNodeByValue(int value) {

        Node temp = head;
        while (temp != null) {
            if (temp.val == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // ----------------------------Problem 2: middle of the
    // LL------------------------------
    // -------------------------------using the 2 pass approach
    // ------------------------------
    int findMiddleNode() { // s.C = O(1) & T.C = O(n)
        // find the lenggth
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // finding the mid
        int mid = (len / 2) + 1;
        temp = head;
        for (int i = 1; i <= mid - 1; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // --------------------------using the slow-fast
    // approach---------------------------------

    int middleNode() {
        Node slow = head;
        Node fast = head;
        // right middle mode
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /*
         * while(fast!=null && fast.next!= null && fast.next.next ! =null){
         * slow = slow.next;
         * fast = fast.next.next;
         * }
         * 
         */

        return slow.val;

    }

    // ------------------------problem 3 : Delete the middle node (leetcode
    // 2095)-------------------------------------------

    void DeleteMiddle() {

        if (head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        // right middle mode
        while (fast.next != null && fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

    }

    // -----------------------problem 4: Remove the Nth Node from the End of the
    // list--------------------------------

    void DeleteNthNodeFromEnd(int n) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (len == n) {
            head = head.next;
            return;
        }
        temp = head;
        for (int i = 0; i < len - n - 1; i++) {
            temp = temp.next;

        }

        // delettion
        temp.next = temp.next.next;
    }

    //Problem 4b: Delete the Nth Node of from the end of the list Using the slow fast method

    void DeleteNthNodeFromEnd2(int n) {
        Node slow = head;
        Node fast = head;

        for(int i =1;i<=n; i++){
            fast = fast.next;
        }

        if(fast==null){//len==n
            //i Have to delete the head
            head = head.next;
            return;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
            slow.next = slow.next.next;

       
       
    }



    public static void main(String[] args) {
        ProblemsONSLL list = new ProblemsONSLL();

        list.insertNodeAtTail(10);
        list.insertNodeAtTail(20);
        list.insertNodeAtTail(30);
        list.insertNodeAtTail(40);
        list.insertNodeAtTail(50);
        list.insertNodeAtTail(60);

        System.out.println("Original list \n");
        list.printNodes();
        list.getSize();


        
        // ------------------ PROBLEM 1 LIST ------------------
        ProblemsONSLL p1 = new ProblemsONSLL();
        p1.insertNodeAtTail(4);
        p1.insertNodeAtTail(5);
        p1.insertNodeAtTail(1);
        p1.insertNodeAtTail(9);

        System.out.println("\nProblem 1 List:");
        p1.printNodes();

        Node nodeToDelete = p1.findNodeByValue(5); // delete value 5
        if (nodeToDelete != null && nodeToDelete.next != null) {
            p1.deleteNode2(nodeToDelete);
        }

        System.out.println("After Problem 1 (Delete 5):");
        p1.printNodes();

        // ------------------ PROBLEM 2 LIST ------------------
        ProblemsONSLL p2 = new ProblemsONSLL();
        p2.insertNodeAtTail(10);
        p2.insertNodeAtTail(20);
        p2.insertNodeAtTail(30);
        p2.insertNodeAtTail(40);
        p2.insertNodeAtTail(50);

        System.out.println("\nProblem 2 List:");
        p2.printNodes();

        System.out.println("Middle (two-pass): " + p2.findMiddleNode());
        System.out.println("Middle (fast-slow): " + p2.middleNode());



        // ------------------ PROBLEM 3 LIST ------------------
        ProblemsONSLL p3 = new ProblemsONSLL();
        p3.insertNodeAtTail(1);
        p3.insertNodeAtTail(3);
        p3.insertNodeAtTail(4);
        p3.insertNodeAtTail(7);
        p3.insertNodeAtTail(1);
        p3.insertNodeAtTail(2);
        p3.insertNodeAtTail(6);

        System.out.println("\nProblem 3 List:");
        p3.printNodes();

        p3.DeleteMiddle();

        System.out.println("After Problem 3 (Delete Middle):");
        p3.printNodes();

        // ------------------ PROBLEM 4 LIST ------------------
        ProblemsONSLL p4 = new ProblemsONSLL();
        p4.insertNodeAtTail(10);
        p4.insertNodeAtTail(20);
        p4.insertNodeAtTail(30);
        p4.insertNodeAtTail(40);
        p4.insertNodeAtTail(50);

        System.out.println("\nProblem 4 List:");
        p4.printNodes();

        int n = 2; // delete 2nd from end
        p4.DeleteNthNodeFromEnd(n);

        System.out.println("After Problem 4 (Delete " + n + "th from End):");
        p4.printNodes();


        // ------------------ PROBLEM 4b LIST ------------------
        ProblemsONSLL p4b = new ProblemsONSLL();
        p4b.insertNodeAtTail(10);
        p4b.insertNodeAtTail(2);
        p4b.insertNodeAtTail(38);
        p4b.insertNodeAtTail(90);
        p4b.insertNodeAtTail(50);

        System.out.println("\nProblem 4b List:");
        p4b.printNodes();

        int n2 = 5; // delete 2nd from end
        p4b.DeleteNthNodeFromEnd2(n2);

        System.out.println("After Problem 4b (Delete " + n2 + "th from End):");
        p4b.printNodes();




        


    }
    
}
