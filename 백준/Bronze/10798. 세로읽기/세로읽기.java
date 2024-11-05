import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[][] matrix = new char[5][15];

    for (int i = 0; i < 5; i++) {
      String line = scanner.nextLine();
      for (int j = 0; j < line.length(); j++) {
        matrix[i][j] = line.charAt(j);
      }
    }

    StringBuilder output = new StringBuilder();
    for (int j = 0; j < 15; j++) {
      for (int i = 0; i < 5; i++) {
        if (matrix[i][j] != '\0') {
          output.append(matrix[i][j]);
        }
      }
    }

    System.out.println(output.toString());

    scanner.close();
  }
}
