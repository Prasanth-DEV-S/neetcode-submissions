class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleanString = s.replace(" ", "").filter{it.isLetterOrDigit()}.lowercase()
        var charArr = cleanString.toCharArray()
        var right = charArr.size-1
        for(ch in charArr.indices){
            if(!charArr[ch].equals(charArr[right])){
                return false
            }
            right--
        }
        return true
    }
}
