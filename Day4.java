import java.util.Arrays;

public class Day4 {
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int gap = nextGap(m + n);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < m + n) {
                int a = get(arr1, arr2, m, i);
                int b = get(arr1, arr2, m, j);

                if (a > b) {
                    set(arr1, arr2, m, i, b);
                    set(arr1, arr2, m, j, a);
                }
                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    private static int get(int[] arr1, int[] arr2, int m, int idx) {
        return (idx < m) ? arr1[idx] : arr2[idx - m];
    }

    private static void set(int[] arr1, int[] arr2, int m, int idx, int val) {
        if (idx < m) arr1[idx] = val;
        else arr2[idx - m] = val;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1, arr2);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        int[] arr3 = {10, 12, 14};
        int[] arr4 = {1, 3, 5};
        merge(arr3, arr4);
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
    }
}
