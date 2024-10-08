package day6.constructor;

public class Person {
    int age;
    String name;

    // 리턴 타입이 없고, Class명과 동일한 이름의 특수한 메서드 ==> 생성자.
    // 객체가 new로 생성되면 생성자는 무조건 실행된다.
    public Person(String nameParam, int ageParam){
        name = nameParam;
        age = ageParam;
    }

    public void introduce(){
        System.out.println("안녕하세요." + age + "살 " + name + "입니다.");
    }

}
