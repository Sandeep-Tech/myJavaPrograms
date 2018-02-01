
package algo.insertion_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,62,56,9,35,34,65,54,36};
        array = insertionSort(array);
        
        System.out.print("sorted array is: ");
        for(int i: array){ 
            System.out.print(" " + i);
        }
        
        System.out.println("");
    }
    
    public static int[] insertionSort(int[] array){
        int i,j;
        /* { 2, 62, 56,  9, 35, 34, 65, 54, 36} */
        /* {00, 01, 02, 03, 04, 05, 06, 07, 08} */
        /* {62, 02, 02, 03, 04, 05, 06, 07, 08} */
        for(i=1; i<array.length; i++ ){  
            int tempI = i;
            for(j=i-1; j>=0; j--){
                if(array[tempI] < array[j]){
                    int temp = array[j];
                    array[j] = array[tempI];
                    array[tempI] = temp;
                    tempI = j;
                }
            }
        }
        return array;
    }
    
    
    
}
