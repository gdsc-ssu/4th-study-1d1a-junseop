import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 같지 않은 두 세 자리 수가 주워지며, 입력 된 숫자를 거꾸로 뒤집어 크기 비교한다
    String[] receivedNumbers = scanner.nextLine().trim().split(" ");
    for (int i = 0; i < receivedNumbers.length; i++) {
      receivedNumbers[i] = revers(receivedNumbers[i]); // 각 숫자를 거꾸로 뒤집음
    }
    int[] intArr = new int[receivedNumbers.length];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = Integer.parseInt(receivedNumbers[i]);
    }
    int max = findMax(intArr);
    System.out.print(max);
  }

  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  public static String revers(String str) {
    char[] arr = str.toCharArray();
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      char temp = str.charAt(start);
      arr[start] = str.charAt(end);
      arr[end] = temp;
      start++;
      end--;
    }
    return new String(arr); // char 문자열을 새로운 String 객체로
  }
}
