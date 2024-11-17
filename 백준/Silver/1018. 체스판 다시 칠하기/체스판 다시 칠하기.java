import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    scanner.nextLine();

    char[][] board = new char[N][M];
    for (int i = 0; i < N; i++) {
      String line = scanner.nextLine();
      board[i] = line.toCharArray();
    }
    scanner.close();

    int minRepaint = Integer.MAX_VALUE;

    for (int i = 0; i <= N - 8; i++) {
      for (int j = 0; j <= M - 8; j++) {
        minRepaint = Math.min(minRepaint, calculateRepaints(board, i, j));
      }
    }

    System.out.println(minRepaint);
  }

  private static int calculateRepaints(char[][] board, int startRow, int startCol) {
    String[] patternA = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    };

    String[] patternB = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    };

    int repaintA = 0;
    int repaintB = 0;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (board[startRow + i][startCol + j] != patternA[i].charAt(j)) {
          repaintA++;
        }
        if (board[startRow + i][startCol + j] != patternB[i].charAt(j)) {
          repaintB++;
        }
      }
    }
    return Math.min(repaintA, repaintB);
  }
}
