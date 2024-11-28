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
      if (a[1] == b[1]) {
        return a[0] - b[0];
      } else { 
        return a[1] - b[1]; 
      }
    });

    for (int i = 0; i < N; i++) {
      System.out.println(points[i][0] + " " + points[i][1]);
    }
  }
}
