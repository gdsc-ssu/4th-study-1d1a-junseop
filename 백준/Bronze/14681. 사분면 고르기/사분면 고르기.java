import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int quadrant = calculateQuadrant(x, y);
        System.out.println(quadrant);
    }

    public static int calculateQuadrant(int x, int y) {
        if (x >= 0 && y >=0) {
            return 1;
        } if (x <= 0 && y >=0) {
            return 2;
        } if (x <= 0 && y <=0) {
            return 3;
        } else {
          return  4;
      }
    }
}
