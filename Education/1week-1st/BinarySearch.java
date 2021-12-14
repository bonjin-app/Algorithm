public class Example {
    public static void main(String args[]) {
        int[] arr = [15, 20, 25, 35, 45, 55, 60, 75, 85, 90];
        int target = 85;
        binarySearch(arr, target);
    }

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start <= mid) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("can't find target.");
    }
}