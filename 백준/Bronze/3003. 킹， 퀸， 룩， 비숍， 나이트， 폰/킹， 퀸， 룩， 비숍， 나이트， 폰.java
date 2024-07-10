import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] receivedSet = new int[6];
    for (int i = 0; i < 6; i++) {
      receivedSet[i] = scanner.nextInt();
    }
    int[] complementSet = {0, 0, 0, 0, 0, 0};
    int[] fullSet = {1, 1, 2, 2, 2, 8};
    for (int i = 0; i < 6; i++) {
      complementSet[i] = fullSet[i] - receivedSet[i];
    }
    for (int i : complementSet) {
      System.out.print(i + " ");
    }
  }
}
