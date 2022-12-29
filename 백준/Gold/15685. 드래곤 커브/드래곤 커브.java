import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] map = new boolean[101][101];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());   // 시작 방향
            int g = Integer.parseInt(st.nextToken());   // 세대

            dragonCurve(x, y, d, g);
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] && map[i][j + 1] && map[i + 1][j] && map[i + 1][j + 1]) {//모든 정사각형 꼭지점이 true
                    ans++;
                }
            }
        }

        bw.write(ans + "\n");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void dragonCurve(int x, int y, int d, int g) {
        List<Integer> d_list = new ArrayList<>();//list 생성
        d_list.add(d);//방향 저장

        for (int i = 1; i <= g; i++) {//드래곤 커브 세대 만큼
            for (int j = d_list.size() - 1; j >= 0; j--) {
                d_list.add((d_list.get(j) + 1) % 4);//d_list에 있는 방향들을 마지막부터 뽑으면서 반시계 방향으로 한번 돌린 것을 다시 d_list에 추가한다.
            }
        }
        /**
         * d_list add -> 뒤부터 (d+1)%4 값 추가
         * 예
         * 0 방향 3세대
         * {0}
         * {0,1}
         * {0,1,2,1}
         * {0,1,2,1,2,3,2,1}
         */
        map[y][x] = true;
        for (Integer direction : d_list) {
            x += dx[direction];
            y += dy[direction];
            map[y][x] = true;
        }
    }
}

