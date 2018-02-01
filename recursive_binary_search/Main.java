
package algo.recursive_binary_search;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
//        int[] array = {1,2,3,4};

        int index = recursiveBinarySearch(array, 238, 0, array.length-1);
        
        if(index == -1){
            System.out.println("element not present in the array!");
        } else {
            System.out.println("element found at index: " + index);
        }
    }
  
    public static int recursiveBinarySearch(int[] array, int findElement, int start, int end){
        if(start > end){ // ends the loop
            return -1;
        }
        else{
            int index = (start+end)/2; 
            if(array[index] == findElement){ // return the index
                return index; 
            }
            
            else if(array[index] < findElement){ // recalls the method
                return recursiveBinarySearch(array, findElement, index +1 , end);
            }
            
            else /*if(array[index] > findElement)*/{ // recalls the method
                return recursiveBinarySearch(array, findElement, start, index-1);
            }
        }
    }
    
}
