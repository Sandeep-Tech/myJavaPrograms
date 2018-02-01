
package doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    // if list is empty? working
    private boolean isEmpty(){
        return first == null;
    }
    
    // add first ->working
    public void addFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        
        if(isEmpty())
            last = newNode;
        else {
            first.setPrevious(newNode);
        }
        newNode.setNext(first);
        first = newNode;
    }
    
    // add last ->working
    public void addLast(int data){
        Node newNode = new Node();
        newNode.setData(data);
        
        if(isEmpty()){
            first = newNode;
        }
        else {
            last.setNext(newNode);
            newNode.setPrevious(last);
        }
        last = newNode;
    } 
    
    // delete first ->working
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("The list is empty already!");
        }
        
        else {
            if(first.getNext() == null){
                last = null;
            }
            else {
                first.setPrevious(null);
            }
            first = first.getNext();
        }
    }
    
    // delete last ->working
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("The list is empty already!");
        }
        else {
            
            last = last.getPrevious();
            if(first.getNext() == null){
                first = first.getNext();
            }
            else {
                last.setNext(null);
            }
        }
    }
    
    // delete node with given data -> working
    public void deleteKey(int key){
        
        if(first.getData() == key){
            deleteFirst();
        }
        else if (last.getData() == key){
            deleteLast();
        }
        else{
            Node current = first.getNext();
            
            while(current.getData() != key){
                if(current.getNext() == null){
                    System.out.println("given data is not present!");
                    return;
                }
                current = current.getNext();
            }
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
    }
    
    // add after -> working
    public void addAfter(int key, int data){
        Node current = first;
        while(current.getData() != key){
            if(current.getNext()== null){
                System.out.println("Given data not present");
                return;
            }
            current = current.getNext();
        }
        if(current == last){
            addLast(data);
        }
        else {
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(current.getNext());
            newNode.setPrevious(current);
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
        }    
    }
    
    // display list from first to last node-> working
    public void displayForward(){
        if(isEmpty()){
            System.out.println("the list is empty!");
        }
        else {
            Node current = first;
            
            while(current.getNext() != null){
                System.out.print("["+current.getData()+"]"+ "->");
                current = current.getNext();
            }
            
            System.out.println("[" + current.getData() + "]->[Null]");
        }
    }
    
    // display list from last to first node-> working
    public void displayBackward(){
        if(isEmpty()){
            System.out.println("the list is empty!");
        }
        else {
            Node current = last;
            
            while(current.getPrevious()!= null){
                System.out.print("["+current.getData()+"]"+ "->");
                current = current.getPrevious();
            }
            
            System.out.println("[" + current.getData() + "]->[Null]");
        }
    }
    
    
    
    
    
}
