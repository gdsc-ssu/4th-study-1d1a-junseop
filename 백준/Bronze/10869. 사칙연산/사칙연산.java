import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 두 자연수 A와 B 입력 받기
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A+B 출력
        System.out.println(A + B);

        // A-B 출력
        System.out.println(A - B);

        // A*B 출력
        System.out.println(A * B);

        // A/B 출력
        System.out.println(A / B);

        // A%B 출력
        System.out.println(A % B);
    }
}
