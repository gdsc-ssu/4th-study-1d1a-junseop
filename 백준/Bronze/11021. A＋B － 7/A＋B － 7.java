import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    calculateSum();
  }

  private static void calculateSum() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(reader.readLine());
    for (int i = 1; i <= n; i++) {
      List<String> numbers = List.of(reader.readLine().split(" "));
      int sum = Integer.parseInt(numbers.get(0)) + Integer.parseInt(numbers.get(1));
      writer.write("Case #" + i + ": " + sum);
      writer.newLine();
    }
    writer.flush();
    writer.close();
  }
}
