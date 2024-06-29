import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    calculateNumOfV();
  }

  private static void calculateNumOfV() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int targetNum = scanner.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      if (numbers[i] < targetNum) {
        System.out.print(numbers[i] + " ");
      }
    }
  }
}
