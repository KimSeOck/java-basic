package day3.method;

public class Person {
    int age;
    String name;
    // 메서드는 동작(연산)을 표현한다.
    // 접근제어자 리턴타입 메서드명(매개변수) {내용}
    // 동작은 일단 쉽게 출력으로 대체할 것임.
    public void walk() {
        System.out.println("사람이 걷습니다.");

    }
    public void introduce(String name2, int age2) {
        System.out.println("안녕하세요." + age2 + "살 " + name2 + "입니다.");
    }

    public void introduce2() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }

}
