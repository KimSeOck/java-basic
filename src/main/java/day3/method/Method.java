package day3.method;

public class Method {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        p1.introduce2();
        p2.introduce2();
    }
}
