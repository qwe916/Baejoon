
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        long max = 0;
        int arr[] = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max) max = arr[i];
        }
        max++;
        long min = 0;
        long mid =  0 ;
        while (min < max) {
            long count = 0;
            mid = (max + min) / 2;
            for (int i = 0; i < K; i++) {
                count += (arr[i] / mid);
            }
            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        bw.write(min-1+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

