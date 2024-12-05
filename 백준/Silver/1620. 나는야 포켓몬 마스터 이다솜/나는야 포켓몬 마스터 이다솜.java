import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    Map<Integer, String> indexToName = new HashMap<>();
    Map<String, Integer> nameToIndex = new HashMap<>();

    for (int i = 0; i < n; i++) {
      String name = scanner.next();
      indexToName.put(i + 1, name);
      nameToIndex.put(name, i + 1);
    }

    // 2. 집합에 포함되어 있는지 확인
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      String input = scanner.next();
      if (input.matches("[0-9]+")) {
        sb.append(indexToName.get(Integer.parseInt(input)) + "\n");
      } else {
        sb.append(nameToIndex.get(input) + "\n");
      }
    }

    // 3. 결과 출력
    System.out.println(sb);
  }
}
