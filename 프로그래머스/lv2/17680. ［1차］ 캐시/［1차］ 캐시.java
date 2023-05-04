import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
         int answer = 0;
        if(cacheSize == 0){
            return cities.length * 5;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        for (String city : cities) {
            if(linkedList.contains(city.toLowerCase())){
                answer++;
                linkedList.remove(city.toLowerCase());
                linkedList.addLast(city.toLowerCase());
            }
            else{
                answer += 5;
                if (linkedList.size() >= cacheSize) {
                    linkedList.poll();
                    linkedList.addLast(city.toLowerCase());
                } else {
                    linkedList.addLast(city.toLowerCase());
                }
            }
        }
        return answer;
    }
}