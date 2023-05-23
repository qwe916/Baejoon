class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        val answer = my_string.toCharArray().toMutableList()
        for (query in queries) {
            val s = query[0]
            val e = query[1]
            answer.subList(s, e + 1).reverse()
        }
        return answer.joinToString("")
    }
}