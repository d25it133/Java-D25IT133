public class MN {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums1)); // Output: 2

        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + missingNumber(nums2)); // Output: 2

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums3)); // Output: 8
    }
}
