package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hejiajun
 * On 2018/9/18
 */
public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {8, 4, 2, 9, 1};
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            return arr;
        } else {
            int middle = (length + 1) / 2;
            int[] left = Arrays.copyOfRange(arr, 0, middle);
            int[] right = Arrays.copyOfRange(arr, middle, length);
            return merge(sort(left), sort(right));
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>(arr1.length + arr2.length);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i: arr1) {
            list1.add(i);
        }

        for (int i: arr2) {
            list2.add(i);
        }

        while (list1.size() > 0 && list2.size() > 0) {
            int a = list1.get(0);
            int b = list2.get(0);
            if (a <= b) {
                result.add(list1.remove(0));
            } else {
                result.add(list2.remove(0));
            }
        }

        while (list1.size() > 0) {
            result.add(list1.remove(0));
        }

        while (list2.size() > 0) {
            result.add(list2.remove(0));
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
