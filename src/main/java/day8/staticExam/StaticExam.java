package day8.staticExam;

public class StaticExam {
    public static void main(String[] args) {

        Person p1 = new Person(20,"홍길동");
        Person p2 = new Person(30,"이순신");

        p1.age++;
        p2.introduce();


        p1.avgAge = 81;
        //p1.printAvgAge();
        //p2.printAvgAge();

        //Person.printAveAge();



    }
}
