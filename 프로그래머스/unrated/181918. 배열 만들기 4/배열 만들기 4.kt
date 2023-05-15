class Solution {
     fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()
        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty() || stk.last() < arr[i]) {
                stk += arr[i]
                i++
            } else {
                stk = stk.dropLast(1).toIntArray()
            }
        }
        return stk
    }
}