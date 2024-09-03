package day5.nameApp;

public class People {
    private String name;
    private int age;

    // 기본 생성자
    public People() {}

    // 매개변수가 있는 생성자
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 나이 반환
    public int getAge() {
        return age;
    }

    // 이름 설정
    public void setName(String name) {
        this.name = name;
    }

    // 나이 설정
    public void setAge(int age) {
        this.age = age;
    }

    // People 객체의 정보를 문자열로 반환
    @Override
    public String toString() {
        return name + ", " + age;
    }
}
