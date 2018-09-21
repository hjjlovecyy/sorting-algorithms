package count;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hejiajun
 * On 2018/9/21
 */
public class CountSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);

        System.out.println(Arrays.toString(arr));

        int[] result = sort(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;
        int max = 0;
        int idx = 0;
        int sum = 0;
        int[] result = new int[length];

        // 找出原数组最大值，并构建中间数组
        for (int i = 0; i < length; i++) {
            int temp = arr[i];
            if (temp > max)
                max = temp;
        }
        int[] tempArr = new int[max + 1];

        // 统计数字出现次数，存储进中间数组
        for (int i = 0; i < length; i++) {
            tempArr[arr[i]]++;
        }

        // 对所有的计数累加
        for (int i = 0; i < tempArr.length; i++) {
            sum += tempArr[i];
            tempArr[i] = sum;
        }

        // 反向填充目标数组
        for (int i = length - 1; i >= 0; i--) {
            result[tempArr[arr[i]] - 1] = arr[i];
            tempArr[arr[i]]--;
        }

        return result;
    }
}
