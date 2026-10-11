// class Solution {
//     fun topKFrequent(nums: IntArray, k: Int): IntArray {
//         var hashMap = HashMap<Int , Int>()
//         var arr = IntArray(k)
//         for(n in nums){
//             hashMap[n] = hashMap.getOrDefault(n ,0)+1
//         }
//         return hashMap.entries.sortedByDescending{it.value}.take(k).map{ it.key}.toIntArray()
//     }
// }
import java.util.PriorityQueue

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = HashMap<Int, Int>()
        for (n in nums) count[n] = count.getOrDefault(n, 0) + 1

        // Min-heap ordered by frequency: the least frequent is on top
        val heap = PriorityQueue<Int>(compareBy { count[it] })
        for (num in count.keys) {
            heap.add(num)
            if (heap.size > k) heap.poll()   // drop the least frequent
        }

        return heap.toIntArray()
    }
}