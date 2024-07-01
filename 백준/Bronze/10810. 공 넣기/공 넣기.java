import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 바구니의 수와 반복 수
    int numOfBasket = scanner.nextInt();
    int tryCount = scanner.nextInt();

    int[] baskets = new int[numOfBasket];
    for (int i = 0; i < numOfBasket; i++) {
      baskets[i] = 0;
    }

    for (int i = 1; i <= tryCount; i++) {
      // 시작, 끝, 넣을 공의 숫자
      int startNum = scanner.nextInt();
      int endNum = scanner.nextInt();
      int targetNumOfBall = scanner.nextInt();
      for (int j = startNum - 1; j < endNum; j++) {
        baskets[j] = targetNumOfBall;
      }
    }
    for (int i = 0; i < numOfBasket; i++) {
      System.out.print(baskets[i] + " ");
    }
  }
}
