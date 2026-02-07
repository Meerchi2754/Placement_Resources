class CustomArrayList<T> {
    Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public void resize() {
        Object[] temp = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public T remove() {
        T remove = (T) arr[size--];
        return remove;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        arr[index] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class Genrics {
    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // list1.add(6);
        System.out.println("\nNew Using Custom Generics in Integer:");
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        list1.print();
        list1.add(10);
        list1.add(11);
        System.out.println("\nNew Using Custom Generics:");
        list1.print();
        System.out.println("\nUsing Character:");
        CustomArrayList list2 = new CustomArrayList();

        for (int i = 0; i < 10; i++) {
            list2.add('d');
        }
        list2.print();
    }
}
/*
 *  We use Wildcard if we want to restrict the use of the Object. 
 *  For Eg. We in Object we only want Number (which can be anything integer, float, double,etc.) at that time we use Wildcard
 * 
 *  public class WildCardExample<T extends Number>{
 * 
 * }
 */