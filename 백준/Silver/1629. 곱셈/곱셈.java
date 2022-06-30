import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(pow(a,b,c));

    }

    static long pow(int a, int b, int c) {
        if (b == 0) {//b가 0일 경우
            return 1;
        }
        //분할 정복
        /*
        * 2^11 = 2 x 2^5 x 2^5
        * 2^5 = 2 x 2^2 x 2^2
        * 2^2 = 2^1 x 2^1
        */

        long n = pow(a, b / 2, c);//재귀 b가 홀수건 짝수건
        long temp = n * n % c;// 거듭 제곱 mod c
        if (b % 2 == 0) {//b가 짝수 일경우 temp 그대로 리턴
            return temp;
        } else {//홀수 일경우 temp에 a를 한번 더 곱해야 한다 왜냐하면 홀수일 경우 pow(a,(b-1)/2,c)를 했어야 하지만 이를 안했기 때문에 a가 한번 덜 곱해져 있다
            return a * temp % c;
        }
    }

}