import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        scanner.close();

        int x4 = findUnique(x1, x2, x3);
        int y4 = findUnique(y1, y2, y3);

        System.out.println(x4 + " " + y4);
    }

    private static int findUnique(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
    }
}
