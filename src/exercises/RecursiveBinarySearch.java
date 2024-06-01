package exercises;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 6, 7, 9, 10, 15, 21, 47, 55, 67, 78, 79, 85, 91, 96, 100};
        int elem = 0;
        System.out.println(getBinarySearch(arr, elem, 0, arr.length));
    }

    public static int getBinarySearch(int[] arr, int elem, int l, int r) {
        int index = -1;
        if (l <= r) {
            int m = l + (r - l) / 2;
            if (elem == arr[m]) {
                index = m;
                return index;
            }
            if (arr[m] < elem) {
                return getBinarySearch(arr, elem, m + 1, r);
            } else {
                return getBinarySearch(arr, elem, l, m - 1);
            }
        }
        return index;

    }
}
