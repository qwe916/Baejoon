import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = String.valueOf(i);
            int total = i;
            int plus;
            for (int j = temp.length()-1; j >=0; j--) {
                plus = Integer.parseInt(temp) / (int) Math.pow(10, j);
                int temp_value = Integer.parseInt(temp);
                temp = String.valueOf(temp_value-plus * (int)Math.pow(10, j));
                total += plus;
            }
            if (total == N) {
                result = i;
                break;
            }
        }
        if (result == 0) {
            bw.write("0");
        } else {
            bw.write(result + "");
        }



        br.close();
        bw.flush();
        bw.close();
    }
}
