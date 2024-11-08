import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    scanner.close();

    int diagonal = 1; // 대각선 번호
    int startIndex = 1; // 대각선 시작 인덱스

    // X가 위치한 대각선 찾기
    while (X > startIndex + diagonal - 1) {
      startIndex += diagonal;
      diagonal++;
    }

    int offset = X - startIndex; // 해당 대각선에서의 위치

    if (diagonal % 2 == 1) {
      int numerator = diagonal - offset;
      int denominator = 1 + offset;
      System.out.println(numerator + "/" + denominator);
    } else {
      int numerator = 1 + offset;
      int denominator = diagonal - offset;
      System.out.println(numerator + "/" + denominator);
    }
  }
}
