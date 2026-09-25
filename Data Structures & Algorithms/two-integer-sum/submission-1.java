class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Find the absolute minimum and maximum values to size our array
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        // Create a direct map array based on the range of numbers
        int range = max - min;
        int[] map = new int[range + 1]; 
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement falls within our known range
            if (complement >= min && complement <= max) {
                int complementIdx = map[complement - min];
                // In Java, an int array defaults to 0. 
                // A non-zero value means we have seen this number before.
                if (complementIdx > 0) {
                    return new int[] { complementIdx - 1, i };
                }
            }
            // Store index + 1 to distinguish a valid 0 index from an empty slot
            map[nums[i] - min] = i + 1;
        }
        
        return new int[] {};
    }
}
