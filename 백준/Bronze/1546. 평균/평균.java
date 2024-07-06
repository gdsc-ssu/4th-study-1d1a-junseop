import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfScore = scanner.nextInt(); // 총 과목 수 입력
    int[] scores = new int[numOfScore];
    for (int i = 0; i < numOfScore; i++) {
      scores[i] = scanner.nextInt(); // 과목 수 만큼 현재 성적 입력
    }
    int maxOfScore = max(scores); // 최고점 찾기
    double[] newScores = new double[numOfScore]; // 모든 점수를 점수/max *100으로 고치자
    double sum = 0;
    for (int i = 0; i < numOfScore; i++) {
      newScores[i] = (double) scores[i] / maxOfScore * 100;
      sum += newScores[i];
    }
    System.out.println(sum / numOfScore);
  }

  private static int max(int[] array) {
    int max = array[0];
    for (int j : array) {
      if (max < j) {
        max = j;
      }
    }
    return max;
  }
}
