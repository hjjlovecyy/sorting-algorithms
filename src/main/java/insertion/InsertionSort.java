package insertion;

import java.util.Arrays;

/**
 * Created by hejiajun
 * On 2018/9/13
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int preIdx = 0;
        int current = 0;
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            preIdx = i - 1;
            while (preIdx >= 0 && arr[preIdx] > current) {
                arr[preIdx + 1] = arr[preIdx];
                preIdx--;
            }
            arr[preIdx + 1] = current;
        }
    }
}
