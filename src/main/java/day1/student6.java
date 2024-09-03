package day1;

public class student6 {
    public static void main(String[] args) {

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int i = n; i <= m; i++) {
            for (m = 20; m != 9; m += 2) {
                System.out.println(n + " X " + m + " = " + (n*m));
            }
            System.out.println();
        }

    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */

    }
}
