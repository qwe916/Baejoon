import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int N = Integer.parseInt(br.readLine());//입력받은 N
        int num = 666;
        String temp ="";
        while (N > 0) {
           temp = String.valueOf(num);
            if (temp.contains("666")) {//만약 temp에 666 문자열이 포함되어 있으면 N을 1감소시킨다.
                N--;
            }
            num++;//num을 1 증가
        }
        bw.write(temp);
        br.close();
        bw.flush();
        bw.close();
    }
}
