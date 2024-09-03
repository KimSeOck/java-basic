package day3.exam8;

public class Person {

    // greeting1 메서드: 언어 코드에 따라 인사말 출력
    public void greeting1(int language) {
        String greeting;
        switch (language) {
            case 1:
                greeting = "안녕하세요";
                break;
            case 2:
                greeting = "하이~";
                break;
            case 3:
                greeting = "봉쥬";
                break;
            default:
                greeting = "Unknown language";
                break;
        }
        System.out.println(greeting);
    }

    // greeting2 메서드: 언어 코드와 횟수에 따라 인사말 반복 출력
    public void greeting2(int language, int count) {
        String greeting;
        switch (language) {
            case 1:
                greeting = "안녕하세요";
                break;
            case 2:
                greeting = "하이~";
                break;
            case 3:
                greeting = "봉쥬";
                break;
            default:
                greeting = "Unknown language";
                break;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(greeting);
        }
    }
}
