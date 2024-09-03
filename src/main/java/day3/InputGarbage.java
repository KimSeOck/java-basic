package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {
        //이름 입력 : 홍길동
        //나이 입력 : 24

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");

    }
}
