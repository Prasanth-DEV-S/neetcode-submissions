class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];
        result[0] = 1;
        for(int i =1; i< length ; i++ ){
                result[i] = result[i-1] * nums[i-1];
        }
                int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;   // left product × right product
            rightProduct = rightProduct * nums[i];  // include nums[i] for the next index to the left
        }
        return result;
        }
}  
