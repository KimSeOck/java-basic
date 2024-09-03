package day2;

public class Triangle2 {
    public static void main(String[] args) {
        int height = 3; // 삼각형의 높이

        for (int i = 0; i < height; i++) {
            // 각 줄마다 공백을 출력
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // 각 줄마다 별을 출력
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
