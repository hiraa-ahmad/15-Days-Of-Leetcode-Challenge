public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], nums[i] * currMax);
            currMin = Math.min(nums[i], nums[i] * currMin);

            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new int[]{2, 3, -2, 4}));    // Output: 6
        System.out.println(solution.maxProduct(new int[]{-2, 0, -1}));     // Output: 0
        System.out.println(solution.maxProduct(new int[]{-2, 3, -4}));     // Output: 24
    }
}
