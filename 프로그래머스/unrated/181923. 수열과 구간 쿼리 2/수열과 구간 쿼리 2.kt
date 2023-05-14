class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size) { -1 }
        for (i in queries.indices) {
            var smallest = -1
            for (j in queries[i][0]..queries[i][1]) {
                if (arr[j] > queries[i][2] && (smallest == -1 || arr[j] < smallest)) {
                    smallest = arr[j]
                }
            }
            answer[i] = smallest
        }
        return answer
    }
}