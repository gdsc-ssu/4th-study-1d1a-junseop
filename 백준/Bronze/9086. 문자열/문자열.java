import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < testCase; i++) {
      String receivedStr = scanner.nextLine();
      String first = String.valueOf(receivedStr.charAt(0));
      String last = String.valueOf(receivedStr.charAt(receivedStr.length() - 1));
      System.out.println(first + last);
    }
  }
}
