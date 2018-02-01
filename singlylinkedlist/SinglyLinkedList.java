
package singlylinkedlist;

public class SinglyLinkedList {

    private Node first;
    
    public boolean isEmpty(){
        return first == null;        
    }
    
    public void addFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        
        if(isEmpty()){
            newNode.setLink(null);
            first = newNode;            
        }
        else{            
            newNode.setLink(first);
            first = newNode;
        }
    }
    
    public void deleteFirst(){
        if(isEmpty())
            System.out.println("The list is empty!");
        else {
            first = first.getLink();
        }
    }
    
    public void addLast(int data){
        Node newNode = new Node();
        newNode.setData(data);
        
        if(isEmpty()){
            newNode.setLink(null);
            first = newNode;
        }
        else {
            Node tempNode = first;
            while(tempNode.getLink()!=null){
                tempNode = tempNode.getLink();
            }
            tempNode.setLink(newNode);
            newNode.setLink(null);
        }
    }
    
    public void deleteLast(){
        if(isEmpty())
            System.out.println("The list is empty!");
        else if(first.getLink() == null){
            first = null;
        }
        else {
            Node delNode = first;
                    
            while(delNode.getLink().getLink() != null){
                delNode = delNode.getLink();
            }
            delNode.setLink(null);
        }
    }
    
    public void addAfter(int locationData, int insertData){
        Node newNode = new Node();
        newNode.setData(insertData);
        
        if(isEmpty()){
            System.out.println("The list is empty!");          
        }
        else {
            Node tempNode = first;
            
            while(tempNode.getLink() != null){
                if(tempNode.getData() == locationData){
                    break;
                }
                tempNode = tempNode.getLink();
            }
            
            if(tempNode.getLink() == null && tempNode.getData() != locationData){
                System.out.println("Given data not present!");
            }
            else{
                newNode.setLink(tempNode.getLink());
                tempNode.setLink(newNode);
            }
        }
        
    }
    
    public void deleteAfter(int locationData){
        if(isEmpty()){
            System.out.println("The list is empty!");          
        }
        else {
            Node tempNode = first;
            
            while(tempNode.getLink() != null){
                if(tempNode.getData() == locationData){
                    break;
                }
                tempNode = tempNode.getLink();
            }
            
            if(tempNode.getLink() == null && tempNode.getData() != locationData){
                System.out.println("Given data not present!");
            }
            else{
                Node delAddress = tempNode.getLink().getLink();
                tempNode.setLink(delAddress);
            }
        }
    }
    
    public void addBefore(int locationData, int insertData){
        if(isEmpty()){
            System.out.println("The list is empty!");          
        }
        else {
            if(first.getData() == locationData){
                addFirst(insertData);
            }
            else {
                Node tempNode = first;
                
                Node newNode = new Node();
                newNode.setData(insertData);
                
                boolean dataFoundCondition;
                
                while(tempNode.getLink().getLink() != null){ 
                    dataFoundCondition = tempNode.getLink().getData() == locationData;
                    
                    if(dataFoundCondition){
                        break;
                    }
                    tempNode = tempNode.getLink();
                }
                
                if(tempNode.getLink().getLink() == null && tempNode.getLink().getData() != locationData){
                    System.out.println("given data does not exist!");
                    return;
                }
                
                newNode.setLink(tempNode.getLink());
                tempNode.setLink(newNode);                
            }
            
        }
        
    }
    
//    public void addBefore(int locationData){
//        if(isEmpty()){
//            System.out.println("List is empty already!");
//        }
//        else {
//            if(first.getData() == locationData)
//                System.out.println("No node before the given one! ");
//            else if(first.getLink().getData() == locationData) {
//                deleteFirst();
//            }
//            else {
//                Node tempNode = first;
//                
//                while(tempNode.getLink().getLink() != null){
//                    if(){
//                        
//                    }
//                }
//            }
//        }
//    }
    
    public void display(){
        if(!isEmpty()){
            Node tempNode = first;
            
            while(tempNode != null){
                System.out.print(tempNode.getData());
                System.out.print("->");
                tempNode = tempNode.getLink();
            }
            System.out.print("null");
            System.out.println("");
        } 
        else{
            System.out.println("List is empty");
            System.out.println("");
        }        
    }
    
    
    
}


























