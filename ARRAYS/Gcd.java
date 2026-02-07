import java.util.ArrayList;
import java.util.Arrays;

public class Gcd {
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return ((a * b) / gcd(a, b));
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 2, 7, 6, 2 };
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        System.out.println(array);
        for (int i = 0; i < array.size() - 1; i++) {
            int x = array.get(i);
            int y = array.get(i + 1);
            if (gcd(x, y) > 1) {
                array.remove(i);
                array.remove(i + 1);
                array.add(lcm(x, y));
            }
        }
        System.out.println(array);
    }
}
