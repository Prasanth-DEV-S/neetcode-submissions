class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var hashMap = HashMap<Int , Int>()
        var arr = IntArray(k)

        for(n in nums){

            hashMap[n] = hashMap.getOrDefault(n ,0)+1

        }

        return hashMap.entries.sortedByDescending{it.value}.take(k).map{ it.key}.toIntArray()
    }
}
