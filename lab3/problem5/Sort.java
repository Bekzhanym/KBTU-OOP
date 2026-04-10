public class Sort {

    static <E> void swap(E[] array, int i, int j) {
        E t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array.length < 2) {
            return;
        }
        E[] aux = (E[]) new Comparable[array.length];
        mergeSort(array, aux, 0, array.length - 1);
    }

    private static <E extends Comparable<E>> void mergeSort(E[] a, E[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, aux, lo, mid);
        mergeSort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static <E extends Comparable<E>> void merge(E[] a, E[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
