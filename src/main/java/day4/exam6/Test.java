package day4.exam6;

public class Test {

    private int balance = 0;

    public void pay(int amount){
        if (amount > 0) { // 예금 금액이 0보다 커야 함
            balance += amount;
            System.out.println(amount + "원을 예금했습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }
    }

    public void drink(){
        System.out.println();
    }

}
