class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.copyOf()
        val n = num_list.size
        val last = num_list[n-1]
        val secondLast = num_list[n-2]

        if (last > secondLast) {
            answer += last - secondLast
        } else {
            answer += last *2
        }

        return answer
    }
}