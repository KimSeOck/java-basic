package day2;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("기능을 선택해주세요 : 1.더하기 2.빼기 3.곱하기 4.나누기 5.종료 ");
            int num = sc.nextInt();

            if(num == 1){
                System.out.print("첫번째 값을 입력하시오 : ");
                int num1 = sc.nextInt();
                System.out.println("당신이 입력한 첫번째 값은 : " + num1);

                System.out.print("두번째 값을 입력하시오 : ");
                int num2 = sc.nextInt();
                System.out.println("당신이 입력한 두번째 값은 : " + num2);

                System.out.println(num1 + " + "+ num2 + " = " + (num1 + num2));
            }

            if(num == 2){
                System.out.print("첫번째 값을 입력하시오 : ");
                int num1 = sc.nextInt();
                System.out.println("당신이 입력한 첫번째 값은 : " + num1);

                System.out.print("두번째 값을 입력하시오 : ");
                int num2 = sc.nextInt();
                System.out.println("당신이 입력한 두번째 값은 : " + num2);

                System.out.println(num1 + " - "+ num2 + " = " + (num1 - num2));
            }

            if(num == 3){
                System.out.print("첫번째 값을 입력하시오 : ");
                int num1 = sc.nextInt();
                System.out.println("당신이 입력한 첫번째 값은 : " + num1);

                System.out.print("두번째 값을 입력하시오 : ");
                int num2 = sc.nextInt();
                System.out.println("당신이 입력한 두번째 값은 : " + num2);

                System.out.println(num1 + " X "+ num2 + " = " + (num1 * num2));
            }

            if(num == 4){
                System.out.print("첫번째 값을 입력하시오 : ");
                int num1 = sc.nextInt();
                System.out.println("당신이 입력한 첫번째 값은 : " + num1);

                System.out.print("두번째 값을 입력하시오 : ");
                int num2 = sc.nextInt();
                System.out.println("당신이 입력한 두번째 값은 : " + num2);

                System.out.println(num1 + " / "+ num2 + " = " + (num1 / num2));
            }

            if(num == 5){
                break;
            }

            if(num == 6){
                System.out.println("그런 기능은 존재하지 않습니다.");
            }


        }

        System.out.println("프로그램이 종료되었습니다.");


    }

}
