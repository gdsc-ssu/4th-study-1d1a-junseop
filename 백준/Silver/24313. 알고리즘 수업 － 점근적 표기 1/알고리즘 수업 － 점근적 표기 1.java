import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();
        scanner.close();

        // Big-O 조건 확인
        boolean isBigO = true;

        if (a1 > c) {
            isBigO = false;
        } else {
            for (int n = n0; n <= 100; n++) {
                if (a1 * n + a0 > c * n) {
                    isBigO = false;
                    break;
                }
            }
        }

        System.out.println(isBigO ? 1 : 0);
    }
}
