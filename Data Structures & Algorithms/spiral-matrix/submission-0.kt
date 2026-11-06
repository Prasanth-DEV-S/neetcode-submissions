// class Solution {
//     fun spiralOrder(matrix: Array<IntArray>): List<Int> {
//         var maxSize = matrix[0].size-1
//         var minSize = 0

//         var r = 0
//         var c = 0
//         val rowAndColum = mutableListOf<Int>(r,c)
//         var matrixList = mutableListOf<Int>()
//         for(i in 0.. matrix[0].size-1){
//             for(j in 0..matrix.size-1){
//                 if( c == minSize && r<maxSize){
//                     matrixList.add(matrix[c][r])
//                         r++
//                 }else if( c == minSize && r==maxSize){
//                     matrixList.add(matrix[c][r])
//                         c++
//                 }else if( r == maxSize && c < maxSize){
//                     matrixList.add(matrix[c][r])
//                         c++
//                 }else if( r == maxSize && c == maxSize){
//                     matrixList.add(matrix[c][r])
//                         r--
//                 }else if( c == maxSize && r < maxSize){
//                     matrixList.add(matrix[c][r])
//                         r--
//                 }else if( r == maxSize && c == maxSize){
//                     matrixList.add(matrix[c][r])
//                         c++
//                 }
//                 println(matrixList)

            
//            }
//         }
//         return matrixList
//     }

//     fun flowIncrement(rowAndColum : MutableList<Int> ,side : String) : MutableList<Int>{
//         when(side){

//             "left" -> {
//                 rowAndColum[1]++
//             }

//             "down" -> {
//                 rowAndColum[0]++
//             }
//             "right" -> {
//                 rowAndColum[1]--

//             }
//             "up" -> {
//                  rowAndColum[0]--
//             }
//         }
//         return rowAndColum

//     }
//     // fun addToList(matrixList : List<Int>,intArray : Array<IntArray>) : List<Int>{

//     // }
// }


class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
        if (matrix.isEmpty() || matrix[0].isEmpty()) return result

        // 1. Initialize boundaries
        var top = 0
        var bottom = matrix.size - 1
        var left = 0
        var right = matrix[0].size - 1

        // 2. Loop until boundaries collapse
        while (left <= right && top <= bottom) {
            
            // Traverse from Left to Right along the Top row
            for (c in left..right) {
                result.add(matrix[top][c])
            }
            top++ // Shrink top boundary down

            // Traverse from Top to Bottom along the Right column
            for (r in top..bottom) {
                result.add(matrix[r][right])
            }
            right-- // Shrink right boundary left

            // CRITICAL CHECK: Make sure we haven't crossed paths yet
            if (top <= bottom) {
                // Traverse from Right to Left along the Bottom row
                for (c in right downTo left) {
                    result.add(matrix[bottom][c])
                }
                bottom-- // Shrink bottom boundary up
            }

            // CRITICAL CHECK: Make sure we haven't crossed paths yet
            if (left <= right) {
                // Traverse from Bottom to Top along the Left column
                for (r in bottom downTo top) {
                    result.add(matrix[r][left])
                }
                left++ // Shrink left boundary right
            }
        }

        return result
    }
}
