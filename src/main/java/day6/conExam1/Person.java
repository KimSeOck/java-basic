package day6.conExam1;

public class Person {
    int age;
    String name;

    Person(int age, String name){
        System.out.println("사람이 태어납니다.");

        this.age = age;
        this.name = name;

    }

    public void introduce(){
        //System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다.");
        System.out.printf("안녕하세요. 저는 %d살 %s입니다.\n", age, name);
    }

}

