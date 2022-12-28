
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr_A = new int[N];
        int[] arr_B = new int[N];
        stringTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr_A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr_B[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr_A);
        Arrays.sort(arr_B);
        int S = 0;
        for (int i = 0; i <N ; i++) {
            S += arr_A[i] * arr_B[N - i - 1];
        }
        System.out.println(S);
    }
}
