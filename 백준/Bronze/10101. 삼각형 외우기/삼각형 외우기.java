import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int firstAngle = scanner.nextInt();
    int secondAngle = scanner.nextInt();
    int thirdAngle = scanner.nextInt();
    scanner.close();

    if (firstAngle + secondAngle + thirdAngle != 180) {
      System.out.println("Error");
    } else {
      if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
        System.out.println("Equilateral");
      } else if (firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle) {
        System.out.println("Isosceles");
      } else {
        System.out.println("Scalene");
      }
    }
  }
}
