class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.isEmpty()) return 0

        var currentSubarray = nums[0]
        var maxSubarray = nums[0]

        for(i in 1 until nums.size){
            val num = nums[i]
            currentSubarray = max(num,currentSubarray + num)
            maxSubarray = max(currentSubarray , maxSubarray)
     
        }
 return maxSubarray
    }
}
