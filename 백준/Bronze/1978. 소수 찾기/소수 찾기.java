import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  
        int primeCount = 0;  

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();  
            if (isPrime(number)) {  
                primeCount++;
            }
        }

        scanner.close();
        System.out.println(primeCount);  
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // 2부터 √num까지 나눠떨어지면 소수가 아님
            }
        }
        return true;
    }
}
