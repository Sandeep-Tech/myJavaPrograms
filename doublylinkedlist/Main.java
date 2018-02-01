    
package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        //-------------------------------------------------
        // add a node in the front of the list.
        // delete a node from the front of the list.
        //-------------------------------------------------
        // add a node at the end of the list.
        // delete a node from the end of the list.
        //-------------------------------------------------
        // add a node after a given node
        // delete a node after a given node
        //-------------------------------------------------
        // add a node before a given node
        // delete a node before a given node
        //-------------------------------------------------
        // displayForward the list
        //-------------------------------------------------
        
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addFirst(1);
        
        myList.addLast(0);
        myList.addLast(-1);
        myList.addLast(-2);

        myList.displayForward();
        
//        myList.deleteFirst();
//        myList.deleteFirst();
//        myList.deleteFirst();
//        myList.deleteLast();
//        myList.deleteLast();
        
//        myList.displayForward();
        
//        myList.addAfter(1, -3);
//        myList.addAfter(1, -2);
        myList.addAfter(-2, -3);
//        myList.deleteKey(-2);
        myList.displayForward();
        myList.displayBackward();
        
    }
}
