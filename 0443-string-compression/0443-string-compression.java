public class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;

        while (j < chars.length) {
            char currentChar = chars[j];
            int count = 0;

            // Count occurrences of the current character
            while (j < chars.length && chars[j] == currentChar) {
                j++;
                count++;
            }

            // Write the character
            chars[i++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[i++] = c;
                }
            }
        }
        return i;
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(solution.compress(chars1));  // Output: 6

        char[] chars2 = {'a'};
        System.out.println(solution.compress(chars2));  // Output: 1

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(solution.compress(chars3));  // Output: 4
    }
}
