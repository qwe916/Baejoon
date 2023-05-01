class Solution {
    fun solution(a: Int, b: Int): Int {
         val ab = a.toString() + b.toString()
        
        return ab.toInt().coerceAtLeast(a * b * 2)
    }
}