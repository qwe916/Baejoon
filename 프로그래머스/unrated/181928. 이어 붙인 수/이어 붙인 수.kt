class Solution {
    fun solution(num_list: IntArray): Int {
        var odd: String = ""
        var even: String = ""
        for(num in num_list){
            when(num %2){
                0 -> even += num.toString()
                1 -> odd += num.toString()
            }
        }
        return odd.toInt() + even.toInt()
    }
}