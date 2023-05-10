class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        for(i in 0..code.length-1){
            when(mode){
                0 -> {
                    if(code[i] == '1') mode = 1
                    else if(i % 2 == 0) answer += code[i]
                }
                1 -> {
                    if(code[i] == '1') mode = 0
                    else if(i % 2 == 1) answer += code[i]
                }
            }
        }
        if(answer.length == 0) return "EMPTY" else return answer
    }
}