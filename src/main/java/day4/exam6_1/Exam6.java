package day4.exam6_1;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test vendingMachine = new Test();  // Test 객체 생성

        while (true) {
            System.out.println("기능을 선택해주세요 : 1.돈 투입 2.음료 선택 3.음료 목록 확인 4.잔액 확인 5.사용 종료 ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("돈을 투입해주세요 : ");
                    int amount = sc.nextInt();
                    vendingMachine.insertMoney(amount);  // 돈 투입
                    break;
                case 2:
                    System.out.print("음료를 선택해주세요 : \n 0. 콜라 : 1000원\n 1. 사이다 : 1200원\n 2. 커피 : 800원\n");
                    int choice = sc.nextInt();
                    vendingMachine.selectDrink(choice);  // 음료 선택
                    break;
                case 3:
                    vendingMachine.displayMenu();  // 음료 목록 확인
                    break;
                case 4:
                    vendingMachine.checkBalance();  // 잔액 확인
                    break;
                case 5:
                    System.out.println("이용해주셔서 감사합니다.");
                    sc.close();  // Scanner 객체 닫기
                    return;  // 프로그램 종료
                default:
                    System.out.println("올바른 선택을 해주세요.");
            }
        }
    }
}
