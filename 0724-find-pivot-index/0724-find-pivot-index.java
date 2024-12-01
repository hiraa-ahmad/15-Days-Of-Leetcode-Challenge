public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            // Check if the left sum equals the right sum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Update the left sum
            leftSum += nums[i];
        }

        // No pivot index found
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Output: " + solution.pivotIndex(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {1, 2, 3};
        System.out.println("Output: " + solution.pivotIndex(nums2)); // Output: -1

        // Example 3
        int[] nums3 = {2, 1, -1};
        System.out.println("Output: " + solution.pivotIndex(nums3)); // Output: 0
    }
}
