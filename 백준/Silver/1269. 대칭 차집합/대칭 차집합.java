import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    // 1. 입력값 받기
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>();
    for (int i = 0; i < a; i++) {
      setA.add(scanner.nextInt());
    }
    for (int i = 0; i < b; i++) {
      setB.add(scanner.nextInt());
    }

    // 2. 대칭 차집합 구하기
    Set<Integer> result = new HashSet<>();
    for (int num : setA) {
      if (!setB.contains(num)) {
        result.add(num);
      }
    }

    for (int num : setB) {
      if (!setA.contains(num)) {
        result.add(num);
      }
    }

    // 3. 출력
    System.out.println(result.size());
  }
}
