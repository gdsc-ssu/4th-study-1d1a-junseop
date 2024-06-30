import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int sizeOfNumbers = 9;
    int[] numbers = new int[sizeOfNumbers];

    for (int i = 0; i < sizeOfNumbers; i++) {
      numbers[i] = Integer.parseInt(reader.readLine());
    }

    int maxOfNum = numbers[0];
    int indexOfMax = 1;

    for (int i = 1; i < sizeOfNumbers; i++) {
      if (maxOfNum < numbers[i]) {
        maxOfNum = numbers[i];
        indexOfMax = i + 1;
      }
    }

    writer.write(String.valueOf(maxOfNum));
    writer.newLine();
    writer.write(String.valueOf(indexOfMax));

    writer.flush();
    writer.close();
    reader.close();
  }
}
