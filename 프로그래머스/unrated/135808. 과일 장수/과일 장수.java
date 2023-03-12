import java.util.Arrays;

class Solution {
	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		int sum = 0;
		int start = score.length % m;

		for (int i = start; i < score.length; i += m) {
			sum += score[i];
		}
		return sum * m;
	}
}