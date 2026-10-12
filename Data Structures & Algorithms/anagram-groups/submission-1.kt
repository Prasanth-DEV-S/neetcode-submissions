class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var hashMap = HashMap<String,MutableList<String>>()
        for(s in strs){
            val key = String(s.toCharArray().apply{sort()})
            hashMap.getOrPut(key){mutableListOf()}.add(s)
        }
        return hashMap.values.toList()
    }
}
