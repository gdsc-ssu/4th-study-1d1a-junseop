import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = 10;

        for (int t = 1; t <= T; t++) {
            // 건물의 개수 입력
            int N = scanner.nextInt();
            // 건물의 높이 배열 입력
            int[] buildings = new int[N];
            for (int i = 0; i < N; i++) {
                buildings[i] = scanner.nextInt();
            }

            int result = calculateViewableHouses(buildings);

            // 결과 출력
            System.out.println("#" + t + " " + result);
        }

        scanner.close();
    }

    private static int calculateViewableHouses(int[] buildings) {
        int viewableHouses = 0;

        for (int i = 2; i < buildings.length - 2; i++) {
            int leftMax = Math.max(buildings[i - 2], buildings[i - 1]);
            int rightMax = Math.max(buildings[i + 1], buildings[i + 2]);

            int currentBuildingHeight = buildings[i];

            if (currentBuildingHeight > leftMax && currentBuildingHeight > rightMax) {
                viewableHouses += Math.min(currentBuildingHeight - leftMax, currentBuildingHeight - rightMax);
            }
        }

        return viewableHouses;
    }
}
