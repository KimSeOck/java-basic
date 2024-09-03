package day1;

public class exam5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        if(num1 > num2) {
            System.out.println((num1) + "-" + (num2) + "는" + (num1 - num2) + "입니다.");
        }
        else if (num1 < num2){
            System.out.println((num2) + "-" + (num1) + "는" + (num2 - num1) + "입니다.");
        }
        else {
            System.out.println("측정불가");
        }

    }
}
