class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists in the map, return the indices
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            
            // Otherwise, add the number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found (although it's stated there is always one), return an empty array
        return new int[] {};
    }
}
                 
