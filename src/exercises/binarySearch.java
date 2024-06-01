package exercises;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 6, 7, 9, 10, 15, 21, 47, 55, 67, 78, 79, 85, 91, 96, 100};
        int elem = 120;
        System.out.println(getBinarySearch(arr, elem, 0, arr.length));

    }
    public static int getBinarySearch(int[] arr, int elem, int l, int r) {
        int index = -1;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (elem == arr[mid]) {
                index = mid;
                break;
            }
            if (arr[mid] < elem) {
                l= mid+1;
            } else {
                r=mid-1;
            }
        }
        return index;
    }
}
