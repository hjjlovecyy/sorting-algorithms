package selection;

import java.util.Arrays;

/**
 * Created by hejiajun
 * On 2018/9/13
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int minIdx = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
