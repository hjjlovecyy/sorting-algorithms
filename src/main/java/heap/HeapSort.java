package heap;

import java.util.Arrays;

/**
 * Created by hejiajun
 * On 2018/9/18
 */
public class HeapSort {
    public static void main(String[] args) {
//        int[] arr = {8, 4, 2, 9, 1};
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 9, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        // 先构建大顶堆，从下到上，从右到左
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        // 从 i 结点的左子结点开始，也就是 2i+1 处开始
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            // 如果左子结点小于右子结点，k 指向右子结点
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }

            if (temp >= arr[k])
                break;

            // 如果子节点大于父节点，将子节点值赋给父节点
            arr[i] = arr[k];
            i = k;
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i] + arr[j];
        arr[i] = temp - arr[i];
        arr[j] = temp - arr[i];
    }

}
