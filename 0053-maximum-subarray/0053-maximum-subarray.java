public class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num); // Extend or start new subarray
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums2)); // Output: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums3)); // Output: 23
    }
}
