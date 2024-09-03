package day4.exam5;

public class Account {

    private int balance = 0;

    public void deposit(int amount) {
        if (amount > 0) { // 예금 금액이 0보다 커야 함
            balance += amount;
            System.out.println(amount + "원을 예금했습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }
    }

    // 인출 메서드
    public int withdraw(int amount) {
        if (amount > 0 && amount <= balance) { // 인출 금액이 0보다 크고, 잔액이 충분해야 함
            balance -= amount;
            return amount;
        } else {
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
            return 0;
        }
    }

    // 잔액 조회 메서드
    public int getRemainder() {
        return balance;
    }

}
