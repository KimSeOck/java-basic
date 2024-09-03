package day8.staticExam;

public class Person {
    int age;
    String name;
    static int avgAge;

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void introduce(){
        System.out.printf("안녕하세요. %d살 %s입니다.\n", age, name);
    }

}
