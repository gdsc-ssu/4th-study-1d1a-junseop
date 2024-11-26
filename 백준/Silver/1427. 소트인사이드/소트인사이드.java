import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] charArray = scanner.next().toCharArray();
    int[] numberArray = new int[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      numberArray[i] = charArray[i] - '0';
    }
    Arrays.sort(numberArray);
    for (int i = numberArray.length - 1; i >= 0; i--) {
      System.out.print(numberArray[i]);
    }
  }
}
