import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int arr[][] = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < test; i++) {
            int start = Integer.parseInt(bufferedReader.readLine());
            int ZeroCount = fibonacci(start, 0);
            int OneCount = fibonacci(start, 1);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ZeroCount + " " + OneCount);
            System.out.println(stringBuilder.toString());
        }
    }

    private static int fibonacci(int start,int place) {
        if (arr[start][place] != 0) {
            return arr[start][place];
        } else if (start ==0) {
            arr[0][0] = 1;
            arr[0][1] = 0;
            return arr[start][place];
        } else if (start == 1){
            arr[1][0] = 0;
            arr[1][1] = 1;
            return arr[start][place];
        }
        arr[start][place] = fibonacci(start-1,place)+ fibonacci(start-2,place);
        return arr[start][place];
    }

}