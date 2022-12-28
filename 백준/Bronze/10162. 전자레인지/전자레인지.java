import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(stringTokenizer.nextToken());
        int[] time = {300, 60, 10};
        int[] result = new int[3];
        for (int i = 0; i <3 ; i++) {
            result[i] = T / time[i];
            T -= result[i] * time[i];
        }
        if (T != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(result[i]+" ");
            }
        }
    }
}