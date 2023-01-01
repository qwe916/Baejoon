import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
       bw.write("\\    /\\\n" +
               " )  ( ')\n" +
               "(  /  )\n" +
               " \\(__)|");
        br.close();
        bw.flush();
        bw.close();
    }
}