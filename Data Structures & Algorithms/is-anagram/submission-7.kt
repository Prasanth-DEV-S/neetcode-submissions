class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){
            return false
        }
        if(s.toCharArray().sorted().joinToString() == t.toCharArray().sorted().joinToString()){
            return true
        }
        // var j = s.length-1
        // for(i in 0..s.length-1){
        //     if(s[i] != t[j-i]) {
        //         println("${s[i]} ${t[j-i]}")
        //          return false
        //     }          
        // }
     return false
    }
}
