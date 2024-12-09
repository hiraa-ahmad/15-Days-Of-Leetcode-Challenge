public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(java.util.Arrays.toString(solution.sortedSquares(nums1)));  // Output: [0, 1, 9, 16, 100]

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(java.util.Arrays.toString(solution.sortedSquares(nums2)));  // Output: [4, 9, 9, 49, 121]
    }
}
