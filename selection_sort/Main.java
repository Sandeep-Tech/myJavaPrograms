
package algo.selection_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {3,45,29,84,28,64,23,34,45,2};
        int[] newArray = selectionSort(array);
        
        System.out.print("sorted array is: ");
        for(int i : newArray){
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    
    public static int[] selectionSort(int[] array){
        int i=0,j;
        
        while(i < array.length){
//            System.out.println("in 1st while loop");
            j = i;
            while(j < array.length){
//                System.out.println("in 2st while loop");
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }
        return array;
    }
}
