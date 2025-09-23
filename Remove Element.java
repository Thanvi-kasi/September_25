class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer for the position of valid elements
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Move valid elements to the front
                k++;
            }
        }
        
        return k;  // Return the number of valid elements
    }
}
