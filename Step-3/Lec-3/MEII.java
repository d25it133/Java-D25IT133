import java.util.*;

public class MEII {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Output: " + majorityElement(nums1)); // [3]

        int[] nums2 = {1};
        System.out.println("Output: " + majorityElement(nums2)); // [1]

        int[] nums3 = {1, 2};
        System.out.println("Output: " + majorityElement(nums3)); // [1, 2]
    }
}
