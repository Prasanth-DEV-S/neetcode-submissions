// class Solution {
//     fun maxProfit(prices: IntArray): Int {
//         var buy = prices[0]
//         val sellArray = IntArray(prices.size)
//         for(i in 1 until prices.size){
//             if(prices[i] < buy){
//                 buy = prices[i]
//             }
//             sellArray[i-1] =  prices[i] - buy
    
//         }
//         println(sellArray.contentToString())
// return sellArray.max().coerceAtLeast(0)
//     }
// }

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        
        var minPrice = prices[0]
        var maxProfit = 0
        
        for (price in prices) {
            minPrice = minOf(minPrice, price)
            maxProfit = maxOf(maxProfit, price - minPrice)
        }
        
        return maxProfit
    }

}
