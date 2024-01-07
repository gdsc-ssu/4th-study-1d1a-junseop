import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // (A+B)%C 계산
        int result1 = (A + B) % C;
        System.out.println(result1);

        // ((A%C) + (B%C))%C 계산
        int result2 = ((A % C) + (B % C)) % C;
        System.out.println(result2);

        // (A×B)%C 계산
        int result3 = (A * B) % C;
        System.out.println(result3);

        // ((A%C) × (B%C))%C 계산
        int result4 = ((A % C) * (B % C)) % C;
        System.out.println(result4);

        scanner.close();
    }
}
