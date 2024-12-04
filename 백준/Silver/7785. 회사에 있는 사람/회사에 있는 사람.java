import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    Map<String, Boolean> remain = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String name = scanner.next();
      String status = scanner.next();
      if ("enter".equals(status)) {
        remain.put(name, true);
      } else {
        remain.put(name, false);
      }
    }

    // 2. 결과 출력 (사전 순의 역순 정렬)
    remain.entrySet()
          .stream()
          .filter(entry -> entry.getValue())
          .map(Map.Entry::getKey)
          .sorted(Comparator.reverseOrder())
          .forEach(System.out::println);
  }
}
