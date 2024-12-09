import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;  // No unique character found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.firstUniqChar("leetcode"));      // Output: 0
        System.out.println(solution.firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(solution.firstUniqChar("aabb"));         // Output: -1
    }
}
