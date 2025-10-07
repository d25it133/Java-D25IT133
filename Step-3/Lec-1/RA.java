public class RA {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        int count = 0; // Number of elements placed
        for (int start = 0; count < n; start++) {
            int current = start;
            int prevValue = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prevValue;
                prevValue = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.print("Rotated Array 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.print("Rotated Array 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
