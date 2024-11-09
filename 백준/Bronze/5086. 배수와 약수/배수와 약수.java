import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break; 
            }

            if (num2 % num1 == 0) {
                System.out.println("factor");  // 첫 번째 숫자가 두 번째 숫자의 약수
            } else if (num1 % num2 == 0) {
                System.out.println("multiple");  // 첫 번째 숫자가 두 번째 숫자의 배수
            } else {
                System.out.println("neither");  // 둘 다 아님
            }
        }

        scanner.close();
    }
}
