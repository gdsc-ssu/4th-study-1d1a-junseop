import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int result = isLeapYear(year);
        System.out.println(result);
    }

    public static int isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
