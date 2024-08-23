package day1;

public class Operator {
    public static void main(String[] args) {
        // 산술 연산자
        // +, -, *, /, %

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        System.out.println(10 / 3); // 정수
        System.out.println(10.0 / 3.0); // 실수

        System.out.println(10 % 3); // 나머지 구하는 것

        // 비교 연산자 -> 논리값으로 결과가 나옴.
        // <, >, <=, >=, ==, !=

        System.out.println(10 > 5); // 맞음.
        System.out.println(10 < 5); // 틀림.

//        System.out.println(100);   // 숫자
//        System.out.println("100"); // 문자
//
//        System.out.println(true);
//        System.out.println("true");
//
        // 자료값
        // 숫자 - int, 문자 - String, 실수 - Double, 논리값(참/거짓) - boolean

        System.out.println(10 > 10);
        System.out.println(10 < 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println(!true);
        System.out.println(!false);

    }
}
