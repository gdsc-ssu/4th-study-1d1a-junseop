import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedLine = scanner.nextLine().trim(); // 앞 뒤 공백 제거
    if (receivedLine.isEmpty()) {
      System.out.println(0);
    }
    if (!receivedLine.isEmpty()) {
      String[] words = receivedLine.split(" ");
      System.out.println(words.length);
    }
  }
}
