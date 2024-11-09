import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            int sum = 0;
            StringJoiner sj = new StringJoiner(" + ");

            for (int i = 1; i <= n / 2; i++) { // 약수는 n/2를 넘지 않음
                if (n % i == 0) {
                    sum += i;
                    sj.add(String.valueOf(i));
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ").append(sj).append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }

        System.out.println(sb);
    }
}
