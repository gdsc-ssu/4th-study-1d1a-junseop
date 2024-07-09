import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfNumbers = Integer.parseInt(scanner.nextLine());
    String receivedLine = scanner.nextLine();
    char[] chars = receivedLine.toCharArray();
    int sumOfNumbers = 0;
    for (char c : chars) {
      sumOfNumbers += Character.getNumericValue(c);
    }
    System.out.println(sumOfNumbers);
  }
}
