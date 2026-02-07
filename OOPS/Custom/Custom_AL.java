package Custom;

class CustomArrayList {
    int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int remove() {
        int remove = arr[size--];
        return remove;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class Custom_AL {

    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // list1.add(6);
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        list1.print();
        list1.add(10);
        list1.add(11);
        System.out.println("\nNew:");
        list1.print();
    }
}
