public class RD {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Points to last unique element
        int j = 1; // Scans ahead

        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.print("Unique count: " + k1 + " | Array: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.print("Unique count: " + k2 + " | Array: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
