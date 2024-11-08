import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    int numRings = 1;
    int range = 1;

    while (N > range) {
      range += 6 * numRings;
      numRings++;
    }

    System.out.println(numRings);
  }
}
