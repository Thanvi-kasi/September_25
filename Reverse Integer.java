public class Solution {
    public int reverse(int x) {
        // Define the 32-bit integer boundaries
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;
        
        long reversedX = 0; // Use a long to prevent overflow during intermediate steps
        
        while (x != 0) {
            int digit = x % 10;  // Get the last digit
            reversedX = reversedX * 10 + digit;  // Append the digit to the reversed number
            x /= 10;  // Remove the last digit from x
        }
        
        // Check if the reversed value is within the 32-bit integer range
        if (reversedX < INT_MIN || reversedX > INT_MAX) {
            return 0;
        }
        
        return (int) reversedX;  // Return the result as a 32-bit integer
    }
}
