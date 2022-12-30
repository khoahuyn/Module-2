import java.util.Scanner;

public class TennisGame {
    public static final int NUMBER_ZERO = 0;
    public static final int NUMBER_ONE = 1;
    public static final int NUMBER_TWO = 2;
    public static final int NUMBER_THREE = 3;
    public static String getScore(int scoreFirst, int scoreSecond) {
        String score = "";
        int tempScore = 0;
        if (scoreFirst == scoreSecond) {
            switch (scoreFirst) {
                case NUMBER_ZERO:
                    score = "Love";
                    break;
                case NUMBER_ONE:
                    score = "Fifteen";
                    break;
                case NUMBER_TWO:
                    score = "Thirty";
                    break;
                case NUMBER_THREE:
                    score = "Forty";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreFirst >= 4 || scoreSecond >= 4) {
            score = getString(scoreFirst, scoreSecond);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreFirst;
                else {
                    score += "-";
                    tempScore = scoreSecond;
                }
                switch (tempScore) {
                    case NUMBER_ZERO:
                        score += "Love";
                        break;
                    case NUMBER_ONE:
                        score += "Fifteen";
                        break;
                    case NUMBER_TWO:
                        score += "Thirty";
                        break;
                    case NUMBER_THREE:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getString(int scoreFirst, int scoreSecond) {
        String score;
        int minusResult = scoreFirst - scoreSecond;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scoreFirst, scoreSecond;
        do {
            System.out.print("Nhap diem 1:");
            scoreFirst = scanner.nextInt();
            System.out.print("Nhap diem 2:");
            scoreSecond = scanner.nextInt();
        } while (scoreFirst < 0 || scoreSecond < 0);
        System.out.println(getScore(scoreFirst, scoreSecond));
    }
}
