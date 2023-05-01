class Solution {
    fun solution(arr: Array<String>): String {
        return StringBuilder().apply { arr.forEach { append(it) } }.toString();
    }
}