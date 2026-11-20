class Solution {
    fun isValid(s: String): Boolean {
        //Stack inizization 
        val stack = ArrayDeque<Char>()
        // pair Mapping
        val pair = mapOf('}' to '{',']' to '[', ')' to '(')

        for(char in s){
            if(char in pair){
                if(stack.isEmpty() || stack.removeLast() != pair[char]){
                    return false
                }
            }else{
                    stack.addLast(char)
            }
        }
        return stack.isEmpty()
    }
}
