package hw4;

public class highestScore {

	public static void main(String[] args) {

		int[][] scores = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 }, { 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 }, { 75, 70, 79, 85, 89, 99 },
				{ 70, 95, 90, 89, 90, 75 }, };

		int[] highestScoreCountsOfAll = countingOfHighestScoreOfAll(scores);

		for (int i = 0; i < highestScoreCountsOfAll.length; i++) {
			System.out.println("學生" + (i + 1) + "共獲得" + highestScoreCountsOfAll[i] + "次最高分數!");
		}

	}

	private static int[] countingOfHighestScoreOfAll(int[][] score) {
		int[] highestScoreCountsOfAll = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] == getMaxScore(score, j)) {
					highestScoreCountsOfAll[i]++;
				}
			}
		}
		return highestScoreCountsOfAll;
	}

	private static int getMaxScore(int[][] i, int j) {
		int maxScore = Integer.MIN_VALUE;

		for (int x = 0; x < i.length; x++) {
			if (i[x][j] > maxScore) {
				maxScore = i[x][j];
			}

		}
		return maxScore;
	}

}
