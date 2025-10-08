import java.util.*;

public class _3S {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,2,-1,-4};
        System.out.println("Output: " + threeSum(nums1));

        int[] nums2 = {0,1,1};
        System.out.println("Output: " + threeSum(nums2));

        int[] nums3 = {0,0,0};
        System.out.println("Output: " + threeSum(nums3));
    }
}
