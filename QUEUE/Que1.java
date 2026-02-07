package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Que1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q1.add(i);
            q2.add(i);
        }




        System.out.println("Queue2:" + q1 + "\nQueue3:" + q2);
        System.out.println(q1.equals(q2));
        // 1700
        // 225
        // 235
        // 35
        // 32
        // 84
        // 918
        // 2073
        // 143
        // 456 Good
        // 678
        // 682
        // 950
        // 622
    }
}
