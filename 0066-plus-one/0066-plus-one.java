public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits are 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2, 4]

        // Example 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [4, 3, 2, 2]

        // Example 3
        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1, 0]
    }
}
