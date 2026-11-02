class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var sell = prices[0]
        val array = IntArray(prices.size)
        for(i in 1 until prices.size){
            if(prices[i] < buy){
                buy = prices[i]
            }
            array[i-1] =  prices[i] - buy
    
        }
        println(array.contentToString())
return array.max().coerceAtLeast(0)
    }
}
