import java.util.*;
public class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] field;
    static int bug = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i <test ; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int cabbage = sc.nextInt();
            field = new int[N+2][M+2];
            visited = new boolean[N + 2][M + 2];
            for (int j = 0; j <cabbage ; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[N-y][x+1] = 1;
            }
            for (int j = 0; j <field.length ; j++) {
                for (int k = 0; k <field[j].length ; k++) {
                    if (field[j][k] == 1 && visited[j][k] == false) {
                        dfs(j, k);
                        bug++;
                    }
                }
            }
            System.out.println(bug);
            bug = 0;
        }
    }

    static void dfs(int x, int y) {
        int[][] dx = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        visited[x][y] = true;
        for (int i = 0; i <dx.length ; i++) {
            if (field[x + dx[i][0]][y + dx[i][1]] == 1 && visited[x + dx[i][0]][y + dx[i][1]] ==false) {
                dfs(x + dx[i][0],y + dx[i][1]);
            }
        }
    }
}