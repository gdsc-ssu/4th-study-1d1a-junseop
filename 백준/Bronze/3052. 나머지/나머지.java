import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10]; // 10개의 서로 다른 숫자가 주어짐
    for (int i = 0; i < 10; i ++) {
      numbers[i] = scanner.nextInt();
    }
    // 숫자들을 42로 나눠서 서로 다른 나머지를 갖는 수는 몇 개 인지 출력하자
    int[] remains = new int[42]; // 이 때 모든 요소는 0으로 초기화 돼있음
    int count = 0;
    for (int j = 0; j < 10; j++) {
      remains[numbers[j] % 42] = 1; // 각 나머지에 해당하는 요소를 1로 변경
      // 중복되는 나머지가 있어도 똑같기 때문에 서로 다른 나머지를 체크 가능
    }
    for (int k = 0; k < 42; k++) {
      if (remains[k] != 0) {
        count++;
      }
    }
    System.out.print(count);
  }
}
