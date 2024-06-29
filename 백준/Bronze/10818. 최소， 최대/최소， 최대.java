import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sizeOfNumbers = scanner.nextInt();
    int[] numbers = new int[sizeOfNumbers];
    for (int i = 0; i < sizeOfNumbers; i++) {
      numbers[i] = scanner.nextInt();
    }
    int minOfNum = numbers[0];
    int maxOfNum = numbers[0];
    for (int i = 0; i < sizeOfNumbers; i++) {
      if (minOfNum > numbers[i]) {
        minOfNum = numbers[i];
      }
      if (maxOfNum < numbers[i]) {
        maxOfNum = numbers[i];
      }
    }
    System.out.print(minOfNum + " " + maxOfNum);
  }
}
