package day2;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int num1 = sc.nextInt();
//        System.out.println("당신이 입력한 첫번째 값은 : " + num1);
//
//        int num2 = sc.nextInt();
//        System.out.println("당신이 입력한 두번째 값은 : " + num2);
//
//        System.out.println(num1+ "+" + num2 + "=" + (num1 + num2));

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("원하시는 단의 값을 입력하시오 : ");
//        int num = sc.nextInt();
//        System.out.println("입력한 값 : " + num);
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println( num + "X" + i + "=" +(num*i));
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("당신의 이름은 : " + name);

        System.out.print("나이를 입력해주세요 : ");
        int year = sc.nextInt();
        System.out.println("당신의 나이는 : " + year);

        System.out.println("안녕하세요. " + year + "살 " + name +"입니다.");

    }
}
