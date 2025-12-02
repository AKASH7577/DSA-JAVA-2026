package T9_Tree;

import java.util.Scanner;

class Node {
      
        Node left = null;
        int data;
        Node right = null;

        Node(int data){
            this.data = data;
        }
}
public class BinaryTree {
        Scanner sc = new Scanner(System.in);

          Node constructBT(){

            System.out.println("Enter a data for Node");
            int data = sc.nextInt();

            //create the new Node
            Node newNode = new Node(data);

            //add the left
            System.out.println("Do You want to add the node at left of ??(y or n)"+ newNode.data);
            char leftnode = sc.next().charAt(0);

            if(leftnode == 'Y' || leftnode == 'y'){
                newNode.left = constructBT();
            }



            // add the Right
            System.out.println("Do You want to add the node at right of ??(y or n) " + newNode.data);
            char rightnode = sc.next().charAt(0);

            if (rightnode == 'Y' || rightnode == 'y') {
                newNode.right = constructBT();
            }

            return newNode;
            
        }

        //Count the Node 

        int countNode(Node root){
            if(root == null){
                return 0;
            }
            int leftSTCount = countNode(root.left);
            int rightSTCount = countNode(root.right);

            return leftSTCount + rightSTCount + 1;

        }

        int sumOfNode(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSTSum = sumOfNode(root.left); // correct
            int rightSTSum = sumOfNode(root.right); // correct

            return root.data + leftSTSum + rightSTSum;
        }

        // printing the Node using

        // 1.PREORDER------------------>>>>  DLR
        void preorder(Node root) {
             if(root == null){
                return;
             }
             System.out.print(root.data + " ");//D
             preorder(root.left);                //L
             preorder(root.right);               //R

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

        
    
}

 class Client{

    public static void main(String[] args) {
        
        Node root = null;
        BinaryTree bt = new BinaryTree();
        root = bt.constructBT();

        //Printing the Tree using preorder
        System.out.println("Printing the Tree using preorder");
        bt.preorder(root);
        System.out.println();

        // Printing the Tree using inorder
        System.out.println("Printing the Tree using inorder");
        bt.inorder(root);
        System.out.println();

        // Printing the Tree using postorder
        System.out.println("Printing the Tree using postorder");
        bt.postorder(root);
        System.out.println();

        System.out.println("Sum of Node is : " + bt.sumOfNode(root));
        System.out.println("Count of Nodes is : " + bt.countNode(root));
        
    }

}
