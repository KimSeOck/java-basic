package day2;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        // == 계산기 프로그램 v1 ==
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 1
        // 첫번째 숫자를 입력해주세요 : 22
        // 두번째 숫자를 입력해주세요 : 44
        // 결과 : 22 + 44 = 66
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 3(입력)
        // 첫번째 숫자를 입력해주세요 : 2(입력)
        // 두번째 숫자를 입력해주세요 : 4(입력)
        // 결과 : 2 * 4 = 8
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 6(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 7(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 5(입력)

        // 계산기 프로그램을 종료합니다.

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
