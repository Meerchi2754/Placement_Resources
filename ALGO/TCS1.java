import java.util.ArrayList;

public class TCS1 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        // System.out.println(arr);
        // SUM:24
        // int sum = 0;
        // int len = arr.size() - 1;
        // sum += 10;
        // arr.remove(0);
        // arr.remove(len - 1);
        // len = arr.size() - 1;
        // arr.remove(len);
        // System.out.println(arr);

        // len = arr.size() - 1;
        // sum += 8;
        // arr.remove(0);
        // arr.remove(len - 1);
        // len = arr.size() - 1;
        // arr.remove(len);
        // System.out.println(arr);

        // len = arr.size() - 1;
        // sum += arr.get(len);
        // arr.remove(0);
        // arr.remove(len - 1);
        // len = arr.size() - 1;
        // arr.remove(len);
        // System.out.println(arr + "\nSum:" + sum);

        System.out.println(arr);

        int len = arr.size() - 1;
        int sum = 0;
        sum += arr.get(len - 1);
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        System.out.println(arr + "  Sum:" + sum);

        len = arr.size() - 1;
        sum += arr.get(len - 1);
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        System.out.println(arr + "  Sum:" + sum);

        len = arr.size() - 1;
        sum += arr.get(len - 1);
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        len = arr.size() - 1;
        arr.remove(len);
        System.out.println(arr + "  Sum:" + sum);
    }
}
