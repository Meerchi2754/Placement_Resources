public class Zeroarray {
    static boolean checkzero(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        if (checkzero(arr)) {
            System.out.println("The array is Zero Array.");
        } else {
            System.out.println("The array is not zero!!");
        }
        int[][] queries = { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[0].length; j++) {
                System.out.print(queries[i][j] + " ");
            }
            System.out.println();
        }
    }
}
