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
        
        for (i in 1 until prices.size) {
            val currentPrice = prices[i]
            
            if (currentPrice < minPrice) {
                minPrice = currentPrice
            } else {
                val potentialProfit = currentPrice - minPrice
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit
                }
            }
        }
        
        return maxProfit
    }
}
