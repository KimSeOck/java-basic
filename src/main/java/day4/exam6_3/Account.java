package day4.exam6_3;

public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public void insertMoney(int money){
        if(money > 0){
            balance += money;
            System.out.println("입금된 금액은 " + balance + "원입니다.");
        } else {
            System.out.println("올바른 금액을 입력하시오.");
        }
    }

    public void uninsertMoney(int amount){
        if(amount > 0){
            balance -= amount;
            System.out.println("출금된 금액은 " + amount + "원입니다.");
            System.out.println("현재 잔액은 " + balance + "원입니다.");
        } else {
            System.out.println("올바른 금액을 입력하시오.");
        }
    }

    public void checkMoney(){
        System.out.println("현재 잔액은 " + balance + "원입니다.");
    }

    public void leftingMoney(int pay){
        if(pay > 0){
            balance -= pay;
            System.out.println("보내실 금액은 " + pay + "원입니다.");
            System.out.println("현재 잔액은 " + balance + "원입니다.");
        }
    }


}
