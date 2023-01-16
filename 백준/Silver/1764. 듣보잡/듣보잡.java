import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s, 0);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M ; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                list.add(s);
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        bw.write(list.size()+"\n");
        for (String s: list
             ) {
            bw.write(s+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
