class Solution {
        fun longestConsecutive(nums: IntArray): Int {

            if(nums.isEmpty()){ return 0}
            // Largest Value
            var lagestScore = 0
            // HashSet for remove douuplicate 
            val numSet = nums.toHashSet()
            for(num in numSet){
                if((num-1) !in numSet){
                    var currentValue = num
                    var currentScrore = 1
                    while((currentValue + 1) in numSet){
                     currentValue++   
                     currentScrore++
                    }
                    lagestScore = max(lagestScore,currentScrore)
                }
            }
                        return lagestScore

        }

    // fun longestConsecutive(nums: IntArray): Int {
        
    //     val sortedNums = nums.sorted().toSet().toList()
    //     if(sortedNums.isEmpty()){ return 0}
    //     else if(sortedNums.size == 1){ return 1}
    //     var findStart = sortedNums[0]
    //     var hashMap = HashMap<Int, Int>()
    //     for(i in 0 ..sortedNums.size-2){
    //         if(sortedNums[i]+1 != sortedNums[i+1]){
    //             findStart = sortedNums[i+1]
    //         }
    //         hashMap[findStart] = hashMap.getOrPut(findStart){1} + 1
            
    //     }
    //     println(hashMap)
    //     return hashMap.values.max()
    // }
}
