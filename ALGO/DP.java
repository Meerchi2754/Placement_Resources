import java.util.Arrays;

public interface DP {
    static int nthFibonacci(int n) {

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return nthFibonacciUtil(n, memo);
    }

    static int nthFibonacciUtil(int n, int a[]) {
        if (n <= 1) {
            return n;
        }
        if (a[n] != -1) {
            return a[n];
        }
        a[n] = nthFibonacciUtil(n - 1, a) + nthFibonacciUtil(n - 2, a);
        return a[n];
    }

    static int ficobani(int a) {
        // if (a == 0 || a == 1) {
        // return 1;
        // }
        // return ficobani(a - 1) + ficobani(a - 2);

        // Tabulariation:
        int dp[] = new int[a + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= a; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[a];

        // Memorisation:

    }

    public static void main(String[] args) {
        // Dyanimic Programming:
        // Memorisation : Use array
        // Tabulation Form : Use iteration
        System.out.println("Memorisation:" + ficobani(6));
        System.out.println("Tabulation:" + nthFibonacci(6));
        //LCS - 1143    
        //198   
        //House Robber
        //House Robber-II
        //House Robber-III
    }
}
