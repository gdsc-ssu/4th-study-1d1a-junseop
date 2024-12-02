import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] nArr = new int[n];
    for (int i = 0; i < n; i++) {
      nArr[i] = scanner.nextInt();
    }
    Arrays.sort(nArr);

    int m = scanner.nextInt();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < m; i++) {
      int target = scanner.nextInt();
      int result = binarySearch(nArr, target);
      if (result == -1) {
        stringBuilder.append(0).append(" ");
      } else {
        stringBuilder.append(1).append(" ");
      }
    }
    System.out.println(stringBuilder);
  }

  private static int binarySearch(int[] nArr, int target) {
    int start = 0;
    int end = nArr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (nArr[mid] == target) {
        return mid;
      } else if (nArr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
