public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set the current number as the candidate
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2)); // Output: 2
    }
}
