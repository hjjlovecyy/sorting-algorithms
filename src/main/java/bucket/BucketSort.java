package bucket;

import java.util.*;

/**
 * Created by hejiajun
 * On 2018/9/21
 */
public class BucketSort {
    public static int bucketSize = 10;
    public static int arraySize = 10;

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        List<Integer> buckets[] = new ArrayList[bucketSize];
        List<Integer> result = new ArrayList<>(bucketSize * arraySize);

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] / arraySize;
            if (null == buckets[temp])
                buckets[temp] = new ArrayList<>();
            buckets[temp].add(arr[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            // 为了演示桶排序而已
            Collections.sort(buckets[i]);
            result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
