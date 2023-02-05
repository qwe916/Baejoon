import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 0) {
                if (queue.size() == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(temp);
            }
        }
    }

}