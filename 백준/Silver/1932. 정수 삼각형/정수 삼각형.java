import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[][] t = new int[h][h];
        int[][] result = new int[h][h];
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j <= i; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        result[0][0] = t[0][0];
        for (int i = 1; i <t.length ; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result[i][0] = result[i - 1][0] + t[i][0];
                } else if (j == i) {
                    result[i][i] = result[i - 1][i - 1] + t[i][i];
                } else {
                    result[i][j] = Math.max(result[i - 1][j - 1], result[i - 1][j]) + t[i][j];
                }
            }
        }
        int max = 0;
        for (int i = 0; i<result.length ; i++) {
            if (result[h - 1][i] > max) {
                max = result[h - 1][i];
            }
        }
        System.out.println(max);
    }


}