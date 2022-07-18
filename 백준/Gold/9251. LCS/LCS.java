import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[][] dy = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <dy[0].length ; i++) {
            dy[0][i] = 0;
        }
        for (int i = 0; i <dy.length ; i++) {
            dy[i][0] = 0;
        }
        for (int i = 1; i <dy.length ; i++) {
            for (int j = 1; j <dy[i].length ; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dy[i][j] = dy[i - 1][j - 1] + 1;
                } else {
                    if (dy[i - 1][j] >= dy[i][j - 1]) {
                        dy[i][j] = dy[i - 1][j];
                    } else {
                        dy[i][j] = dy[i][j - 1];
                    }
                }
            }
        }
        for (int i = b.length(); i == 0; i--) {

        }
        System.out.println(dy[a.length()][b.length()]);
    }
}