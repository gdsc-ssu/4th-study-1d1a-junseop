import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 1. 입력받기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();

    String[][] arr = new String[n][2];
    for (int i = 0; i < n; i++) {
      arr[i][0] = scanner.next(); // 나이
      arr[i][1] = scanner.next(); // 이름
    }
    scanner.close();

    // 2. 정렬: 나이 순서로 정렬 (같은 나이면 입력 순서 유지)
    Arrays.sort(
        arr,
        (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0])
        // 적은 것이 앞으로 오도록 정렬
        // 결과가 음수면 a가 b보다 앞에 위치
    );

    // 3. 출력하기
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
  }
}
