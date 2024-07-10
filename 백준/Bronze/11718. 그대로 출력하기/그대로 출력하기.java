import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String str;
    while ((str = bufferedReader.readLine()) != null) {
      bufferedWriter.write(str);
      bufferedWriter.newLine();
    }
    bufferedReader.close();
    bufferedWriter.flush();
    bufferedWriter.close();
  }
}
