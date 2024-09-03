package day3.exam7;

public class ExamTest7 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";

        p1.introduce(3);
        System.out.println();
        p1.introduce(5);
        System.out.println();
        p1.introduce(10);
        System.out.println();
    }
}
