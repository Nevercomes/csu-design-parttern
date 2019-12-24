package org.csu.dp.experiment1.exp10;

/**
 * Created by sun on 2019/12/3
 */
public class QuickAndBinaryAdapter implements DataOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public QuickAndBinaryAdapter(QuickSort quickSort, BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    public void sort(int[] arr) {
        quickSort.quickSort(arr);
    }

    public void search(int[] arr, int target) {
        binarySearch.binarySearch(arr, target);
    }

    public void setQuickSort(QuickSort quickSort) {
        this.quickSort = quickSort;
    }

    public void setBinarySearch(BinarySearch binarySearch) {
        this.binarySearch = binarySearch;
    }
}
