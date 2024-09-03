package day4.exam6_1;

public class Test {
    private int balance;

    public Test() {
        this.balance = 0;
    }

    // 돈을 투입하는 메서드
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("현재 투입된 금액은 : " + balance + "원입니다.");
        } else {
            System.out.println("올바른 금액을 입력해주세요.");
        }
    }

    // 음료를 선택하는 메서드
    public void selectDrink(int choice) {
        int price = 0;
        String drink = "";

        switch (choice) {
            case 0:
                price = 1000;
                drink = "콜라";
                break;
            case 1:
                price = 1200;
                drink = "사이다";
                break;
            case 2:
                price = 800;
                drink = "커피";
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        if (balance >= price) {
            balance -= price;
            System.out.println(drink + "가 선택되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 음료 목록을 출력하는 메서드
    public void displayMenu() {
        System.out.println(" 0. 콜라 : 1000원\n 1. 사이다 : 1200원\n 2. 커피 : 800원");
    }

    // 현재 잔액을 확인하는 메서드
    public void checkBalance() {
        System.out.println("현재 잔액은 " + balance + "원입니다.");
    }
}
