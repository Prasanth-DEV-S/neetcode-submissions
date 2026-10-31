class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        return nums.toSet().size != nums.size
        // var hasSet = HashSet<Int>()
        // for(n in nums){
        //     if(hasSet.contains(n)){
        //         return true
        //     }else{
        //         hasSet.add(n)
        //     }
            
        // }
        // return false
    }
}
