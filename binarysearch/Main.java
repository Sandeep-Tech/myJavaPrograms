
package algo.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = binarySearch(array, 9);
        
        if(index == -1){
            System.out.println("element not present in the array!");
        } else {
            System.out.println("element found at index: " + index);
        }
    }
    
    public static int binarySearch(int[] array,int element){
        int index = -1;
        int start=0, end = (array.length)-1, mid;
        
        while(start <= end){
            mid = (start + end)/2;
            if(array[mid] == element){
                return mid;
            }
            else if(element < array[mid]){
                end = mid-1;
            }
            else if(element > array[mid]){
                start = mid+1;
            }
        }
        return index;
    }
}
