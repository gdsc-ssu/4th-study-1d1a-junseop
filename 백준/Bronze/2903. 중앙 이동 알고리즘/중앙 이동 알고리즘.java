import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    // 각 변의 점 개수는 2^N + 1
    int pointsPerSide = (int) Math.pow(2, N) + 1;

    // 전체 점의 수는 (pointsPerSide)^2
    int totalPoints = pointsPerSide * pointsPerSide;

    System.out.println(totalPoints);
  }
}
