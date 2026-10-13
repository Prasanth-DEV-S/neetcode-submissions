class Solutiond {
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

// Time: O(n), Space: O(1)
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            while (left < right && !s[left].isLetterOrDigit()) left++
            while (left < right && !s[right].isLetterOrDigit()) right--

            if (s[left].lowercaseChar() != s[right].lowercaseChar()) return false

            left++
            right--
        }
        return true
    }
}