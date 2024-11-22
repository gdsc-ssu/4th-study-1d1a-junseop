import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 5;
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    scanner.close();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += array[i];
    }
    int avg = sum / n; 

    Arrays.sort(array); 
    int median = array[2]; 

    System.out.println(avg);
    System.out.println(median);
  }
}
