
package T9_Tree;
import java.util.*;

class Node{
    Node left = null;
    int data;
    Node right = null;

    Node (int data){
        this.data = data;
    }
}
class BST {
    //Insert the Node into BST
    Node insertIntoBST(Node root,int data){

        if(root == null){
            root = new Node(data);
        }
        if(root.data < data){
            root.right = insertIntoBST(root.right, data);

        }
        if(root.data > data){
            root.left = insertIntoBST(root.left, data);
        }
        return root;
    }

    //search Into BST
    boolean searchEleBST(Node root,int ele){
        if(root == null){
            return false;
        }
         
        if (root.data == ele)return true;

        if(root.data <  ele){
            return searchEleBST(root.right, ele);
        }

        if(root.data > ele){
            return searchEleBST(root.left, ele);
        }
        return false;
    }

    //Minimum Node 

    Node minNode (Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    //Maxium Node
    Node maxNode(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    //Delete from theBST
    Node deleteFromDST(Node root ,int data){
        if(root == null){
            return root;

        }
        //search Node to delete
        if(root.data < data){
            root.right = deleteFromDST(root.right, data);
        }else if (root.data > data) {
            root.left = deleteFromDST(root.left, data);
        }else{

            if(root.left == null && root.right == null){
                return null;
            }

            if(root.left!= null && root.right== null){
                return  root.left;
            }

            if(root.left ==null && root.right!= null){
                return root.right;
            }

            if(root.left!=null && root.right != null){
                Node tempNode = minNode(root.right);
                root.data = tempNode.data;
                root.right = deleteFromDST(root.right, tempNode.data);
            }
        }
        return root;

    }


    // printing the Node using

    // 1.PREORDER------------------>>>> DLR
    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");// D
        preorder(root.left); // L
        preorder(root.right); // R

    }

    // 2.INORDER------------------>>>> LDR
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left); // L
        System.out.print(root.data + " "); // D
        inorder(root.right); // R
    }

    // 3.POSTORDER------------------>>>> LRD
    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left); // L
        postorder(root.right); // R
        System.out.print(root.data + " "); // D
    }

    //level Order 

    void levelOrder(Node root){
        if(root ==null){
            return;
        }
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);
        que.add(null);

        while(!que.isEmpty()){
            Node tempNode = que.remove();
            if(tempNode == null){
                System.out.println();
                if(que.isEmpty())
                    break;
                else
                    que.add(null);
            }else{
                System.out.println(tempNode.data + " ");

                if(tempNode.left != null){
                    que.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    que.add(tempNode.right);
                }
            }
        }
    }

}

class Client{
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;

        Scanner sc = new Scanner(System.in);
        char ch ;
        do{
            System.out.println("Binary Search Tree");
            System.out.println("1.InsertIntBST");
            System.out.println("2.searchFromBST");
            System.out.println("3.deleteFromBST");
            System.out.println("4.minFromBST");
            System.out.println("5.MaxFromBST");
            System.out.println("6.preorder");
            System.out.println("7.inorder");
            System.out.println("8.postOrder");
            System.out.println("9.levelOrder");

            System.out.println("Enter choice to perform the operation");
            int choice =  sc.nextInt();

            switch (choice) {
                case 1:{
                        System.out.println("Enter the data into the bst ");
                        int data = sc.nextInt();
                        root = bst.insertIntoBST(root, data);
                }
                    break;
                case 2: {
                    System.out.println("Enter the element t search ");
                    int ele = sc.nextInt();
                    boolean flag =  bst.searchEleBST(root, ele);
                    if(flag){
                        System.out.println("Eleemnt found");
                    }else{
                        System.out.println("Not found");
                    }
                }
                    break;
                case 3: {
                    System.out.println("Enter the Node to delete from the BST ");
                    int data = sc.nextInt();
                    root = bst.insertIntoBST(root, data);
                }
                    break;    
                
                case 4: {
                        if(root!=null){
                            Node minNode = bst.minNode(root);
                            System.out.println("Minimum Node"+minNode.data);
                        }else{
                            System.out.println("Empty Tree");
                        }
                }
                    break; 
                case 5: {
                    if (root != null) {
                        Node maxNode = bst.maxNode(root);
                        System.out.println("Maximum Node" + maxNode.data);
                    } else {
                        System.out.println("Empty Tree");
                    }
                }
                    break; 
                case 6: 
                        bst.preorder(root);
                        System.out.println();
                    
                    break;
                case 7:
                    bst.inorder(root);
                    System.out.println();

                    break; 
                case 8:
                    bst.postorder(root);
                    System.out.println();

                    break; 
                case 9:
                    bst.levelOrder(root);
                    System.out.println();

                    break;        
                default:
                    break;
            }
            System.out.println("Do you Want to continue??");
            ch = sc.next().charAt(0);

        }while(ch == 'y' || ch == 'Y');


        
        
    }
}