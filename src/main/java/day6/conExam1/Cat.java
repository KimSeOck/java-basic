package day6.conExam1;

public class Cat {
    String name;
    int age;
    String kind;

    public Cat(String name, int age, String kind){
        System.out.println("고양이가 태어납니다.");

        this.name = name;
        this.age = age;
        this.kind = kind;

    }

    public void meow(){
        System.out.println(age + "살 " + kind +" 고양이 "+ name +"가 야옹하고 웁니다.");
    }

}
