class Solution {
    fun solution(num_list: IntArray) = num_list.run {
        val last = get(size - 1)
        val secondLast = get(size - 2)

        if (last > secondLast) copyOf() + (last - secondLast) 
        else copyOf() + (last * 2)
    }
}