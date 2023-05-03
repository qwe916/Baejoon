import java.util.*;
class Solution {

    boolean[][] visit;
    public int[] solution(String[] maps) {
        visit = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                int sum = bfs(i, j, maps);
                if (sum > 0) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int bfs(int i, int j,  String[] maps) {
        if (i < 0 || j < 0 || i >= visit.length || j >= visit[0].length || visit[i][j] || maps[i].charAt(j) == 'X') {
            return 0;
        }
        visit[i][j] = true;
        return (maps[i].charAt(j) - '0')
                + bfs(i - 1, j, maps)
                + bfs(i + 1, j, maps)
                + bfs(i, j - 1, maps)
                + bfs(i, j + 1, maps);
    }
}