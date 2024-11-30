import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Output: " + Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

        // Example 2
        int[] nums3 = {1};
        int[] nums4 = {};
        solution.merge(nums3, 1, nums4, 0);
        System.out.println("Output: " + Arrays.toString(nums3)); // Output: [1]

        // Example 3
        int[] nums5 = {0};
        int[] nums6 = {1};
        solution.merge(nums5, 0, nums6, 1);
        System.out.println("Output: " + Arrays.toString(nums5)); // Output: [1]
    }
}
