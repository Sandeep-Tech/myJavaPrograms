
package algo.recursive_linear_search;

public class Main {
    public static void main(String[] args) {
        int index = search(new int[] {1,2,3,4,5,6,7,8,9}, 7, 0);
        if(index == -1){
            System.out.println("number not in array");
            return;
        }
        System.out.println("number found at index: " + index);
    }
    
    public static int search(int[] array, int searchNum, int i){
        if(array[i] == searchNum){
            return i;
        }
        else if(i >= array.length-1){
            return -1;
        }
        else {
            return search(array, searchNum, i+1);
        }
    }
    
}
