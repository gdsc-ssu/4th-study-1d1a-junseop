import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[][] points = new int[N][2];

    for (int i = 0; i < N; i++) {
      points[i][0] = scanner.nextInt();
      points[i][1] = scanner.nextInt();
    }

    Arrays.sort(points, (a, b) -> {
      if (a[0] == b[0]) { // 두 포인트의 x좌표가 같으면 y좌표로 정렬
        return a[1] - b[1]; // 양수이면 a가 b보다 뒤에 위치
      } else { // x좌표로 정렬
        return a[0] - b[0]; // y좌표
      }
    });
    
    for (int i = 0; i < N; i++) {
      System.out.println(points[i][0] + " " + points[i][1]);
    }
  }
}
