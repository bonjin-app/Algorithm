public class Example {
    public static void main(String[] args) {
        int[] arr = [45, 20, 60, 35, 10, 55, 90, 85, 75, 25];
        int target = 85;
        sequentialSearch(arr, target);
    }

    public int sequentialSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}