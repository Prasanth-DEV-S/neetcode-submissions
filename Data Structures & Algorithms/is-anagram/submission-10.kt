class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){
            return false
        }
        //  (O(N log N))
        // if(s.toCharArray().sorted().joinToString() == t.toCharArray().sorted().joinToString()){
        //     return true
        // }

        val charCountArray = IntArray(26)

        for(i in s.indices){
            charCountArray[s[i] - 'a']++
            charCountArray[t[i] - 'a']--
        }

        for(count in charCountArray){
            if(count > 0){
                return false
            }
        }

     return true
    }

    
}
