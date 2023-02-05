import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String pocketmon = bufferedReader.readLine();
            map1.put(pocketmon, String.valueOf(i+1));
            map2.put( String.valueOf(i+1),pocketmon);
        }
        for (int i = 0; i < M; i++) {
            String input = bufferedReader.readLine();
            if (map1.containsKey(input)) {
                System.out.println(map1.get(input));
            } else if (map2.containsKey(input)) {
                System.out.println(map2.get(input));
            }
        }
    }

}