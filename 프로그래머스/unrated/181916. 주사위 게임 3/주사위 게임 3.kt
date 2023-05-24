import kotlin.math.*
class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val list = listOf(a, b, c, d).sorted()
        return when (list.toSet().size) {
            1 -> 1111 * list[0]
            2 -> {
                when {
                    list[0] == list[1] && list[2] == list[3] -> (list[0] + list[2]) * abs(list[0] - list[2])
                    list[0] == list[1] -> (10 * list[2] + list[3]).toDouble().pow(2).toInt()
                    else -> (10 * list[1] + list[0]).toDouble().pow(2).toInt()
                }
            }
            3 -> {
                when {
                    list[0] == list[1] -> list[2] * list[3]
                    list[1] == list[2] -> list[0] * list[3]
                    else -> list[0] * list[1]
                }
            }
            else -> list.minOf { it }
        }
    }
}