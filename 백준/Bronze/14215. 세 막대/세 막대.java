import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        // 가장 긴 변을 sides[2]로 설정했으므로
        if (sides[0] + sides[1] > sides[2]) {
            // 삼각형 성립
            System.out.println(sides[0] + sides[1] + sides[2]);
        } else {
            // 삼각형 성립 안됨 -> 가장 긴 변을 줄여 성립
            System.out.println(2 * (sides[0] + sides[1]) - 1);
        }
    }
}
