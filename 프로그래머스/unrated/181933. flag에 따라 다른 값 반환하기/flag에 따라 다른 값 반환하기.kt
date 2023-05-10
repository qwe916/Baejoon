class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        when(flag){
            true -> return a + b
            false -> return a-b
        }
    }
}