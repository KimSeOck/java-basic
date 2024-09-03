package day3.exam2;

public class ExamTest2 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.model = "소나타";
        p1.speed = 210;

        Person p2 = new Person();
        p2.model = "아반떼";
        p2.speed = 230;

        p1.boost();
        p2.boost();

    }
}
