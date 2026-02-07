public class Rev_3 {
    static void rev(int a[], int k) {
        // int b[] = new int[a.length];
        for (int i = 0; i < a.length - 2; i++) {
            // System.out.print(a[i] + " ");
            if (i % k == 0) {
                int temp = a[i];
                a[i] = a[i + 2];
                a[i + 2] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int k = 4;
        rev(arr, k);
    }
}
