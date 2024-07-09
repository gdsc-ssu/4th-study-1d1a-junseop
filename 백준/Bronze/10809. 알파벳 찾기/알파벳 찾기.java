import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedLine = scanner.nextLine();
    int[] positions = new int[26];
    Arrays.fill(positions, -1);
    for (int i = 0; i < receivedLine.length(); i++) {
      int indexOfPositions = receivedLine.charAt(i) - 'a';
      if (positions[indexOfPositions] == -1) {
        positions[indexOfPositions] = i;
      }
    }
    for (int position : positions) {
      System.out.print(position + " ");
    }
  }
}
