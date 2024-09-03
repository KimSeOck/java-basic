package day6.conExam1;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person(27, "홍길동");
        Person p2 = new Person(25, "홍길순");
        p1.introduce();
        p2.introduce();
        Car c1 = new Car("소나타", "하얀색", 100);
        Car c2 = new Car("모닝","검정색", 70);
        c1.drive();
        c2.drive();
        Cat cat1 = new Cat("아리", 6, "샴");
        Cat cat2 = new Cat("망고", 6, "샴");
        cat1.meow();
        cat2.meow();
        Warrior w1 = new Warrior("이순신", 20, 10);
        Warrior w2 = new Warrior("강감찬", 15, 15);
        w1.status();
        w2.status();
        w1.attack();
        w2.attack();
        w1.defense();
        w2.defense();
    }
}