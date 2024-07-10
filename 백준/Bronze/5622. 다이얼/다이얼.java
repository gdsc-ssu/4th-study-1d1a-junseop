import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedWord = scanner.nextLine().toLowerCase();
    int expectedTime = calculateAmountOfTime(receivedWord);
    System.out.println(expectedTime);
  }

  public static int calculateAmountOfTime(String str) {
    // a~c는 3초 w~z는 10초
    int[] dialTimes = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
    int expectedTime = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      expectedTime += dialTimes[ch - 'a'];
    }
    return expectedTime;
  }
}
