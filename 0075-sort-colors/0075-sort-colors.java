public class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] and nums[low], move both pointers
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid pointer
                mid++;
            } else {
                // Swap nums[mid] and nums[high], move high pointer
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println(java.util.Arrays.toString(nums1));  // Output: [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println(java.util.Arrays.toString(nums2));  // Output: [0, 1, 2]
    }
}
