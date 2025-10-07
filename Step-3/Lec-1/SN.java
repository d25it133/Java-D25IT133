import java.util.HashSet;

public class SN {

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        // Only one element remains
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number: " + singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + singleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println("Single number: " + singleNumber(nums3)); // Output: 1
    }
}
