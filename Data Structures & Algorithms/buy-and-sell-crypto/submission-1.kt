class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        val sellArray = IntArray(prices.size)
        for(i in 1 until prices.size){
            if(prices[i] < buy){
                buy = prices[i]
            }
            sellArray[i-1] =  prices[i] - buy
    
        }
        println(sellArray.contentToString())
return sellArray.max().coerceAtLeast(0)
    }
}
