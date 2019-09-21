package BinaryTree;
/**
 *
 * @author Sandeep Sharma
 */
public class demo {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
        myTree.addNode(4);
        myTree.addNode(7);
        myTree.addNode(3);
        myTree.addNode(4);
        myTree.addNode(8);
        myTree.addNode(5);
        
        System.out.print("Inorder Traversal: ");
        myTree.inorderTraversal(myTree.root);
        
        System.out.println("");
        
        System.out.print("Levelorder Traversal: ");
        myTree.levelOrderTraversal(myTree.root);
        
        
    }
    
}
