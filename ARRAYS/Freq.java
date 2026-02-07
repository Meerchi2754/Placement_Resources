import java.util.*;

public class Freq {
    static int[] topKfrq(int[] a, int k) {
        int result[] = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 1;
        for (int ar : a) {
            freq.put(ar, freq.getOrDefault(ar, 0) + 1);
        }
        System.out.println(freq);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        int k = 2;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        int[] result = topKfrq(arr, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
