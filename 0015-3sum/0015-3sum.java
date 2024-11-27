import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Avoid duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase left pointer to get a larger sum
                } else {
                    right--; // Decrease right pointer to get a smaller sum
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Output: " + solution.threeSum(nums1)); 
        // Example 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Output: " + solution.threeSum(nums2)); 

        // Example 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Output: " + solution.threeSum(nums3)); 
    }
}
