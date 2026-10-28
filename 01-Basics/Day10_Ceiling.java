public class Day10_Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans); // Output: 16
    }

    static int ceiling(int[] arr, int target) {
        // agar target sabse bade element se bhi bada hai
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // loop khatam hone ke baad start = ceiling
        return arr[start];
    }
}