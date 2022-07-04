import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bf.readLine());
        for (int i = 0; i <test ; i++) {
            int n = Integer.parseInt(bf.readLine());
            int[][] dp = new int[2][n + 1];// dp배열
            String[] one = bf.readLine().split(" ");//첫번째 줄 스티커
            String[] two = bf.readLine().split(" ");//두번쨰 줄 스티커
            //각 줄의 2번째 스티커의 최댓값을 구하기 위해서 전의 값과 전전의 값이 모두 필요하기 때문에 0으로 초기화 해준다.
            dp[0][0] = 0;
            dp[1][0] = 0;
            //각 줄의 첫번째 스티커는 전의 값들이 없기 때문에 해당 스티커 값으로 초기화
            dp[1][1] = Integer.parseInt(two[0]);
            dp[0][1] = Integer.parseInt(one[0]);
            for (int j = 2; j <n+1 ; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + Integer.parseInt(one[j - 1]);//첫번째 줄이면 두번째 줄의 전의 첫번쨰 값과 전의 두번째 값중 더 큰값 + 해당 스티커 값
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + Integer.parseInt(two[j - 1]);//두번째 줄이면 첫번째 줄의 전의 첫번쨰 값과 전의 두번째 값중 더 큰값 + 해당 스티커 값
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));//dp[0][마지막 인덱스]의 값과 dp[1][마지막 인덱스]의 값중 최대 값을 출력
        }
    }
}