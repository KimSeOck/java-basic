package day4.exam6_2;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Test vendingMachine = new Test();

        while (true){
            System.out.println("== 기능을 선택해주세요 : 1.돈 투입 2.음료 선택 3.음료 목록 확인 4.잔액 확인 5.사용 종료 ==");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.print("돈을 투입해주세요 : ");
                    int money = sc.nextInt();
                    vendingMachine.insertMoney(money);
                    break;
                case 2:
                    vendingMachine.choiceMenu();
                    int choice = sc.nextInt();
                    vendingMachine.selectDrink(choice);
                    break;
                case 3:
                    vendingMachine.displayMenu();
                    break;
                case 4:
                    vendingMachine.checkAll();
                    break;
                case 5:
                    System.out.println("이용해주셔서 감사합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("올바른 선택을 해주세요.");
            }
        }

    }
}
