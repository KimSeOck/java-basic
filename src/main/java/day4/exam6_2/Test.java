package day4.exam6_2;


public class Test {
    private int all;
    private int coke;
    private int cider;
    private int coffee;

    public Test() {
        this.all = 0;
        this.coke = 10;
        this.cider = 10;
        this.coffee = 10;
    }

    public void insertMoney(int money){
        if(money > 0){
            all += money;
            System.out.println("투입된 금액은 " + all + "원입니다.");
        } else {
            System.out.println("올바른 금액을 입력하시오.");
        }
    }

    public void choiceMenu(){
        System.out.println("음료를 선택해주세요 : \n0.콜라 1000원  수량 : " + coke + "\n1.사이다 1200원  수량 : " + cider + "\n2.커피 800원  수량 : " + coffee);
    }

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

        // 선택된 음료에 대한 수량을 확인하고 잔액을 차감하는 로직
        if (all >= price) {
            if (drink.equals("콜라") && coke > 0) {
                coke--;
                all -= price;
                System.out.println(drink + "가 선택되었습니다.\n ===남은 수량===\n콜라 수량 : " + coke + "\n사이다 수량 : " + cider + "\n커피 수량 : " + coffee);
            } else if (drink.equals("사이다") && cider > 0) {
                cider--;
                all -= price;
                System.out.println(drink + "가 선택되었습니다.\n ===남은 수량===\n콜라 수량 : " + coke + "\n사이다 수량 : " + cider + "\n커피 수량 : " + coffee);
            } else if (drink.equals("커피") && coffee > 0) {
                coffee--;
                all -= price;
                System.out.println(drink + "가 선택되었습니다.\n ===남은 수량===\n콜라 수량 : " + coke + "\n사이다 수량 : " + cider + "\n커피 수량 : " + coffee);
            } else {
                System.out.println("선택한 음료의 수량이 부족합니다.");
            }
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void displayMenu(){
        System.out.println(" 0. 콜라 : 1000원  수량 : " + coke + "\n1. 사이다 : 1200원  수량 : " + cider + "\n2. 커피 : 800원  수량 : " + coffee);
    }

    public void checkAll(){
        System.out.println("현재 잔액은 " + all + "원입니다.");
    }

}
