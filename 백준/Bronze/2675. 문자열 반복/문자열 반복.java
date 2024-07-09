import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tryCount = scanner.nextInt();
    for (int i = 0; i < tryCount; i++) {
      int repeatCount = scanner.nextInt();
      String receivedLine = scanner.next();
      char[] arrayOfLine = receivedLine.toCharArray();
      for (char c : arrayOfLine) {
        for (int k = 0; k < repeatCount; k++) {
          System.out.print(c);
        }
      }
      System.out.println();
    }
  }
}
