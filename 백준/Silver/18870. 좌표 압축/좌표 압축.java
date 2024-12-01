import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 1. 입력 받기
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    scanner.close();

    // 2. 원래 배열의 값과 인덱스를 저장하는 2차원 배열 생성
    int[][] arrWithIndex = new int[n][2];
    for (int i = 0; i < n; i++) {
      arrWithIndex[i][0] = arr[i];
      arrWithIndex[i][1] = i;
    }

    // 3. 값 기준으로 정렬
    Arrays.sort(arrWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

    // 4. 순위 배열 생성
    int[] rank = new int[n];
    int currentRank = 0;
    rank[arrWithIndex[0][1]] = currentRank;
    for (int i = 1; i < n; i++) {
      if (arrWithIndex[i][0] != arrWithIndex[i - 1][0]) {
        currentRank++;
      }
      rank[arrWithIndex[i][1]] = currentRank;
    }

    // 5. 순위 출력
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(rank[i]).append(" ");
    }
    System.out.println(result.toString().trim());
  }
}
