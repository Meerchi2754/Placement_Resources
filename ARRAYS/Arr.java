import java.util.*;

public class Arr {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 1, 2, 4, 5, 6 };
        // Reverse of Array:

        // Rotate Array:
        // Palidrome array:
        // 268:
        // 283
        // 7
        // 287
        // 53 Maximum SubArray
        // Find Peek Element in Array.
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        // for()
        // Printing the array in Descending order Input:{0,1,2} Output:{2,1,0}
    }
}