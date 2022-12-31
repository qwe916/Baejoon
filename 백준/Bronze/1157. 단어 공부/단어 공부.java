import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int[] arr = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            }
            else {
                arr[s.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        bw.write(ch);
        br.close();
        bw.flush();
        bw.close();
    }
}

