import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String receivedWord = scanner.nextLine();
    int count = countCroatianAlphabet(receivedWord);
    System.out.print(count);
  }

  private static int countCroatianAlphabet(String receivedWord) {
    int count = 0;
    // 우선순위에 따라 정렬
    CroatianAlphabet[] croatianAlphabets = {
        CroatianAlphabet.DZ_EQUALS,
        CroatianAlphabet.C_EQUALS,
        CroatianAlphabet.C_DASH,
        CroatianAlphabet.D_DASH,
        CroatianAlphabet.LJ,
        CroatianAlphabet.NJ,
        CroatianAlphabet.S_EQUALS,
        CroatianAlphabet.Z_EQUALS
    };

    for (CroatianAlphabet croatianAlphabet : croatianAlphabets) {
      while (receivedWord.contains(croatianAlphabet.getValue())) {
        receivedWord = receivedWord.replaceFirst(croatianAlphabet.getValue(), " ");
        count++;
      }
    }

    receivedWord = receivedWord.replace(" ", "");
    count += receivedWord.length();
    return count;
  }

  // 열거형을 사용하여 카운팅할 트리거를 열거한다
  private enum CroatianAlphabet {
    C_EQUALS("c="),
    C_DASH("c-"),
    DZ_EQUALS("dz="),
    D_DASH("d-"),
    LJ("lj"),
    NJ("nj"),
    S_EQUALS("s="),
    Z_EQUALS("z=");

    private String value;

    CroatianAlphabet(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
