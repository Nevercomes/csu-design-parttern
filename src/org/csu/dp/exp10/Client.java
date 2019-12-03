package org.csu.dp.exp10;

/**
 * Created by sun on 2019/12/3
 */
public class Client {

    public static void main(String[] args) {
        DataOperation dataOperation;
        dataOperation = new QuickAndBinaryAdapter(new QuickSort(), new BinarySearch());
        int[] arr = {3, 31, 3, 123, 12, 31, 312, 234, 423, 4};
        dataOperation.search(arr, 312);
        dataOperation.sort(arr);
    }

}
