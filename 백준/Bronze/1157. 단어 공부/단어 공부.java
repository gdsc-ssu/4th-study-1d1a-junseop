import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedWord = scanner.nextLine().toLowerCase();
    // 인덱스 a ~ z 는 0 ~ 25
    int[] countsOfAlphabet = new int[26];
    // 이 때 카운트는 해당 입력 받은 단어의 길이 만큼의 int 배열을 만든다

    // 각 인덱스 별로 자신과 같은 것이 있는지 체크 후 있다면 카운트를 올림
    for (int i = 0; i < receivedWord.length(); i++) {
      countsOfAlphabet[receivedWord.charAt(i) - 'a']++; // a면 0이 나온다
    }

    // int 배열에서 가장 숫자가 큰 인덱스에 해당하는 문자를 출력
    int indexOfMaxCount = findMax(countsOfAlphabet);

    // 만약 공동 1등이 있다면 ?를 출력한다
    // max 를 찾은 후 자신과 같은 카운트가 있는지 순회하며 확인하자
    int sameCount = 0;
    for (int i = 0; i < countsOfAlphabet.length; i++) {
      if (countsOfAlphabet[indexOfMaxCount] == countsOfAlphabet[i]) {
        sameCount++;
      }
    }

    if (sameCount >= 2) {
      System.out.print("?");
    } else {
      char maxChar = (char) (indexOfMaxCount + 'a');
      String str = String.valueOf(maxChar);
      System.out.print(str.toUpperCase());
    }
  }

  private static int findMax(int[] arr) {
    int indexOfMax = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[indexOfMax] < arr[i]) {
        indexOfMax = i;
      }
    }
    return indexOfMax;
  }
}
