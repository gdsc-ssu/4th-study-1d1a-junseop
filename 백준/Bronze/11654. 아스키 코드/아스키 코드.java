import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedLine = scanner.nextLine();
    char firstChar = receivedLine.charAt(0);
    System.out.println((int)firstChar);
  }
}
