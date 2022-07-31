import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
            int answer = 0;
        Stack<Integer> budget = new Stack<>();
        for (int n : moves
             ) {
            for (int i = 0; i <board.length ; i++) {
                if (board[i][n - 1] != 0) {// 보드가 비어있지 않으면
                    if (budget.empty()) {//바구니가 비어있으면
                        budget.push(board[i][n - 1]);
                        board[i][n - 1] = 0;
                        break;
                    }else{//바구니가 비어있지 않다
                        if (budget.peek() == board[i][n - 1]) {//맨 위에 있는 값과 넣을 값이 같으면
                            budget.pop();
                            answer += 1;
                            board[i][n - 1] = 0;
                            break;
                        } else {
                            budget.push(board[i][n - 1]);
                            board[i][n - 1] = 0;
                            break;
                        }
                    }
                }
            }
        }
        return answer*2;
    }
}