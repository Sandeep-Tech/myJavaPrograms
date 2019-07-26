public class Sort {
    public static void main(String[] args) {
        int[] array =  {33,84,97,51,68,48,24,19,56,54};
        System.out.print("unsorted array: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        System.out.print("sorted array: ");
        array = sort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    
    
    public static int[] sort(int[] array){
        for(int i = array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j] > array[j+1]){
                    array = swap(array, j, j+1);
                }
            }
        }
        
        return array;
    }
    
    
    
    private static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    } 
}
