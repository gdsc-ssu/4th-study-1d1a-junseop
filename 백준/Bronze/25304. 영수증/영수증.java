import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    validateMoney();
  }

  private static void validateMoney() {
    Scanner scanner = new Scanner(System.in);
    int total = scanner.nextInt();
    int num = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < num; i++) {
      int receivedMoney = receiveMoney(scanner.nextInt(), scanner.nextInt());
      sum += receivedMoney;
    }
    if (total == sum) {
      System.out.println("Yes");
    }
    if (total != sum) {
      System.out.println("No");
    }
  }

  private static int receiveMoney(int price, int num) {
    return price * num;
  }
}
