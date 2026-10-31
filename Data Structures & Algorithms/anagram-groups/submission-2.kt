class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = HashMap<String, MutableList<String>>()
        for(str in strs){
            val sortStr = str.toCharArray().sorted().joinToString()
            hashMap.getOrPut(sortStr) { mutableListOf() }.add(str)
        }
        return hashMap.values.toList()
    }
}
