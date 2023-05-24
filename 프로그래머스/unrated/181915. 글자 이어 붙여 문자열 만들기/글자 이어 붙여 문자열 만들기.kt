class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
         var answer = ""
    index_list.forEach { answer += my_string[it] }
        return answer
    }
}