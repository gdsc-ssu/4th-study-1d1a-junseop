import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 숫자 카드의 빈도를 저장할 Map
        Map<Integer, Integer> cardCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        // 확인할 숫자의 개수 M
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] results = new int[M];
        
        // M개의 숫자에 대해 빈도를 확인
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            results[i] = cardCount.getOrDefault(num, 0);
        }

        for (int i = 0; i < M; i++) {
            bw.write(results[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
