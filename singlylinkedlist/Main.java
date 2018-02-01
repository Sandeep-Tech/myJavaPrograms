
package singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        //-------------------------------------------------
        // add a node in the front of the list.--done
        // delete a node from the front of the list.--done
        //-------------------------------------------------
        // add a node at the end of the list.--done
        // delete a node from the end of the list.--done
        //-------------------------------------------------
        // add a node after a given node --done
        // delete a node after a given node --done
        //-------------------------------------------------
        // add a node before a given node --done with inelegent solution
        // delete a node before a given node --can be done, but very inelegent solution
        //-------------------------------------------------
        // display the list--done
        //-------------------------------------------------
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);


        myList.display();
        myList.addAfter(3, 99);
        
        myList.display();
        
        myList.deleteAfter(3);
        myList.display();
        
        myList.addFirst(4);
        myList.addFirst(5);
        myList.addFirst(6);
        
        myList.display();
        myList.addBefore(1,9999 );
        myList.display();
               
    }
}
