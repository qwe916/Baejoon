class Solution {
    fun solution(my_string: String, k: Int): String {
        return StringBuilder().apply { for (i in 1..k)append(my_string) }.toString()

    }
}