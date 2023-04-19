import java.util.*;
class Solution {
   public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            Integer index = map.get(callings[i]);
            if (index != 0) {
                String temp = players[index - 1];
                players[index - 1] = callings[i];
                players[index] = temp;
                map.put(temp, map.get(temp) + 1);
                map.put(callings[i], map.get(callings[i]) - 1);
            }
        }
        
        return players;
    }
}