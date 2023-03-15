package bubble_sort;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] toSort = new int[]{12, 2, 44, 13, 14, 55, 16, 7, 3, 19, 42, 41, 62, 26, 24};
        int x; // temp var

        System.out.println("Array to sort:\n" + Arrays.toString(toSort));

        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - i - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    x = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = x;
                }
            }
        }
        System.out.println("Sorted array:\n" + Arrays.toString(toSort));
    }

}
