import java.util.*;

class Solution {
    public int N, D;
    public List<List<Integer>> edge;
    public int[] min;

    public class Point {
        int n, c;
        public Point (int n, int c) {
            this.n = n;
            this.c = c;
        }
    }

    public int dijkstra() {
        Queue<Point> q = new ArrayDeque<>();
        min[D] = 0;
        q.add(new Point(D, 0));
        while(!q.isEmpty()) {
            Point cur = q.poll();
            for (int i = 0; i < edge.get(cur.n).size(); i++) {
                int nextN = edge.get(cur.n).get(i);
                if (min[nextN] != -1) continue;
                min[nextN] = cur.c + 1;
                q.add(new Point(nextN, cur.c + 1));
            }
        }
        return -1;
    }

    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        N = n;
        D = destination;

        edge = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            edge.add(new ArrayList<>());

        for (int i = 0; i < roads.length; i++) {
            int from = roads[i][0];
            int to = roads[i][1];
            edge.get(from).add(to);
            edge.get(to).add(from);
        }

        min = new int[N + 1];
        
        Arrays.fill(min, -1);
        
        dijkstra();
        
        int[] result = new int[sources.length];
        
        for (int i = 0; i < sources.length; i++)
            result[i] = min[sources[i]];
        return result;
    }
}