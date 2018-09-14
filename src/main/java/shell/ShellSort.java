package shell;

import java.util.Arrays;

/**
 * Created by hejiajun
 * On 2018/9/14
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int j, temp;
        for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;

                    j -= gap;
                }
            }
        }
    }
}
