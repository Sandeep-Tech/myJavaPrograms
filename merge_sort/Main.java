
package algo.merge_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,5,7,55,94,2,2,9,39,42};
        MergeSort sorter = new MergeSort(array);
        sorter.sort();
    }
}
