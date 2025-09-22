class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last seen index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0; // left pointer of the sliding window    
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the map, move the left pointer
            // to the right of its last seen index to ensure no duplicates in the window
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last seen index of the current character
            charIndexMap.put(currentChar, right);
            
            // Update the maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
