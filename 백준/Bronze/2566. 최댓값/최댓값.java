import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] matrix = new int[9][9];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    int maxNumber = -1;
    int maxRow = 0;
    int maxCol = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > maxNumber) {
          maxNumber = matrix[i][j];
          maxRow = i + 1;
          maxCol = j + 1;
        }
      }
    }

    System.out.println(maxNumber);
    System.out.println(maxRow + " " + maxCol);

    scanner.close();
  }
}
