import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextInt();
    scanner.close();

    long length = 4 * n;

    System.out.println(length);
  }
}
