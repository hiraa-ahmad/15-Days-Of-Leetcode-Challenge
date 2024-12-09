public class Solution {
    public boolean isPalindrome(int x) {
        // Early return for negatives and multiples of 10 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // Check if the first half equals the reversed second half
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));   // true
        System.out.println(solution.isPalindrome(-121));  // false
        System.out.println(solution.isPalindrome(10));    // false
    }
}
