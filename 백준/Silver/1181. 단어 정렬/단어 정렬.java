import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] words = new String[n];

    for (int i = 0; i < n; i++) {
      words[i] = scanner.next();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (words[i].length() > words[j].length()) {
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        } else if (words[i].length() == words[j].length()) {
          if (words[i].compareTo(words[j]) > 0) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (i > 0 && words[i].equals(words[i - 1])) {
        continue;
      }
      System.out.println(words[i]);
    }
  }
}
