import java.util.*;

public class Sofa {

    static class State {
        int r, c, orient, dist;

        State(int r, int c, int orient, int dist) {
            this.r = r;
            this.c = c;
            this.orient = orient; // 0 = horizontal, 1 = vertical
            this.dist = dist;
        }
    }

    static int M, N;
    static char[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        grid = new char[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int startR = -1, startC = -1, startOrient = -1;
        int goalR = -1, goalC = -1, goalOrient = -1;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 's') {

                    if (j + 1 < N && grid[i][j + 1] == 's') {
                        startR = i;
                        startC = j;
                        startOrient = 0;
                    }

                    if (i + 1 < M && grid[i + 1][j] == 's') {
                        startR = i;
                        startC = j;
                        startOrient = 1;
                    }
                }

                if (grid[i][j] == 'S') {
                    if (j + 1 < N && grid[i][j + 1] == 'S') {
                        goalR = i;
                        goalC = j;
                        goalOrient = 0;
                    }
                    if (i + 1 < M && grid[i + 1][j] == 'S') {
                        goalR = i;
                        goalC = j;
                        goalOrient = 1;
                    }
                }

            }
        }

        int ans = bfs(startR, startC, startOrient, goalR, goalC, goalOrient);
        if (ans == -1)
            System.out.println("Impossible");
        else
            System.out.println(ans);
        sc.close();
    }

    static int bfs(int sr, int sc, int so, int gr, int gc, int go) {
        boolean[][][] visited = new boolean[M][N][2];
        Queue<State> q = new LinkedList<>();
        q.add(new State(sr, sc, so, 0));
        visited[sr][sc][so] = true;

        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.r == gr && cur.c == gc && cur.orient == go) {
                return cur.dist;
            }

            for (int k = 0; k < 4; k++) {
                int nr = cur.r + dr[k];
                int nc = cur.c + dc[k];
                if (canPlace(nr, nc, cur.orient) && !visited[nr][nc][cur.orient]) {
                    visited[nr][nc][cur.orient] = true;
                    q.add(new State(nr, nc, cur.orient, cur.dist + 1));
                }
            }

            int newOrient = 1 - cur.orient;
            if (canRotate(cur.r, cur.c)) {
                if (!visited[cur.r][cur.c][newOrient]) {
                    visited[cur.r][cur.c][newOrient] = true;
                    q.add(new State(cur.r, cur.c, newOrient, cur.dist + 1));
                }
            }
        }
        return -1;
    }

    static boolean canPlace(int r, int c, int orient) {
        if (orient == 0) { // horizontal
            if (c + 1 >= N || r < 0 || r >= M)
                return false;
            return free(r, c) && free(r, c + 1);
        } else { // vertical
            if (r + 1 >= M || c < 0 || c >= N)
                return false;
            return free(r, c) && free(r + 1, c);
        }
    }

    static boolean free(int r, int c) {
        return (r >= 0 && r < M && c >= 0 && c < N && grid[r][c] != 'H');
    }

    static boolean canRotate(int r, int c) {

        if (r + 1 >= M || c + 1 >= N)
            return false;
        return free(r, c) && free(r + 1, c) && free(r, c + 1) && free(r + 1, c + 1);

    }

}
