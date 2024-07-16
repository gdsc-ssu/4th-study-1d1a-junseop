import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, Double> gradeMap = new HashMap<>();
    gradeMap.put("A+", 4.5);
    gradeMap.put("A0", 4.0);
    gradeMap.put("B+", 3.5);
    gradeMap.put("B0", 3.0);
    gradeMap.put("C+", 2.5);
    gradeMap.put("C0", 2.0);
    gradeMap.put("D+", 1.5);
    gradeMap.put("D0", 1.0);
    gradeMap.put("F", 0.0);

    // 총 수강 과목은 20 과목이며 P 학점은 계산에서 제외해야한다
    // 총 수강 학점을 저장하는 변수를 하나 생성하고
    // 총 수강 평점(학점 * 과목 평점)을 저장하는 변수를 생성하여 계산하고 넣는다
    // 이후 총 수강 평점을 학점의 총합으로 나눈다
    Double totalCredit = 0.0;
    Double totalGrade = 0.0;
    for (int i = 0; i < 20; i++) {
      List<String> line = List.of(scanner.nextLine().split(" "));
      String course = line.get(0);
      Double credit = Double.valueOf(line.get(1));
      String grade = line.get(2);
      if (grade.equals("P")) {
        continue;
      }
      totalCredit += credit;
      totalGrade += credit * gradeMap.get(grade);
    }
    System.out.println(totalGrade / totalCredit);
  }
}
