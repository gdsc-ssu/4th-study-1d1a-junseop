import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    printTypeName(scanner.nextInt());
  }

  private static void printTypeName(int n) {
    //  n은 4의 배수
    int numOfTimes = n / 4;
    for (int i = 0; i < numOfTimes; i++) {
      System.out.print("long ");
    }
    System.out.print("int");
  }
}
