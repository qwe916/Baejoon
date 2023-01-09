import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <K ; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }
        int result = 0;
        for (Integer temp: stack
             ) {
            result += temp;
        }
        bw.write(result+"");
        br.close();
        bw.flush();
        bw.close();
    }

}