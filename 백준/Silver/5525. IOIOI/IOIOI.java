import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String p = "";
        for (int i = 0; i <n*2+1 ; i++) {
            if (i % 2 == 0) {
                p += 'I';
            } else {
                p += 'O';
            }
        }
        int result = 0;
        int S_length = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < s.length()-(n*2+1); i++) {
            if (s.charAt(i) == 'I') {
                if (s.substring(i,i+ (n * 2 + 1)).equals(p)) {
                    result++;
                }
            }
        }
        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }

}
