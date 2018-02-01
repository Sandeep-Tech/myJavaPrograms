
package circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
    
        myList.insertFirst(1);
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.display();
        
        myList.insertLast(0);
        myList.insertLast(-1);
        myList.insertLast(-2);
        myList.display();
        
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.display();
        
        
    }
}
