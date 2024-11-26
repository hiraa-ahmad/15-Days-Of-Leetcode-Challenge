public class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray(); // Convert string to char array for in-place modification
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Reverse only up to k characters or till the end
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars); // Convert char array back to string
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("Output: " + solution.reverseStr(s1, k1)); // Output: "bacdfeg"

        // Example 2
        String s2 = "abcd";
        int k2 = 2;
        System.out.println("Output: " + solution.reverseStr(s2, k2)); // Output: "bacd"
    }
}
