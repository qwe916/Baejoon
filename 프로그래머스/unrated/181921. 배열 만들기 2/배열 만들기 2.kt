class Solution {
     fun solution(l: Int, r: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in l..r) {
            if (isNumberValid(i)) {
                result.add(i)
            }
        }
        return if (result.isNotEmpty()) result.toIntArray() else intArrayOf(-1)
    }
    
    private fun isNumberValid(n: Int): Boolean {
        var num = n
        while (num > 0) {
            val digit = num % 10
            if (digit != 0 && digit != 5) {
                return false
            }
            num /= 10
        }
        return true
    }
}