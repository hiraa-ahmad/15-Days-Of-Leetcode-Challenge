public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for position of non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move valid element to position k
                k++; // Increment k
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int result1 = solution.removeElement(nums1, 3);
        System.out.println("Result: " + result1); // Output: 2
        System.out.println(java.util.Arrays.toString(nums1)); // Example Output: [2, 2, _, _]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int result2 = solution.removeElement(nums2, 2);
        System.out.println("Result: " + result2); // Output: 5
        System.out.println(java.util.Arrays.toString(nums2)); // Example Output: [0, 1, 3, 0, 4, _, _, _]
    }
}
