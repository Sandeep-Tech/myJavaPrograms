
package doublylinkedlist;

public class Node {
    
    // fields
    private int data;
    private Node next;
    private Node previous;
    
    
    // getters and setters:
    // data
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    
    // next node
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
    // previous node
    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
    
    
    
}
