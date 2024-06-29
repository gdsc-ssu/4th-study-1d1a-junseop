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
    boolean running = true;
    while(running) {
      List<String> numbers = List.of(reader.readLine().split(" "));
      int a = Integer.parseInt(numbers.get(0));
      int b = Integer.parseInt(numbers.get(1));
      if (a == 0 && b == 0) {
        running = false;
      } else {
        int sum = a + b;
        writer.write(String.valueOf(sum));
        writer.newLine();
      }
    }
    writer.flush();
    writer.close();
    reader.close();
  }
}
