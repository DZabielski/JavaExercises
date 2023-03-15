package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] toSort = {20, 4, 44, 123, 22, 23, 11, 3, 13, 51, 236, 43};
        int temporaryInt;
        System.out.println("Array to sort: \n" + Arrays.toString(toSort));

        for (int i = 0; i < toSort.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < toSort.length; j++) {
                if (toSort[min] > toSort[j]) {
                    min = j;
                }
            }
            temporaryInt = toSort[i];
            toSort[i] = toSort[min];
            toSort[min] = temporaryInt;
        }

        System.out.println("Sorted array:\n" + Arrays.toString(toSort));
    }
}
