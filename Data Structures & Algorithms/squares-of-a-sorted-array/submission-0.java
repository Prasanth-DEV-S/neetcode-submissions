class Solution {
    public int[] sortedSquares(int[] nums) {
        // /Two Pointers
        int lengthOfArray = nums.length;
        int[] result = new int[lengthOfArray];
        int left = 0 , right = lengthOfArray -1;
        
        for(int i = lengthOfArray -1 ;i>=0 ; i--){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(leftSq < rightSq){
                result[i] = rightSq;
                right --;
            }else{
                result[i] = leftSq;
                left++;
            }
        }
        return result;
        
    }
}