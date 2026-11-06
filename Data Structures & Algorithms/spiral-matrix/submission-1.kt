class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var result = mutableListOf<Int>()
        if(matrix.isEmpty()){ return result}

        var left = 0
        var right = matrix[0].size - 1
        var up = 0
        var down = matrix.size - 1

        while( left <= right && up <= down){
            for(c in left..right){
                result.add(matrix[up][c])
            }
            up++

            for(r in up..down){
                result.add(matrix[r][right])
            }
            right--

            if(up <= down){
                for(c in right downTo left){
                result.add(matrix[down][c])
            }
            
            down--
            }
             if(left <= right){
                for(r in down downTo up){
                result.add(matrix[r][left])
            }
                      
            left++
            }
        }
        return result
    }
}
