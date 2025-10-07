public class SR {

    public static boolean checkSortedAndRotated(int[] nums) {
        int n = nums.length;
        int dropCount = 0;

        for (int i = 0; i < n; i++) {
            // Compare current with next in circular manner
            if (nums[i] > nums[(i + 1) % n]) {
                dropCount++;
            }
            // More than one drop means not a valid rotated sorted array
            if (dropCount > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};       // true
        int[] nums2 = {2, 1, 3, 4};          // false
        int[] nums3 = {1, 2, 3};             // true
        int[] nums4 = {1, 1, 1};             // true (with duplicates)

        System.out.println(checkSortedAndRotated(nums1));
        System.out.println(checkSortedAndRotated(nums2));
        System.out.println(checkSortedAndRotated(nums3));
        System.out.println(checkSortedAndRotated(nums4));
    }
}
