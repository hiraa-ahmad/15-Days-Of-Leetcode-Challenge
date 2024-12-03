public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) { // Add a space between words but not at the end
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        System.out.println(solution.reverseWords("the sky is blue")); // Output: "blue is sky the"

        // Example 2
        System.out.println(solution.reverseWords("  hello world  ")); // Output: "world hello"

        // Example 3
        System.out.println(solution.reverseWords("a good   example")); // Output: "example good a"
    }
}
