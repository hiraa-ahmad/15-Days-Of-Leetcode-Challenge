public class Solution {
    public int lengthOfLastWord(String s) {
        // Remove trailing spaces and split the string into words
        String[] words = s.trim().split(" ");
        // Return the length of the last word
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "Hello World";
        System.out.println("Output: " + solution.lengthOfLastWord(s1)); // Output: 5

        // Example 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Output: " + solution.lengthOfLastWord(s2)); // Output: 4

        // Example 3
        String s3 = "luffy is still joyboy";
        System.out.println("Output: " + solution.lengthOfLastWord(s3)); // Output: 6
    }
}
