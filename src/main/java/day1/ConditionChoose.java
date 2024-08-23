package day1;

public class ConditionChoose {
    public static void main(String[] args) {

        // 택일 구조

        // 남녀 (양자택일)

        // 학적 (사자택일)

        // 성적 (오자택일)

        int age;
        age = 25;

        if (age <= 13) {
            System.out.println("초등학생입니다.");
        }
        else if (age <= 16) {
            System.out.println("중학생입니다.");
        }
        else if (age <= 19) {
            System.out.println("고등학생입니다.");
        }
        else {
            System.out.println("성인입니다.");
        }

        // 성적 출력

        int score;
        score = 100;

        if (score >= 90) {
            System.out.println("A입니다.");
        }
        else if (score >= 80) {
            System.out.println("B입니다.");
        }
        else if (score >= 70) {
            System.out.println("C입니다.");
        }
        else if (score >= 60) {
            System.out.println("D입니다.");
        }
        else {
            System.out.println("F입니다.");
        }



    }
}
