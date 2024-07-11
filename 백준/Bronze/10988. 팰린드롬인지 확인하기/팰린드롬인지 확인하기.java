import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] receivedWord = scanner.nextLine().toCharArray();
    char[] reverseWord = reverse(receivedWord);
    int count = 0;
    for (int i = 0; i < receivedWord.length; i++) {
      if (receivedWord[i] == reverseWord[i]) {
        count++;
      }
    }
    if (count == reverseWord.length) {
      System.out.print(1);
    } else System.out.print(0);
  }
  public static char[] reverse(char[] arr) {
    char[] reversed = new char[arr.length];
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      char temp = arr[start];
      reversed[start] = arr[end];
      reversed[end] = temp;
      start++;
      end--;
    }
    return reversed;
  }
}
