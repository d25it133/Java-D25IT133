public class MZ {

    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int n = nums.length;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[zeroCount++] = nums[i];
            }
        }

        // Fill remaining positions with zero
        while (zeroCount < n) {
            nums[zeroCount++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("After moving zeroes: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("After moving zeroes: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
