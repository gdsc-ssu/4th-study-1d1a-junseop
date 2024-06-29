import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    starOperator(scanner.nextInt());
  }

  private static void starOperator(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j --) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
