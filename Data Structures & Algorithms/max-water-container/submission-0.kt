class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        var j = heights.size-1
        var i = 0
         print(" $i , $j")
        while(i<j){
            maxArea = max(maxArea , (j-i)*min(heights[i] , heights[j]))
            if(heights[i] < heights [j]){
                i++
            }else{
                j--
            }
            print(i)
        }
        return maxArea
    }
}
