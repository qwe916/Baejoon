import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int result = method(k,n);
            bw.write(result+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static int method( int k, int n) {
        if (k == 0) {
            return n;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += method(k - 1, i);
        }
        return result;
    }


}