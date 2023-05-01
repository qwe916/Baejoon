class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = StringBuilder().append(a).append(b).toString().toInt()
        val ba = StringBuilder().append(b).append(a).toString().toInt()
        if(ab > ba) return ab
        return ba    
    }
}