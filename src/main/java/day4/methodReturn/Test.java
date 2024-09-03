package day4.methodReturn;

public class Test {

    public double plus(double num1, double num2, double num3){
        //System.out.println(num1 + num2 + num3);
        return num1 * num2 * num3; // 메서드가 리턴(돌아갈) 때 10이라는 값을 가지고 돌아감.
    }

    public double circleArea(int radius){
        return radius * radius * 3.14;
    }

}
