package day3.exam6;

public class Person {

    int age;
    String name;

    public void introduce(){
        for (int i = 1; i <= 10; i++){
            System.out.println("안녕하세요! 저는 " + age + "살 " + name + "입니다!");
        }
    }
}
