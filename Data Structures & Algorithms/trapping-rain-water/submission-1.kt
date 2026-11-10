import kotlin.math.max

class Solution {
    fun trap(height: IntArray): Int {
        if (height.size < 3) return 0
        
        var left = 0
        var right = height.size - 1
        var leftMax = height[left]
        var rightMax = height[right]
        var totalWater = 0
        
        while (left < right) {
            // The smaller boundary dictates the maximum water level
            if (leftMax < rightMax) {
                left++
                leftMax = max(leftMax, height[left])
                totalWater += leftMax - height[left]
            } else {
                right--
                rightMax = max(rightMax, height[right])
                totalWater += rightMax - height[right]
            }
        }
        
        return totalWater
    }
}
