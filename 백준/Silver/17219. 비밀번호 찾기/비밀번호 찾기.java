import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            map.put(s[0], s[1]);
        }
        String[] find = new String[M];
        for (int i = 0; i < find.length ; i++) {
            find[i] = br.readLine();
            bw.write(map.get(find[i])+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
