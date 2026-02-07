import java.util.*;

class Heaps<T extends Comparable<T>> {
    ArrayList<T> list;

    public Heaps() {
        list = new ArrayList<>();
    }

    void printH() {
        System.out.print(list + " ");
    }

    void swap(int left, int right) {
        T temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }

    void uphead(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            uphead(p);
        }
    }

    void downHeap(int index) {
        int min = index;
        int lft = left(index);
        int rght = right(index);
        if (lft < list.size() - 1 && list.get(min).compareTo(list.get(lft)) > 0) {
            min = lft;
        }
        if (rght < list.size() - 1 && list.get(min).compareTo(list.get(rght)) > 0) {
            min = rght;
        }
        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("List is Empty!!");
        }
        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    int parent(int index) {
        return (index - 1) / 2;
    }

    int left(int index) {
        return (index * 2) + 1;
    }

    int right(int index) {
        return (index * 2) + 2;
    }

    void insert(T value) {
        list.add(value);
        uphead(list.size() - 1);
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> result = new ArrayList<>();
        while (!list.isEmpty()) {
            result.add(this.remove());
        }
        return result;
    };
}
