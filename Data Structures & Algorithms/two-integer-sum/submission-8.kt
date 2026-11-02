class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for(i in nums.indices){
            val complement = target - nums[i]
            if(hashMap.containsKey(complement)){
                return intArrayOf(hashMap.getValue(complement),i)
            }
            hashMap[nums[i]] = i
        }
        return intArrayOf()

    }
}
