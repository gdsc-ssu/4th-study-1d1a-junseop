import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int B = scanner.nextInt();
    scanner.close();

    StringBuilder result = new StringBuilder();

    // N을 B진법으로 변환
    while (N > 0) {
      int remainder = N % B;

      if (remainder < 10) {
        result.append((char) ('0' + remainder));  // 0 ~ 9
      } else {
        result.append((char) ('A' + (remainder - 10)));  // A ~ Z
      }

      N /= B;  // 다음 자릿수를 위해 N을 B로 나누기
    }

    System.out.println(result.reverse());
  }
}
