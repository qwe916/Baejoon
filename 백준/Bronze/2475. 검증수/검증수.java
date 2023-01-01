
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        String[] arr = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]) * Integer.parseInt(arr[i]);
        }
        bw.write(result % 10+"");
        br.close();
        bw.flush();
        bw.close();
    }
}