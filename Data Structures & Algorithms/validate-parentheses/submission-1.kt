class Solution {
    fun isValid(s: String): Boolean {
         // Odd-length strings can never be balanced
        if (s.length % 2 != 0) return false

        val stack = ArrayDeque<Char>()

        for(char in s){
            when(char){
                '{' -> stack.addLast('}')
                '[' -> stack.addLast(']')
                '(' -> stack.addLast(')')
                else ->{
                    if(stack.isEmpty() || stack.removeLast() != char){
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}
