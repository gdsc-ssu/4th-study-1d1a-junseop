import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        long count = (long) n * (n - 1) * (n - 2) / 6;
        System.out.println(count);

        System.out.println(3);
    }
}
