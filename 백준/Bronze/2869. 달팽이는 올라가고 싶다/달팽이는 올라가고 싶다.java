import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int up = scanner.nextInt();
    int down = scanner.nextInt();
    int length = scanner.nextInt();

    scanner.close();

    int count = (length - down) / (up - down);

    // 나머지가 있을 경우
    if ((length - down) % (up - down) != 0) {
      count++;
    }

    System.out.println(count);
  }
}
