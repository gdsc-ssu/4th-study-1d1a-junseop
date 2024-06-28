import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    printFastSum();
  }

  private static void printFastSum() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(reader.readLine());

    for (int i = 0; i < n; i++) {
      String[] inputs = reader.readLine().split(" ");
      int a = Integer.parseInt(inputs[0]);
      int b = Integer.parseInt(inputs[1]);
      int sum = calculateSum(a, b);
      writer.write(String.valueOf(sum));
      writer.newLine();
    }
    writer.flush();
    writer.close();
  }

  private static int calculateSum(int a, int b) {
    return a + b;
  }
}
