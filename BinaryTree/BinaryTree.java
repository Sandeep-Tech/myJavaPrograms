
package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    
    Node root;
    
    public void addNode(int data){
        
        Node newNode = new Node(data);
        
        if(root == null){
            root = newNode;
        }
        else{
            Node currentNode = root;
            Node previous;
            while(true){
                previous = currentNode;
                if(data <= currentNode.data){
                    currentNode = currentNode.leftChild;
                    if(currentNode == null){
                        previous.leftChild = newNode;
                        return;
                    }
                } 
                else{
                    currentNode = currentNode.rightChild;
                    if(currentNode == null){ 
                        previous.rightChild = newNode;
                        return;
                    }
                }
            }
        
        }
    }
    
    public void inorderTraversal(Node currentNode){
        if(currentNode != null){
            inorderTraversal(currentNode.leftChild);
            System.out.print(currentNode.data + " ");
            inorderTraversal(currentNode.rightChild);
        }
    }
    
    
    public void preorderTraversal(Node currentNode){
        if(currentNode != null){
            System.out.print(currentNode.data + " ");  
            preorderTraversal(currentNode.leftChild);
            preorderTraversal(currentNode.rightChild);
        }
    }
    
    
    public void postorderTraversal(Node currentNode){
        if(currentNode != null){
            preorderTraversal(currentNode.leftChild);
            preorderTraversal(currentNode.rightChild);
            System.out.print(currentNode.data + " ");  

        }
    }
    
   
    
    // Level Order traversal
    private  final Queue<Node> Q = new LinkedList<>();
    public void levelOrderTraversal(Node currentNode){
        if(currentNode != null) {
            System.out.print(currentNode.data + " ");
            boolean hasLeftchild = currentNode.leftChild != null;
            boolean hasRightchild = currentNode.rightChild != null; 
            if(hasLeftchild){
                Q.add(currentNode.leftChild);
            }
            if(hasRightchild) {
                Q.add(currentNode.rightChild);
            }
            if(!Q.isEmpty()) levelOrderTraversal(Q.remove());
        }
    }
    
    
    
}
