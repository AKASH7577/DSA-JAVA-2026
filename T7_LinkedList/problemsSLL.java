package T7_LinkedList;

class Node {

    int val;
    Node next;

    // constructor
    Node(int val) {
        this.val = val;
    }
}

public class problemsSLL {

    Node head;
    Node tail;
    int size;

    // insert the node ad the head or the begining the list
    public void insertNodeAtHead(int val) {
        // create the node
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }

        size++;

    }

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

    // insert the node at any index
    public void insertNodeAtAnyIndex(int index, int val) {

        if (index == 0) {
            insertNodeAtHead(val);
            return;
        }

        if (index == size) {
            insertNodeAtTail(val);
            return;
        }

        if (index > size || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        // create the node
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= index - 1; i++) {
            x = x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;

        size++;

    }

    // get element by index
    int getElement(int index) {
        if (index == size-1)
            return tail.val;
        if (index >= size || index < 0) {
            System.out.println("Invalid index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // set the element
    void setElement(int index, int val) {

        if (index == size - 1) {
            tail.val = val;
            return;
        }
        if (index >= size || index < 0) {
            System.out.println("Invalid index!!");
            return;
        }

        if (index == 0) {
            head.val = val;
        }

        Node temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }

    // Delete the node
    void deletNodehead() throws Error {
        if (head == null)
            throw new IllegalStateException("list is empty");
        head = head.next;
        size--;
        if(head== null) tail= null;
    }

    void deletNode(int index) throws Error {

        if (index == 0) {
            deletNodehead();
            return;
        }
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next == tail)
            tail = temp;
        temp.next = temp.next.next;
        size--;
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

    public void getSize() {
        System.out.println("size of the list :" + size);
    }




//------------------problem 1: Delete the Node (leetcode 237)-----------------------

void deleteNode2(Node nodeToDelete){
   
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


//----------------------------Problem 2: middle of the LL------------------------------
//-------------------------------using the 2 pass approach ------------------------------
 int   findMiddleNode(){  //s.C = O(1) &  T.C = O(n)
    //find the lenggth
    Node temp = head;
    int len = 0;
    while(temp!=null){
        temp = temp.next;
        len++;
    }

    //finding the mid
    int mid = (len/2)+1;
    temp = head;
    for(int i =1; i<=mid-1; i++){
        temp = temp.next;
    }
    return temp.val;
}

//--------------------------using the slow-fast approach--------------------------------- 

 int middleNode(){
    Node slow = head;
    Node fast = head;
//right middle mode
    while(fast!=null && fast.next!= null){
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


//------------------------problem 3 : Delete the middle node (leetcode 2095)-------------------------------------------


void DeleteMiddle(){

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

//-----------------------problem 4: Remove the Nth Node from the End of the list--------------------------------


void DeleteNthNodeFromEnd( int n){
    Node temp = head;
    int len = 0;
    while (temp != null) {
        temp = temp.next;
        len++;
    }

    if (len == n){
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
 static class Client {

    public static void main(String[] args) {

        problemsSLL list = new problemsSLL();

        list.insertNodeAtTail(10);
        list.insertNodeAtTail(20);
        list.insertNodeAtTail(30);
        list.insertNodeAtTail(40);

        // Print linked list
        list.printNodes();
        list.getSize();

        // Insert another node at the end
        list.insertNodeAtTail(800);

        System.out.println("List after adding  the new node at the end or tail");
        list.printNodes(); 
        list.getSize();

        // insert the node at the head
        list.insertNodeAtHead(100);

        System.out.println("List after adding  the new node at the head or  begignnig");
        list.printNodes(); // prints: 100 10 20 30 40 60 800
        list.getSize();

        // insert the node at any index
        list.insertNodeAtAnyIndex(4, 500);

        System.out.println("List after adding  the new node at  the any index");
        list.printNodes();
        list.getSize();

        // get the element at any index
        System.out.println(list.getElement(5));

        // set the element
        list.setElement(0, 900);
        list.printNodes();

        // delete the head
        list.deletNodehead();
        list.printNodes();
        list.getSize();

        // delete the node
        list.deletNode(4);
        list.printNodes();
        list.getSize();

       
        //----------------------Problems---------------------------

    //----------problem 1:delete the node-------------------
    Node nodeToDelete = list.findNodeByValue(20);
    if (nodeToDelete == null) {
        System.out.println("Node not found.");
    } else if (nodeToDelete.next == null) {
        System.out.println("Cannot use deleteNode2 on tail node.");
    } else {
        list.deleteNode2(nodeToDelete);
        System.out.print("After deleteNode2: ");
        list.printNodes(); // 10 20 40 60
        list.getSize();
    }

    //--------------problem 2 :middel of the node--------------------
    System.out.println(list.findMiddleNode());
    //using the sloe fast approach
    System.out.println(list.middleNode());


    //----------------problem 3:Delete the middle node------------------
    System.out.println("list after the delete the middle node");
    list.DeleteMiddle();
    list.printNodes();

    //----------------problem 4: Remove the Nth Node from the End of the list-----------------
    list.DeleteNthNodeFromEnd(2);


    }

}

}
