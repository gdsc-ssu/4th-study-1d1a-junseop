import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    calculateNumOfV();
  }

  private static void calculateNumOfV() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    int numOfV = 0;
    int targetNum = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      if (numbers[i] == targetNum) {
        numOfV++;
      }
    }
    System.out.println(numOfV);
  }
}
