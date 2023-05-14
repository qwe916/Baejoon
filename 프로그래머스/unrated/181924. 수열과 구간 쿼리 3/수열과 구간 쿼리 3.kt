class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            arr[query[0]] = arr[query[0]] xor arr[query[1]]
            arr[query[1]] = arr[query[0]] xor arr[query[1]]
            arr[query[0]] = arr[query[0]] xor arr[query[1]]
        }
        return arr
    }
}