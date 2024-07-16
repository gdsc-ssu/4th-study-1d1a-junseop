import java.util.Scanner;

public class Main {

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tryCount = scanner.nextInt();
    scanner.nextLine();
    int checkCount = 0;
    for (int i = 0; i < tryCount; i++) {
      String receivedWord = scanner.nextLine();
      if (isGroupWord(receivedWord)) {
        checkCount++;
      }
    }
    System.out.println(checkCount);
    scanner.close();
  }

  public static boolean isGroupWord(String word) {
    // 알파벳 수 만큼의 boolean 배열을 만들어서 해당 단어가 나왔었는지 검사한다
    // 만약 이미 true 라면 그룹단어가 아님
    // 이때 prev 를 만들어서 앞 문자가 지금 문자와 같은지 체크한다 같다면 검사를 진행하지 않음
    boolean[] isContinuous = new boolean[26];
    char prev = 0;
    for (int i = 0; i < word.length(); i++) {
      if (prev == word.charAt(i)) {
        continue;
      }
      if (isContinuous[word.charAt(i) - 'a']) {
        return false;
      }
      isContinuous[word.charAt(i) - 'a'] = true;
      prev = word.charAt(i);
    }
    return true;
  }
}
