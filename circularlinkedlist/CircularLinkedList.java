
package circularlinkedlist;

public class CircularLinkedList {
    // insert first--done
    // insert last--done
    // delete first--done  
    
    private Node first;
    private Node last;
    
    private boolean isEmpty(){
        return first == null;
    }
    
    
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty()){
            last = newNode;
        }
        newNode.setLink(first);
        first = newNode;   
    }
    
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.setData(data);
        
        if(isEmpty()){
            first.setLink(newNode);
        }
        last.setLink(newNode);
        last = newNode;
    }
    
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty already!");
        }
        else if(first.getLink() == null) {
            last = null;
        }    
        first = first.getLink();
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("The list is empty!");
        }
        else {
                Node currentNode = first;
                while(currentNode != null){
                    System.out.print("[" + currentNode.getData() + "]" + "->");
                    currentNode = currentNode.getLink();
                }
                System.out.println("[null]"); 
            }
    }
}
