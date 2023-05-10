class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var present: Int = a
        for(i in included){
            when(i){
                true -> {
                    answer += present
                    present += d
                }
                false -> {
                    present += d
                }
            }
        }
        return answer
    }
}