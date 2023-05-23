class Solution {
    fun solution(number: String): Int {
        val answer = number.map { it - '0' }.sum() % 9
        return answer
    }
}