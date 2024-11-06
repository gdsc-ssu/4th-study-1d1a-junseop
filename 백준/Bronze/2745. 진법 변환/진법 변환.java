import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String N = scanner.next();
    int B = scanner.nextInt();
    scanner.close();

    int decimalValue = 0;
    int power = 1; // 현재 자릿수의 값 (B^0, B^1, B^2, 순으로 증가)

    // 각 자리의 문자를 오른쪽에서 왼쪽으로 순회하며 계산
    for (int i = N.length() - 1; i >= 0; i--) {
      char currentChar = N.charAt(i);

      int digitValue;
      if (Character.isDigit(currentChar)) { // 10진수일 경우
        digitValue = currentChar - '0';
      } else {
        digitValue = currentChar - 'A' + 10; // A ~ Z 는 10 ~ 35 까지
      }

      // 10진수로 만들기
      decimalValue += digitValue * power;

      // 다음 자릿수 계산
      power *= B;
    }

    System.out.println(decimalValue);
  }
}
