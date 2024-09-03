package day5.vendingMachine;

public class Test {
    private int all;
    private int coke;
    private int cider;
    private int coffee;
    private int ion;
    private int fruit;
    private int energe;
    private int cure;

    public Test() {
        this.all = 0;
        this.coke = 10;
        this.cider = 10;
        this.coffee = 10;
        this.ion = 10;
        this.fruit = 10;
        this.energe = 10;
        this.cure = 10;
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
        System.out.println("음료를 선택해주세요 : \n0.콜라 1000원  수량 : " + coke + "\n1.사이다 1200원  수량 : " + cider + "\n2.커피 800원  수량 : " + coffee +"\n3.이온음료 1600원  수량 : " + ion + "\n4.과일 주스 1800원  수량 : " + fruit + "\n5.에너지 드링크 2000원  수량 : " + energe + "\n6.숙취 해소제 5000원  수량 : " + cure);
    }

    public void selectDrink(int choice) {
        String drink;
        int price;
        int[] quantities = {coke, cider, coffee, ion, fruit, energe, cure}; // 음료 수량을 배열로 관리
        String[] drinkNames = {"콜라", "사이다", "커피", "이온음료", "과일 주스", "에너지 드링크","숙취 해소제"};
        int[] prices = {1000, 1200, 800, 1600, 1800, 2000, 5000};

        if (choice < 0 || choice > 6) {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        drink = drinkNames[choice];
        price = prices[choice];

        if (all >= price) {
            if (quantities[choice] > 0) {
                quantities[choice]--;
                all -= price;
                updateQuantities(drink, quantities);
            } else {
                System.out.println("선택한 음료의 수량이 부족합니다.");
            }
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    private void updateQuantities(String drink, int[] quantities) {
        coke = quantities[0];
        cider = quantities[1];
        coffee = quantities[2];
        ion = quantities[3];
        fruit = quantities[4];
        energe = quantities[5];
        cure = quantities[6];
        System.out.println(drink + "가 선택되었습니다.\n ===남은 수량===\n콜라 수량 : " + coke + "\n사이다 수량 : " + cider + "\n커피 수량 : " + coffee + "\n이온음료 수량 : " + ion + "\n과일 주스 수량 : " + fruit + "\n에너지 드링크 수량 : " + energe + "\n숙취 해소제 수량 : " + cure);
    }

    public void displayMenu(){
        System.out.println("0. 콜라 : 1000원  수량 : " + coke + "\n1. 사이다 : 1200원  수량 : " + cider + "\n2. 커피 : 800원  수량 : " + coffee + "\n3. 이온음료 : 1600원  수량 : " + ion + "\n4. 과일 주스 : 1800원  수량 : " + fruit + "\n5. 에너지 드링크 : 2000원  수량 : " + energe + "\n6. 숙취 해소제 : 5000원  수량 : " + cure);
    }

    public void checkAll(){
        System.out.println("현재 잔액은 " + all + "원입니다.");
    }
}