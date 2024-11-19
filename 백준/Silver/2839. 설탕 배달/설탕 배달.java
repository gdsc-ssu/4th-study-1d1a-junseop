import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    int min = Integer.MAX_VALUE;

    for (int i = 0; i <= N / 5; i++) { // 5kg의 수 i
      for (int j = 0; j <= N / 3; j++) { // 3kg의 수 j
        if (5 * i + 3 * j == N) { // 모든 경우의 수를 체크
          min = Math.min(min, j + i);
        }
      }
    }
    if (min == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(min);
    }
  }
}
