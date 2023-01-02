
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
        max++;//Upper Bound를 해주어야 한다. 왜냐하면 0과 0이 입력(동일한 랜선 길이 값들만 입력) 되었을 경우 min<max 조건이 아니기 때문에 탐색을 수행하지 않는다. 따라서 이를 방지하기 위해 +1을 해주어서 이를 방지한다.
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

