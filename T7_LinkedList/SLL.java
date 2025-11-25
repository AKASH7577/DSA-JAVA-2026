package T7_LinkedList;

class Node {

    int val;
    Node next;

    // constructor
    Node(int val) {
        this.val = val;
    }
}

public class SLL {

        Node head ;
        Node tail;
        int size;



        //insert the node ad the head or the begining the list 
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

            //Insert the node at the end or tail
        public void insertNodeAtTail(int val){
                //create the node 
                Node temp = new Node(val);
                if(head == null) head = tail= temp;
                else{
                    tail.next = temp; //add the node to the tail next
                    tail = temp;
                }

                size++;

        }

        //insert the node at any index
        public void insertNodeAtAnyIndex(int index,int val) {

            if(index ==0){
                insertNodeAtHead(val);
                return;
            }

            if (index == size){
                insertNodeAtTail(val);
                return;
            }

            if(index>size || index<0){
                System.out.println("Invalid index");
                return;
            }
            // create the node
            Node temp = new Node(val);
            Node x = head;
            for(int i =1; i<=index-1; i++){
                x = x.next;
            }
            //insertion
            temp.next = x.next;
            x.next = temp;

            size++;

        }

        //get element by index
        int getElement(int index){
            if(index == size-1) return tail.val;
            if(index>=size-1 || index<0){
                System.out.println("Invalid index!!");
                return -1;
            }
            Node temp = head;
            for(int i =1; i<=index; i++){
                temp = temp.next;
            }
            return  temp.val;
        }

        //set the element 
        void setElement(int index, int val){

            if(index == size-1){
                tail.val = val;
                return;
            }
            if(index>=size|| index<0){
                System.out.println("Invalid index!!");
                return;
            }

            if (index == 0){
                head.val  = val;
            }

           
            Node temp = head;
            for(int i =0; i<=index-1; i++){
                temp = temp.next;
            }
            temp.val = val;
        }

        //delete at the head
        void deletNodehead() throws Error{
            if(head ==null) throw new Error("list is empty");
            head = head.next;
            size--;
        }

        //delete the node
        void deletNode(int index) throws Error {

            if(index ==0){
                deletNodehead();
                return;
            }
            if(index>=size || index<0){
                throw new Error("Invalid index!!");
            }
            Node temp = head;
            for(int i =1; i<=index-1;i++){
                temp = temp.next;
            }
            if(temp.next ==tail) tail = temp;
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


        public void getSize(){
            System.out.println("size of the list :"+ size);
        }

    

}
class Client{
    public static void main(String[] args) {

        SLL list = new SLL();

        list.insertNodeAtTail(10);
        list.insertNodeAtTail(20);
        list.insertNodeAtTail(30);
        list.insertNodeAtTail(40);
        list.insertNodeAtTail(60);

        // Print linked list 
        list.printNodes(); // prints: 10 20 30 40 60
        list.getSize();

        // Insert another node at the end
        list.insertNodeAtTail(800);

        System.out.println("List after adding  the new node at the end or tail");
        list.printNodes(); // prints: 10 20 30 40 60 800
        list.getSize();

        //insert the node at the head
        list.insertNodeAtHead(100);

        System.out.println("List after adding  the new node at the head or  begignnig");
        list.printNodes(); // prints: 100 10 20 30 40 60 800
        list.getSize();

        // insert the node at  any index
        list.insertNodeAtAnyIndex(4,500);

        System.out.println("List after adding  the new node at  the any index");
        list.printNodes();
        list.getSize();

        //get the element at any index
        System.out.println(list.getElement(5));

        //set the element
        list.setElement(0, 900);
        list.printNodes();

        //delete the head
        list.deletNodehead();
        list.printNodes();
        list.getSize();

        //delete the node
        list.deletNode(4);
        list.printNodes();
        list.getSize();



    }

}
    

