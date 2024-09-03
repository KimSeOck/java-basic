package day3.exam8;

public class ExamTest8 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // greeting1 메서드 호출
        p1.greeting1(2); // 하이~

        p1.greeting1(3); // 봉쥬

        p1.greeting1(1); // 안녕하세요

        // greeting2 메서드 호출
        p1.greeting2(1, 3); // 안녕하세요 3번 출력

        p1.greeting2(2, 5); // 하이~ 5번 출력

        p1.greeting2(3, 7); // 봉쥬 7번 출력
    }
}
