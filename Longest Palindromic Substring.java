public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (centered at i)
            String palindrome1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (centered between i and i+1)
            String palindrome2 = expandAroundCenter(s, i, i + 1);
            
            // Update longest palindrome if we find a longer one
            if (palindrome1.length() > longest.length()) {
                longest = palindrome1;
            }
            if (palindrome2.length() > longest.length()) {
                longest = palindrome2;
            }
        }
        
        return longest;
    }

    // Helper method to expand around center
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome found by expanding
        return s.substring(left + 1, right);
    }
}
