import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i <n ; i++) {
            StringTokenizer str = new StringTokenizer(b.readLine());
            for (int j = 0; j <2 ; j++) {
                arr[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}