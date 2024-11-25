class Solution {
    public boolean isPalindrome(String s) {
        String cleanInput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleanInput.length() - 1;

        while (i < j) {
            if (cleanInput.charAt(i) != cleanInput.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

public class __DriverSolution_ {
    public static void main(String[] args) {
        String param_1 = "A man, a plan, a canal: Panama"; 
        boolean ret = new Solution().isPalindrome(param_1);
        System.out.println("Is the string a palindrome? " + ret);
    }
}
