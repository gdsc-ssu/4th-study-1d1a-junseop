import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int k = scanner.nextInt();

    int[] arr = new int[N];

    for (int i = 0; i < N; i++){
      arr[i] = scanner.nextInt();
    }
    scanner.close();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(arr[k - 1]);
  }
}
