public class Sorter {    
    
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{4,2,9,7,4,5,1,0,2,3,6};
        System.out.print("unsorted array:");
        for(int x: unsortedArray){
            System.out.print(" " + x);  
        }
        
        System.out.println("");    
        
        int[] sortedArray = sort(unsortedArray, 0, 10);
        System.out.print("sorted array:");
        for(int x: sortedArray){
            System.out.print(" " + x);  
        }
       
    }
    
    public static int[] sort(int[] arr, int start, int end){
        if(end>start){
            int partitionIndex = partition(arr, start, end);
            sort(arr,start, partitionIndex-1);
            sort(arr,partitionIndex+1, end);
        }
        return arr;
    }
    
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int partitionIndex = start;
        
        for(int i = start; i<end; i++){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = pivot;
        arr[end] = arr[partitionIndex];
        arr[partitionIndex] = temp;
        
        return partitionIndex;
    }
     
    
}
