class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer :Int = 0
        val plus: String = ineq + eq
        when(plus){
            ">=" -> if(n >= m) answer = 1
            "<=" -> if(n <= m) answer = 1
            ">!" -> if(n > m) answer = 1
            "<!" -> if(n < m) answer = 1
        }
        return answer
    }
}