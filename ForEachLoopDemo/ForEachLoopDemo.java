public class ForEachLoopDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Demo of \"for each\" loop:");
        System.out.println("Display value from array:");
         int i[] = {1,2,3,4,5,6,7,8,9,10};
         for(int j : i)
         {
          System.out.println("Value of j is: " + j);
         }
        
         System.out.println("Search number using \"for-each\" loop");
         int array[] = {9,5,2,0,7,4,38,42,23};
         int num = 42;
         boolean found = false;
         for(int search : array ){
             if(search == num){
                 found = true;
                 break;
             }
             
         }
         if(found)
                 System.out.println("Value Found.");
             else
                 System.out.println("Value not found.");
         
         
         
    }    
}