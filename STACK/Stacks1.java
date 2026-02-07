import java.util.*;

public class Stacks1 {
    static void print(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        print(s);
        System.out.print(temp + " ");
        s.push(temp); // Restore the stack
    }

    static void insertatbottom(Stack<Integer> s, int a) {
        if (s.isEmpty()) {
            s.push(a);
            return;
        }
        int temp = s.pop();
        insertatbottom(s, a);
        s.push(temp);
    }

    static int middle(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        int length = s.size();
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            temp.push(s.pop());
        }
        int middleElement = s.peek();
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        return middleElement;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i < 10; i++) {
            s.push(i);
        }
        // System.out.println(s.size());
        // System.out.print("\nBefore Insertion");
        print(s);
        int a = s.pop();
        s.pop();
        System.out.println("A:" + a);
        print(s);
        // insertatbottom(s, 0);
        // System.out.print("\nAfter Insertion");
        // print(s);
        // System.out.println("\nMiddle Element:" + middle(s));

        // int a[] = new int[5];
        // Arrays.fill(a, -1);
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
        // 20
        // 225
        // 503
        // 496
    }

}
