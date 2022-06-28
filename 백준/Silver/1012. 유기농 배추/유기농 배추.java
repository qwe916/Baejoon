import java.util.*;
public class Main {
    static int N;
    static int M;
    static boolean[][] visited;//방문기록
    static int[][] field;//배추밭
    static int bug = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i <test ; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int cabbage = sc.nextInt();
            field = new int[N+2][M+2];//배추밭 주변 0으로 패딩
            visited = new boolean[N + 2][M + 2];//0으로 패딩
            for (int j = 0; j <cabbage ; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[N-y][x+1] = 1;//배추 위치
            }
            for (int j = 0; j <field.length ; j++) {
                for (int k = 0; k <field[j].length ; k++) {
                    if (field[j][k] == 1 && visited[j][k] == false) {//배추가 있고 방문한 적이 없으면
                        dfs(j, k);//dfs
                        bug++;//벌레 
                    }
                }
            }
            System.out.println(bug);
            bug = 0;//벌레 다시 0마리
        }
    }

    static void dfs(int x, int y) {
        int[][] dx = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};//상하좌우 좌표
        visited[x][y] = true;
        for (int i = 0; i <dx.length ; i++) {
            //상화좌우 중 배추가 있고 그 배추를 방문한 적이 없으면
            if (field[x + dx[i][0]][y + dx[i][1]] == 1 && visited[x + dx[i][0]][y + dx[i][1]] ==false) {
                dfs(x + dx[i][0],y + dx[i][1]);//dfs
            }
        }
    }
}