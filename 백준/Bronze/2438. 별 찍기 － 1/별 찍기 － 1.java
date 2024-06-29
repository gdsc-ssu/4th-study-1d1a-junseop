import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    starOperator(scanner.nextInt());
  }

  private static void starOperator(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j ++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
