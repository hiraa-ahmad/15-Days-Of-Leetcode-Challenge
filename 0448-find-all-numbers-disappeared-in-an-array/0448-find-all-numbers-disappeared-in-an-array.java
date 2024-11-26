import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Mark visited numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert value to index
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark the number as visited by making it negative
            }
        }

        // Step 2: Collect missing numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // Positive numbers indicate unvisited indices
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result1 = solution.findDisappearedNumbers(nums1);
        System.out.println("Missing numbers: " + result1);

        // Example 2
        int[] nums2 = {1, 1};
        List<Integer> result2 = solution.findDisappearedNumbers(nums2);
        System.out.println("Missing numbers: " + result2);
    }
}
