package day2;

public class Triangle3 {
    public static void main(String[] args) {
        int n = 55;
        int mid = (n + 1) / 2;

        // 첫 번째 부분: 증가하는 삼각형
        for (int i = 1; i <= mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 두 번째 부분: 감소하는 삼각형
        for (int i = mid - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
