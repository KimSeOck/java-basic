package day4.exam6_3;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account cyberBank = new Account();

        while (true){
            System.out.println("== 기능을 선택해주세요 : 1.입금 2.출금 3.잔액 조회 4.계좌이체 5.종료 ==");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.print("넣으실 금액을 입금해주세요 : ");
                    int money = sc.nextInt();
                    cyberBank.insertMoney(money);
                    break;
                case 2:
                    System.out.print("찾으실 금액을 입력해주세요 : ");
                    int amount = sc.nextInt();
                    cyberBank.uninsertMoney(amount);
                    break;
                case 3:
                    cyberBank.checkMoney();
                    break;
                case 4:
                    System.out.print("누구에게 이체하시겠습니까?");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print( name + "님에게 보내실 금액을 입력하여 주세요 : ");
                    int pay = sc.nextInt();
                    cyberBank.leftingMoney(pay);
                    System.out.println(name + "님에게 이체 완료 되었습니다.");
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
