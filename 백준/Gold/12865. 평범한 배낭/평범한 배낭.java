import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max_weight = sc.nextInt();
        int[] value = new int[N+1];
        value[0] = 0;
        int[] weight = new int[N + 1];
        weight[0] = 0;
        for (int i = 0; i <N ; i++) {
            weight[i+1] = sc.nextInt();
            value[i+1] = sc.nextInt();
        }
        int[][] dp = new int[N + 1][max_weight + 1];
        Arrays.fill(dp[0],0);
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (weight[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i-1][j - weight[i]] + value[i]);
                }
            }
        }
        System.out.println(dp[N][max_weight]);
    }
}
