package day6.aLV;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        Text ion = new Text();
        ion.drinkNames = "이온음료";
        ion.prices = 1600;
        ion.quantities = 10;

        Text fruit = new Text();
        fruit.drinkNames = "과일 주스";
        fruit.prices = 1800;
        fruit.quantities = 10;

        Text energe = new Text();
        energe.drinkNames = "에너지 드링크";
        energe.prices = 2000;
        energe.quantities = 10;

        Text cure = new Text();
        cure.drinkNames = "숙취 해소제";
        cure.prices = 5000;
        cure.quantities = 10;

        ArrayList<Text> txt = new ArrayList<>();
        txt.add(gold);
        txt.add(coke);
        txt.add(cider);
        txt.add(coffee);
        txt.add(ion);
        txt.add(fruit);
        txt.add(energe);
        txt.add(cure);

        while (true) {
            System.out.println("== 기능을 선택해주세요 : 1.돈 투입 2.음료 선택 3.음료 목록 확인 4.잔액 확인 5.사용 종료 ==");
            String command = sc.nextLine().trim();

            if (command.equals("1")) {
                System.out.print("돈을 투입해주세요 : ");
                int money = sc.nextInt();
                sc.nextLine();

                if (money > 0) {
                    gold.prices += money;
                    System.out.println("투입된 금액은 " + gold.prices + "원입니다.");
                } else {
                    System.out.println("올바른 금액을 입력하시오.");
                }

            } else if (command.equals("2")) {
                System.out.println("구매할 음료를 선택하세요:");
                for (int i = 1; i < txt.size(); i++) {
                    Text drink = txt.get(i);
                    System.out.println(i + ". " + drink);
                }
                int choice = sc.nextInt();
                sc.nextLine();

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
                System.out.println("======= 음료 목록 =======");
                for (int i = 1; i < txt.size(); i++) {
                    Text drink = txt.get(i);
                    System.out.println(drink.drinkNames + "   " + drink.prices + "원  \n수량: " + drink.quantities + "\n=======================");
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