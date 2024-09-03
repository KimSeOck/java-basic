package day5.exam5;

import java.util.ArrayList;

public class Exam5 {
    public static void main(String[] args) {

        //사람 생성
        // 이름, 나이로 생성

        ArrayList<Person> person = new ArrayList<>();

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 35;
        p3.name = "임꺽정";

        Person p4 = new Person();
        p4.age = 40;
        p4.name = "황진이";

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);

        for(int i = 0; i < person.size(); i++){
            Person p = person.get(i);
            p.introduce();
        }

        person.remove(1);
        System.out.println("===========================");

        for(int i = 0; i < person.size(); i++){
            Person p = person.get(i);
            p.introduce();
        }

        // 두 개 이상의 사물은 객체로 만들어 관리하라.

    }
}
