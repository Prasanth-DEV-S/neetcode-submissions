class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val mList = mutableListOf<List<Int>>()
        if(nums.isEmpty()){ return mList}
        nums.sort()
        
        for(i in 0 until  nums.size - 2){
            var left = i+1
            var right = nums.size - 1 
            if (i > 0 && nums[i] == nums[i - 1]) continue

            while(left < right){
                
                val sum = nums[i] + nums[left] + nums[right]
                when{
                    sum == 0 ->{ 
                        mList.add(listOf(nums[i] , nums[left] , nums[right]))
                        while(left < right && nums[left] == nums[left + 1]) left++
                        while(left < right && nums[right] == nums[right - 1]) right--
                        left ++
                        right --
                    }
                    sum < 0 -> {
                        left ++ 
                    }
                    sum > 0 -> {
                        right-- 
                    }
                }
            }
          
        }

          return mList
    }
}