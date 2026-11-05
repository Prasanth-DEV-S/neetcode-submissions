class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix =  strs[0]
         println("${strs.size-1}")
        for(i in 1 .. strs.size-1){
            println("${strs[i]} $prefix")
            while(!strs[i].startsWith(prefix)){
                println(strs[i])
                prefix = prefix.substring(0, prefix.length - 1)
                if(prefix.isEmpty()){
                   return ""
                }
            }
        }
        return prefix
    }
}
