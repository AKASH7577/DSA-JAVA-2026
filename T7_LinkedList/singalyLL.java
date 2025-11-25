package T7_LinkedList;
//creating the class node
class Node {

    int val;
    Node next;
    //constrcture
    Node(int val){
        this.val = val;
    }
}



public class singalyLL {
    public static void main(String[] args) {
        
        //creating the nodes
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(60);

        //printing the address
        System.out.println("Printing the adddress of the each node");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // printing the next address
        System.out.println("Printing the adddress of  the next  node(by default is null)");

        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);

        //Printing the the values
        System.out.println("printing the values");
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        //linking the node
        System.out.println("linking the nodes");
        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Printing the adddress of  the next  nod after the linking the nodes");

        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);

        
    }
}
    
