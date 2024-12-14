import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();

    // 2. 서로 다른 부분 문자열 만들기
    Set<String> set = new HashSet<>();
    for (int i = 0; i < S.length(); i++) {
      for (int j = i + 1; j <= S.length(); j++) {
        // 중복이기 때문에 i + 1부터 시작
        set.add(S.substring(i, j)); // i부터 j까지의 문자열을 set에 추가
        // HashSet에 a, ab, aba, abab, ababc
        // b, ba, bab, babc
        // a*, ab*, abc
        // b*, bc
        // c
      }
    }

    // 3. 출력
    System.out.println(set.size());
  }
}
