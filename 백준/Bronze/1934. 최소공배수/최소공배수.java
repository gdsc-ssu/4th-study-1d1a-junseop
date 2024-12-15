import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기, 최소공배수 구하기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
      long A = scanner.nextLong();
      long B = scanner.nextLong();
      long GDC = getGDC(A, B);
      long LCM = A * B / GDC;
      result.append(LCM).append("\n");
    }

    // 3. 출력하기
    System.out.println(result);
  }

  //최소 공배수 찾는 메서드
  private static long getGDC(long A, long B) {
    long a = A;
    long b = B;
    long temp = 0;

    while (b != 0) {
      temp = a % b;
      a = b;
      b = temp;
    }

    return a;
  }
}
