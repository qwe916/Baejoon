import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < test; i++) {
            int N = Integer.parseInt(bufferedReader.readLine());
            arr = new int[10001][3];
            arr[0][0] = 1;
            arr[1][0] = 1;
            arr[1][1] = 1;
            arr[2][0] = 1;
            arr[2][1] = 1;
            arr[2][2] = 1;
            check();
            System.out.println(arr[N-1][0]+arr[N-1][1]+arr[N-1][2]);
        }
    }

    private static void check() {
        for (int i = 3; i <10001 ; i++) {
            arr[i][0] = arr[i - 1][0];
            arr[i][1] = arr[i - 2][0]+arr[i - 2][1];
            arr[i][2] = arr[i - 3][0] + arr[i - 3][1] + arr[i - 3][2];
        }
    }
}