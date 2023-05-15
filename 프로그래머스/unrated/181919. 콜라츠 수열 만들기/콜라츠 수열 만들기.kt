class Solution {
     fun solution(n: Int): IntArray {
        val list = mutableListOf<Int>()
        var num = n
        while (num != 1) {
            list.add(num)
            num = if (num % 2 == 0) num / 2 else num * 3 + 1
        }
        list.add(1)
        return list.toIntArray()
    }
}