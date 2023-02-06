import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] location = new int[N];
        int[] rankArr = new int[N];
        for (int i = 0; i <N ; i++) {
            location[i] = Integer.parseInt(stringTokenizer.nextToken());
            rankArr[i] = location[i];
        }
        Arrays.sort(rankArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = rankArr[0];
        int rank = 0;
        map.put(rankArr[0], rank);
        for (int i = 1; i < rankArr.length ; i++) {
            if (temp == rankArr[i]) {
                map.put(rankArr[i], rank);
            } else {
                temp = rankArr[i];
                rank++;
                map.put(rankArr[i], rank);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < location.length; i++) {
            stringBuilder.append(map.get(location[i]) + " ");
        }
        System.out.println(stringBuilder.toString());

    }
}