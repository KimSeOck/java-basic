package day5.aLV;


import java.util.ArrayList;
import java.util.Scanner;



public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 음료 초기화
        Text gold = new Text();
        gold.drinkNames = "잔액";
        gold.prices = 0;
        gold.quantities = 0;

        Text coke = new Text();
        coke.drinkNames = "콜라";
        coke.prices = 1000;
        coke.quantities = 10;

        Text cider = new Text();
        cider.drinkNames = "사이다";
        cider.prices = 1200;
        cider.quantities = 10;

        Text coffee = new Text();
        coffee.drinkNames = "커피";
        coffee.prices = 800;
        coffee.quantities = 10;

        ArrayList<Text> txt = new ArrayList<>();
        txt.add(gold);
        txt.add(coke);
        txt.add(cider);
        txt.add(coffee);

        while (true) {
            System.out.println("== 기능을 선택해주세요 : 1.돈 투입 2.음료 선택 3.음료 목록 확인 4.잔액 확인 5.사용 종료 ==");
            String command = sc.nextLine().trim();

            if (command.equals("1")) {
                System.out.println("돈을 투입해주세요 : ");
                int money = sc.nextInt();
                sc.nextLine();  // 개행 문자 소비

                if (money > 0) {
                    gold.prices += money;
                    System.out.println("투입된 금액은 " + gold.prices + "원입니다.");
                } else {
                    System.out.println("올바른 금액을 입력하시오.");
                }

            } else if (command.equals("2")) {
                System.out.println("구매할 음료를 선택하세요:");
                for (int i = 1; i < txt.size(); i++) {  // gold (인덱스 0)는 생략
                    Text drink = txt.get(i);
                    System.out.println(i + ". " + drink);
                }
                int choice = sc.nextInt();
                sc.nextLine();  // 개행 문자 소비

                if (choice > 0 && choice < txt.size()) {
                    Text selectedDrink = txt.get(choice);
                    if (gold.prices >= selectedDrink.prices && selectedDrink.quantities > 0) {
                        gold.prices -= selectedDrink.prices;
                        selectedDrink.quantities--;
                        System.out.println(selectedDrink.drinkNames + "을(를) 구입하였습니다. 남은 잔액: " + gold.prices + "원");
                    } else if (selectedDrink.quantities == 0) {
                        System.out.println("해당 음료는 품절입니다.");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            } else if (command.equals("3")) {
                System.out.println("=== 음료 목록 ===");
                for (int i = 1; i < txt.size(); i++) {  // gold (인덱스 0)는 생략
                    Text drink = txt.get(i);
                    System.out.println(drink.drinkNames + " - " + drink.prices + "원  수량: " + drink.quantities);
                }

            } else if (command.equals("4")) {
                System.out.println("현재 잔액: " + gold.prices + "원");

            } else if (command.equals("5")) {
                System.out.println("프로그램이 종료됩니다.");
                break;

            } else {
                System.out.println("알 수 없는 명령어입니다. '1', '2', '3', '4', '5' 중 하나를 입력해주세요.");
            }
        }
        sc.close();
    }
}

