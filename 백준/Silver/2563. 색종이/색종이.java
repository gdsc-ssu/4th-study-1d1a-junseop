import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] paper = new int[100][100];
    int numOfPaper = scanner.nextInt();

    for (int i = 0; i < numOfPaper; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      // 입력 받은 좌표로 부터 10x10을 1로 채우기
      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          paper[j][k] = 1;
        }
      }
    }

    int area = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (paper[i][j] == 1) {
          area++;
        }
      }
    }

    System.out.println(area);
    scanner.close();
  }
}
