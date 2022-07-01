import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[][] t = new int[h][h];//삼각형
        int[][] result = new int[h][h];//합한 점수를 저장할 삼각형
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j <= i; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        result[0][0] = t[0][0];//root는 같다
        /*
        삼각형
            7
           3 8
          8 1 0
         2 7 4 4
        4 5 2 6 5 
        
        합한 점수 삼각형
             7
           10 15
          18 16 15
         20 25 20 19 
        24 30 27 26 24
        
        양쪽 사이드 : result[i][0] = result[i-1][0] + t[i][0] , result[i][i] = result[i-1][i-1] + t[i][i]  
        안쪽 값 : result[i][j] = Max(result[i-1][j-1],result[i-1][j]) + t[i][j]             
        */
        for (int i = 1; i <t.length ; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result[i][0] = result[i - 1][0] + t[i][0];
                } else if (j == i) {
                    result[i][i] = result[i - 1][i - 1] + t[i][i];
                } else {
                    result[i][j] = Math.max(result[i - 1][j - 1], result[i - 1][j]) + t[i][j];
                }
            }
        }
        int max = 0;
        //최댓값 구하기
        for (int i = 0; i<result.length ; i++) {
            if (result[h - 1][i] > max) {
                max = result[h - 1][i];
            }
        }
        System.out.println(max);
    }


}