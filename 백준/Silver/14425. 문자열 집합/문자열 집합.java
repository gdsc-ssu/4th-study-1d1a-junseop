import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(scanner.next(), 0);
    }

    // 2. 집합에 포함되어 있는지 확인
    int count = 0;
    for (int i = 0; i < m; i++) {
      if (map.containsKey(scanner.next())) {
        count++;
      }
    }

    // 3. 결과 출력
    System.out.println(count);
  }
}
