public class Rain {
    // static void trap(int[] height) {
    // int n = height.length;
    // if (n == 0)
    // return;

    // int[] max_left = new int[n];
    // int[] max_right = new int[n];

    // // Fill max_left
    // max_left[0] = height[0];
    // for (int i = 1; i < n; i++) {
    // max_left[i] = Math.max(height[i], max_left[i - 1]);
    // }

    // // Fill max_right
    // max_right[n - 1] = height[n - 1];
    // for (int i = n - 2; i >= 0; i--) {
    // max_right[i] = Math.max(height[i], max_right[i + 1]);
    // }

    // // Calculate total trapped water
    // int trapped_water = 0;
    // for (int i = 0; i < n; i++) {
    // trapped_water += Math.min(max_left[i], max_right[i]) - height[i];
    // }

    // System.out.println("Total trapped water: " + trapped_water);
    // }

    // static int trapRainWater(int[][] heightMap) {
    // int m = heightMap.length;
    // int n = heightMap[0].length;

    // int trappedWater = 0;

    // // Skip border cells because water can't be trapped there
    // for (int i = 1; i < m - 1; i++) {
    // for (int j = 1; j < n - 1; j++) {

    // // Find max in all four directions

    // // Left max
    // int leftMax = heightMap[i][j];
    // for (int k = 0; k < j; k++) {
    // leftMax = Math.max(leftMax, heightMap[i][k]);
    // }

    // // Right max
    // int rightMax = heightMap[i][j];
    // for (int k = j + 1; k < n; k++) {
    // rightMax = Math.max(rightMax, heightMap[i][k]);
    // }

    // // Top max
    // int topMax = heightMap[i][j];
    // for (int k = 0; k < i; k++) {
    // topMax = Math.max(topMax, heightMap[k][j]);
    // }

    // // Bottom max
    // int bottomMax = heightMap[i][j];
    // for (int k = i + 1; k < m; k++) {
    // bottomMax = Math.max(bottomMax, heightMap[k][j]);
    // }

    // int minHeight = Math.min(Math.min(leftMax, rightMax), Math.min(topMax,
    // bottomMax));

    // if (minHeight > heightMap[i][j]) {
    // trappedWater += minHeight - heightMap[i][j];
    // }
    // }
    // }
    // return trappedWater;
    // }
    static void boundaryTraversal(int[][] height) {
        int i = 0;
        int j = 0;
        int x = height.length;
        int y = height[0].length;

        while (i <= y - 1 && j == 0) {
            System.out.print(height[j][i] + " ");
            i++;
            // if(i==y-1){
            // j++;
            // }
        }
        if (i == y) {
            j++;
        }
        while (j <= x - 1) {
            System.out.print(height[j][i - 1] + " ");
            j++;
        }
        if (i == y) {
            i--;
        }
        while (i > 0) {
            System.out.print(height[j - 1][i - 1] + " ");
            i--;
        }
        if (j == x) {
            j--;
        }
        while (j > 1) {
            System.out.print(height[j - 1][i] + " ");
            j--;
        }
    }

    static void spiral(int a[][]) {
        int top = 0;
        int bottom = a.length - 1;
        int left = 0;
        int right = a[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Print bottom row (right to left) if still valid
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (bottom to top) if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    static void print(int a[][]) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setzero(int a[][]) {
        int rows = a.length;
        int col = a[0].length;
        boolean ZeroRow[] = new boolean[rows];
        boolean ZeroCol[] = new boolean[col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    ZeroRow[i] = true;
                    ZeroCol[j] = true;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (ZeroCol[j] || ZeroRow[i]) {
                    a[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 47
        // 48
        // 407
        // 451
        // 54
        // 59
        // 885
        // 2326
        // H.W.
        // 59
        // 289
        // 498
        int height[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        // System.out.println(trap(height));
        // boundaryTraversal(height);
        // spiral(height);
        print(height);
        setzero(height);
        print(height);
    }
}