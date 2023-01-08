import java.io.*;
import java.nio.charset.StandardCharsets;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int N = Integer.parseInt(br.readLine());
        int n = 1;
        int i = 1;
        while (n < N) {
            n += i * 6;
            i++;
        }
        bw.write(i + "");
        br.close();
        bw.flush();
        bw.close();
    }

}
