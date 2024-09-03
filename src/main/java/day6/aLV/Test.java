package day5.aLV;

import java.util.ArrayList;

public class Test {

    private int all; // 현재 잔액
    private ArrayList<Integer> quantities; // 음료 수량
    private ArrayList<String> drinkNames; // 음료 이름
    private ArrayList<Integer> prices; // 음료 가격

    public Test() {
        this.all = 0;
        this.quantities = new ArrayList<>();
        this.drinkNames = new ArrayList<>();
        this.prices = new ArrayList<>();

        // 음료 초기화
        initializeDrinks();
    }

    private void initializeDrinks() {
        // 음료 이름 추가
        drinkNames.add("콜라");
        drinkNames.add("사이다");
        drinkNames.add("커피");
        drinkNames.add("이온음료");
        drinkNames.add("과일 주스");
        drinkNames.add("에너지 드링크");
        drinkNames.add("숙취 해소제");

        // 음료 가격 추가
        prices.add(1000);
        prices.add(1200);
        prices.add(800);
        prices.add(1600);
        prices.add(1800);
        prices.add(2000);
        prices.add(5000);

        // 음료 수량 초기화
        for (int i = 0; i < 7; i++) {
            quantities.add(10); // 모든 음료의 초기 수량을 10으로 설정
        }
    }

    public void insertMoney(int money) {
        if (money > 0) {
            all += money;
            System.out.println("투입된 금액은 " + all + "원입니다.");
        } else {
            System.out.println("올바른 금액을 입력하시오.");
        }
    }

    public void choiceMenu() {
        for (int i = 0; i < drinkNames.size(); i++) {
            System.out.println(i + ". " + drinkNames.get(i) + " " + prices.get(i) + "원  수량 : " + quantities.get(i));
        }
    }

    public void selectDrink(int choice) {
        if (choice < 0 || choice >= drinkNames.size()) {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        String drink = drinkNames.get(choice);
        int price = prices.get(choice);
        int quantity = quantities.get(choice);

        if (all >= price) {
            if (quantity > 0) {
                quantities.set(choice, quantity - 1); // 수량 감소
                all -= price;
                System.out.println(drink + "가 선택되었습니다.");
            } else {
                System.out.println("선택한 음료의 수량이 부족합니다.");
            }
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        displayRemainingQuantities();
    }

    private void displayRemainingQuantities() {
        System.out.println("\n=== 남은 수량 ===");
        for (int i = 0; i < drinkNames.size(); i++) {
            System.out.println(drinkNames.get(i) + " 수량 : " + quantities.get(i));
        }
    }

    public void displayMenu() {
        choiceMenu();
    }

    public void checkAll() {
        System.out.println("현재 잔액은 " + all + "원입니다.");
    }

    public static void main(String[] args) {
        Test vendingMachine = new Test();

    }
}
