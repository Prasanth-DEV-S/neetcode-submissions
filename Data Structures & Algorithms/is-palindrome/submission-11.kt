
class Solution {
    fun isPalindrome(s: String): Boolean {
        val clean = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = clean.length - 1

        while (left < right) {          // stop at the middle
            if (clean[left] != clean[right]) return false
            left++
            right--
        }
        return true
    }
}