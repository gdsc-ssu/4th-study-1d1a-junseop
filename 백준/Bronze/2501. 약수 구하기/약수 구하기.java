import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 자연수 N
        int K = scanner.nextInt();  // K번째 약수
        scanner.close();

        int count = 0;  // 약수의 순서를 카운트

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {  // i가 N의 약수일 경우
                count++;
                if (count == K) {  // K번째 약수를 찾으면 출력
                    System.out.println(i);
                    return;
                }
            }
        }

        // 약수의 개수가 K보다 적은 경우
        System.out.println(0);
    }
}
