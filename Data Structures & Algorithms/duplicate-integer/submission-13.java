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
    // Set<Integer> seen = new HashSet<>();
    // for(int num : nums){
    //     if(! seen.add(num)){
    //         return true;
    //     }
    // }
    // return false;
    // }

    // return new HashSet<>(Arrays.stream(nums).boxed().toList()).size() != nums.length;

             Hashtable<Integer,Integer> ht= new Hashtable<>();
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--){
            if(ht.containsKey(nums[i])==false){
                ht.put(nums[i],1);
            }
            else{
                return true;
            }
            if(ht.containsKey(nums[j])==false){
                ht.put(nums[j],1);
            }
            else{
                return true;
            }
        }
        return false;

    
    }
}