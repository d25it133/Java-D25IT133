import java.util.Arrays;

public class RA {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;  // next positive position
            } else {
                result[negIndex] = num;
                negIndex += 2;  // next negative position
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Output: " + Arrays.toString(rearrangeArray(nums1)));

        int[] nums2 = {-1, 1};
        System.out.println("Output: " + Arrays.toString(rearrangeArray(nums2)));
    }
}
