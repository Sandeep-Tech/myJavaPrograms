// simple shell sort implementation 
// taking gap half of the array length
// then reducing the gap by half until it is one
// list is sorted in the final iteration, when gap is only one

public class Sort {

    public static void main(String[] args) {
        
        int[] intArray = randIntArrayGen(50, 100);
        
        System.out.print("unsorted array: ");
        printArray(intArray);
        
        intArray = shellSort(intArray);
        
        System.out.println("sorted array: ");
        printArray(intArray);
        
    }
    
    
    
    
    public static int[] shellSort(int[] array){
        
        for(int gap=array.length/2; gap>0; gap/=2){
            for(int i=gap; i<array.length;i++){
                int j;
                int current = array[i];
                for(j=i; j>=gap && array[j-gap]>current; j-=gap){
                    array[j] = array[j-gap];
                }
                array[j] = current;
            }
        }
        
        
        
        return array;
    }
    
    
    
    
    private static int[] randIntArrayGen(int nInts, int range){
    int[] newArray = new int[nInts];
        for(int i=0; i<nInts; i++){
            newArray[i] = (int)(Math.random() * range);
            newArray[i]++;
        }
        return newArray;
    }
    
    
    
    
    private static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    
}
