class Solution {
    public boolean hasDuplicate(int[] nums) {
    //   for(int i =0 ; i<nums.length;i++){
    //     for(int j =0 ; j< nums.length ;j++){
    //         if(nums[i] == nums[j] && i !=j){
    //             return true;
    //         }
    //     }
    //   }  
    //    return false;
    Set<Integer> seen = new HashSet<>();
    for(int num : nums){
        if(! seen.add(num)){
            return true;
        }
    }
    return false;
    }
}