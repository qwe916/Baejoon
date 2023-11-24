import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termPeriods = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termPeriods.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        List<Integer> toDestroy = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] splitPrivacy = privacies[i].split(" ");
            LocalDate privacyDate = LocalDate.parse(splitPrivacy[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            privacyDate = privacyDate.plusMonths(termPeriods.get(splitPrivacy[1]));

            if (privacyDate.isBefore(todayDate) || privacyDate.isEqual(todayDate)) {
                toDestroy.add(i+1);
            }
        }

        int[] answer = new int[toDestroy.size()];
        for (int i = 0; i < toDestroy.size(); i++) {
            answer[i] = toDestroy.get(i);
        }
        return answer;
    }
}