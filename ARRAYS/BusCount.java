import java.util.*;

public class BusCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = 4;
        int distance[][] = { { 0, 10, 10, 30 }, { 10, 0, 30, 20 }, { 10, 30, 0, 10 }, { 30, 20, 10, 0 } };
        // {{0,10,10,30},{10,0,30,20},{10,30,0,10},{30,20,10,0}}
        // for (int i = 0; i < D; i++) {
        // for (int j = 0; j < D; j++) {
        // distance[i][j] = sc.nextInt();
        // }
        // }

        int emp_station[] = { 23, 52, 11 };
        // {23,52,11}
        // for (int i = 0; i < D - 1; i++) {
        // emp_station[i] = sc.nextInt();
        // }

        int total_capacity = 25;

        int totalbus = 0;

        for (int i = 0; i < emp_station.length; i++) {
            int bus = (int) Math.ceil((double) emp_station[i] / total_capacity);
            totalbus += bus;
        }
        System.out.println(totalbus);
        sc.close();
    }
}
