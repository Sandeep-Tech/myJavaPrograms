
package algo.merge_sort;

public class MergeSort {
    
    private int[] array;
    
    public MergeSort(int[] array) {
        this.array = array;
    }
    
    
    
    public void merge(int[] array, int start,int mid ,int end){
        int[] temp = new int[(end-start)+1];
        int k=0;
        int leftStart = start, rightStart = mid+1;
        
        while((leftStart <= mid) && (rightStart <= end)){
            if(array[leftStart] < array[rightStart]){
                temp[k] = array[leftStart];
                leftStart++;
            } else {
                temp[k] = array[rightStart];
                rightStart++;
            }
            k++;
        }
        
        if(leftStart <= mid){
            while(leftStart <= mid){
                temp[k] = array[leftStart];
                k++; leftStart++;
            }
        } else if(rightStart <= end){
            while(rightStart <= end){
                temp[k] = array[rightStart];
                k++; rightStart++;
            }
        }
            array = temp;
    } 
    
    public void sort(){
        sort(array, 0, array.length-1);
        for(int x: array){
            System.out.print(x + " ");
        }
    }
    
    public void sort(int[] array, int start, int end){
        int mid = (start+end)/2;
        if(start >= end){
            return;
        }
        else {
            sort(array, start, mid); // breaks left half
            sort(array, mid+1, end); // breaks right half
            merge(array,start,mid,end); // merges the array in sorted order
        }
    }
}
