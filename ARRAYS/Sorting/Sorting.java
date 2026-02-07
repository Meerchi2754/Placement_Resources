public class Sorting {
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void bubblesort(int a[]) {
        int n = a.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.print("\nAfter Sorting:");
        print(a);
    }

    static void insertsort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        System.out.print("\nAfter sorting Insertion Sort:");
        print(a);
    }

    static void sort(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void merge(int a[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            merge(a, left, mid);
            merge(a, mid + 1, right);

            sort(a, left, mid, right);
        }
    }

    static int parition(int a[],int l, int r){
        int pivot=a[r];
        int i=l-1;
        for(int j=l;j<=r;j++){
            if(a[j]<pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);  
        return i + 1;
    }
    static void quicksort(int a[],int left,int right){
        if(left<right){
            int pi=parition(a,left,right);
        
            quicksort(a, left, pi-1);
        quicksort(a, pi, right);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 4, 7, 89, 5, 361, 5 };
        int n = arr.length;
        System.out.println("Before Sorting:");
        print(arr);
        // bubblesort(arr);
        // insertsort(arr);
        // quicksort(arr,0,n-1);
        //countingsort();
        //radixsort();
        merge(arr, 0, n - 1);
        System.out.println("\nAfter Sorting Merge Sorting:");
        print(arr);
    }
}