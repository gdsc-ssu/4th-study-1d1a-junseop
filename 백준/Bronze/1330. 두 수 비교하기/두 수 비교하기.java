import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInputNumber = scanner.nextInt();
        int secondInputNumber = scanner.nextInt();

        if (firstInputNumber > secondInputNumber) {
            System.out.println(">");
        }

        if (firstInputNumber < secondInputNumber) {
            System.out.println("<");
        }

        if (firstInputNumber == secondInputNumber) {
            System.out.println("==");
        }

        scanner.close();
    }
}
