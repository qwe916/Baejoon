import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] RGB = new int[N][3];//비용 입력받을 배열
        int[][] cost = new int[N][3];//비용 총값을 저장할 배열
        for (int i = 0; i <RGB.length ; i++) {
            for (int j = 0; j <RGB[i].length ; j++) {
                RGB[i][j] = sc.nextInt();
            }
        }
        cost[0][0] = RGB[0][0];
        cost[0][1] = RGB[0][1];
        cost[0][2] = RGB[0][2];
        for (int i = 1; i <cost.length ; i++) {
            //cost[i][R,G,B 중하나] = Min(cost[i-1][이웃 가능한 색1],cost[i-1][이웃 가능한 색2])+비용
            cost[i][0] = Math.min(cost[i - 1][1], cost[i - 1][2]) + RGB[i][0];
            cost[i][1] = Math.min(cost[i - 1][0], cost[i - 1][2]) + RGB[i][1];
            cost[i][2] = Math.min(cost[i - 1][0], cost[i - 1][1]) + RGB[i][2];
        }
        System.out.println(Math.min(Math.min(cost[N-1][0],cost[N-1][1]),cost[N-1][2]));//마지막 3개의 RGB 비용중 최솟값
    }
}