import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCases = scanner.nextInt();
    String[] result = new String[testCases];

    for (int i = 0; i < testCases; i++) {
      int cent = scanner.nextInt();

      int quarters = cent / 25;
      cent %= 25;

      int dimes = cent / 10;
      cent %= 10;

      int nickels = cent / 5;
      cent %= 5;

      int pennies = cent;

      result[i] = quarters + " " + dimes + " " + nickels + " " + pennies;
    }

    for (int i = 0; i < testCases; i++) {
      System.out.println(result[i]);
    }

    scanner.close();
  }
}
