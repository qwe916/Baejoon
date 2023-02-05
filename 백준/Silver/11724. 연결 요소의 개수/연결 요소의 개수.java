
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    static boolean[][] arr;
    static boolean[] visited;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
         arr = new boolean[N][N];
        visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            String[] connect = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(connect[0]);
            int b = Integer.parseInt(connect[1]);
            arr[a - 1][b - 1] = true;
            arr[b - 1][a - 1] = true;
        }
        for (int i = 0; i <N ; i++) {

            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    private static void dfs(int start) {
        if (visited[start]) {
            return;
        }else{
            visited[start] = true;
            for (int j = 1; j <arr.length ; j++) {
                if (arr[start][j]) {
                    dfs(j);
                }
            }
        }
    }

}