import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }

        List<String> unheardUnseen = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                unheardUnseen.add(name);
            }
        }

        Collections.sort(unheardUnseen);

        bw.write(unheardUnseen.size() + "\n");
        for (String name : unheardUnseen) {
            bw.write(name + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
