import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> attackInfo;
    private int endTime;
    private int currentHealth;
    private int successiveTime;

    public int solution(int[] bandage, int health, int[][] attacks) {
        initializeVariables(health, attacks);
        return calculateFinalHealth(bandage, health);
    }

    private void initializeVariables(int health, int[][] attacks) {
        attackInfo = new HashMap<>();
        currentHealth = health;
        successiveTime = 0;
        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
            endTime = attack[0];
        }
    }

    private int calculateFinalHealth(int[] bandage, int maxHealth) {
        for (int i = 1; i <= endTime; i++) {
            if (isUnderAttack(i)) {
                handleAttack(i);
            } else {
                handleNoAttack(bandage, maxHealth);
            }

            if (isHealthDepleted()) {
                return -1;
            }
        }
        return currentHealth;
    }

    private boolean isUnderAttack(int time) {
        return attackInfo.containsKey(time);
    }

    private void handleAttack(int time) {
        currentHealth -= attackInfo.get(time);
        successiveTime = 0;
    }

    private void handleNoAttack(int[] bandage, int maxHealth) {
        currentHealth += bandage[1];
        successiveTime++;

        if (successiveTime == bandage[0]) {
            currentHealth += bandage[2];
            successiveTime = 0;
        }
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    private boolean isHealthDepleted() {
        return currentHealth <= 0;
    }
}
