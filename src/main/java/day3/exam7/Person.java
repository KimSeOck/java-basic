package day3.exam7;

public class Person {
    int age;
    String name;

    public void introduce(int count){
        for (int i = 0; i < count; i++){
            System.out.println("안녕하세요! 저는 " + age + "살 " + name + "입니다!");
        }
    }
}
