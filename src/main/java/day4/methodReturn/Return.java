package day4.methodReturn;


// 메서드는 값을 표현할 수도 있고 아닐 수도 있다.
public class Return {
    public static void main(String[] args) {

        // 메서드는 값이 리턴할 수 있는데 리턴값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차 작업할 수 있기 때문
        Test t1 = new Test();
        Test t2 = new Test();
//
//        // 10, 20 더한 값에서 2로 나누고 싶다.
        double num = t1.plus(2.5,2.5,3.14);
        double num2 = t2.plus(5.0,5.0,3.14);
//        // 10, 20 더한 값에서 2로 곱하고 싶다.
//
//        System.out.println(num / 2);
//
//        System.out.println(num * 2);
//
        // 문제. Test에 원의 넓이 구하는 메서드 만들기
        // 원의 넓이 : 반지름 * 반지름 * 3.14

        //반지름이 5인 원의 넓이 :
        double result = t1.circleArea(5);
        System.out.println(result);
        //반지름이 10인 원의 넓이 :
        double result2 = t1.circleArea(10);
        System.out.println(result2);
        //반지름이 5인 원의 넓이를 3으로 나눈 값 :
        t1.circleArea(5);
        System.out.println(result / 3);
        //반지름이 10인 원의 넓이를 2배로 증가 시킨 값 :
        t1.circleArea(10);
        System.out.println(result2 * 2);
    }
}
