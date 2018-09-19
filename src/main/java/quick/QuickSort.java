package quick;

import java.util.Arrays;

/**
 * Created by hejiajun
 * On 2018/9/19
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 1};
        int low = 0;
        int high = arr.length - 1;
        sort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        // 基准固定取第一位，可以优化
        int pivot = arr[low];

        while (end > start) {
            while (end > start && arr[end] >= pivot)
                end--;
            swap(arr, start, end);
            while (end > start && arr[start] <= pivot)
                start++;
            swap(arr, start, end);
        }

        if (start > low)
            sort(arr, low, start - 1);
        if (end < high)
            sort(arr, end + 1, high);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i] + arr[j];
        arr[i] = temp - arr[i];
        arr[j] = temp - arr[j];
    }
}
