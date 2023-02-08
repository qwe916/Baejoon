import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int[][] board;
    static int white;
    static int blue;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        board = new int[N][N];
        for (int i = 0; i <N ; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j <N ; j++) {
                board[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        checkBox(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void checkBox(int row, int col, int n) {
        if (checkColor(row, col, n)) {
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newN= n / 2;
        checkBox(row, col, newN);
        checkBox(row, col+newN, newN);
        checkBox(row+newN, col, newN);
        checkBox(row+newN, col+newN, newN);
    }

    private static boolean checkColor(int row, int col, int n) {
        int color = board[row][col];
        for (int i = row; i <row+n ; i++) {
            for (int j = col; j <col+n ; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }


}