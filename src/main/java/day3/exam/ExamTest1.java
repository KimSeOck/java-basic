package day3.exam;

public class ExamTest1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.color = "하양색";
        person.model = "소나타";

        // racing 메서드 호출
        person.racing("검정색", "그랜저");    // 첫 번째 racing 호출
        person.racing("검정색", "그랜저");  // 두 번째 racing 호출
        person.racing("검정색", "그랜저");  // 세 번째 racing 호출

        // 다른 메서드 호출
        person.racing2("회색", "아반떼");
        person.racing3("초록색", "코란도");
        person.racing4();  // 이 메서드는 기본 색상과 모델을 사용
    }
}
