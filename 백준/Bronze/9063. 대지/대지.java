import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextInt();
    long minX = Integer.MAX_VALUE;
    long maxX = Integer.MIN_VALUE;
    long minY = Integer.MAX_VALUE;
    long maxY = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (x < minX) {
        minX = x;
      }
      if (x > maxX) {
        maxX = x;
      }
      if (y < minY) {
        minY = y;
      }
      if (y > maxY) {
        maxY = y;
      }
    }
    scanner.close();

    long area = (maxX - minX) * (maxY - minY);
    System.out.println(area);
  }
}
