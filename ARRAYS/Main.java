import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Heaps<Integer> heap = new Heaps<>();
        PriorityQueue <Integer> s=new PriorityQueue();
        heap.insert(1);
        heap.insert(3);
        heap.insert(15);
        heap.insert(6);
        heap.insert(8);
        heap.printH();
        ArrayList<Integer> sorted = heap.heapSort();
        System.out.println(sorted);
    }
}
