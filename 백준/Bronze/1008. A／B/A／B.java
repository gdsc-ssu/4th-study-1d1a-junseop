import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputVal1 = scanner.nextInt();
        int inputVal2 = scanner.nextInt();
        BigDecimal val1 = new BigDecimal(inputVal1);
        BigDecimal val2 = new BigDecimal(inputVal2);
        System.out.println(val1.divide(val2, 10, BigDecimal.ROUND_DOWN));
        }
    }
