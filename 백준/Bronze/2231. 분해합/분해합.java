import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    int result = 0; // 가장 작은 생성자 -> 없을 경우 0

    for (int i = 1; i < n; i++) {
      int sum = i;
      int temp = i;

      while (temp != 0) {
        sum += temp % 10; // mod 연산으로 마지막 자리수를 추가함
        temp /= 10;
      }

      if (sum == n) {
        result = i;
        break;
      }
    }

    System.out.println(result);
  }
}
