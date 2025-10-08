import java.util.Arrays;

public class NP {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find pivot where nums[i] < nums[i + 1]
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse entire array (last permutation)
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element on the right of pivot
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix after pivot
        reverse(nums, pivot + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println("Output: " + Arrays.toString(nums1)); // [1,3,2]

        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Output: " + Arrays.toString(nums2)); // [1,2,3]

        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Output: " + Arrays.toString(nums3)); // [1,5,1]
    }
}
