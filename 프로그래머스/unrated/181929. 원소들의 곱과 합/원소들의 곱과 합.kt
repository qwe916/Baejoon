class Solution {
    fun solution(num_list: IntArray): Int {
        var sum: Int = 0;
        var mul: Int = 1;
        for(num in num_list){
            sum += num
            mul *= num
        }
        if(sum * sum > mul) return 1 else return 0
    }
}