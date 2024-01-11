import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInputNumber = scanner.nextInt();
        int secondInputNumber = scanner.nextInt();

        int hundreds = (secondInputNumber / 100) * 100;
        int tens = ((secondInputNumber - hundreds) / 10) * 10;
        int units = (secondInputNumber - hundreds  - tens);

        System.out.println(firstInputNumber * units);
        System.out.println(firstInputNumber * tens / 10);
        System.out.println(firstInputNumber * hundreds / 100);

        System.out.println(firstInputNumber * secondInputNumber);

        scanner.close();
    }
}
