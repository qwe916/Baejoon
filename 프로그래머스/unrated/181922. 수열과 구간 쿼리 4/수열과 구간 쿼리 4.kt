class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { query ->
            for (i in query[0]..query[1]) {
                if (i % query[2] == 0) arr[i] += 1
            }
        }
        return arr
    }
}