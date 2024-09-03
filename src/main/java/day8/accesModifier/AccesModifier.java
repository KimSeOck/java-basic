package day8.accesModifier;

//접근제어자
public class AccesModifier {
    public static void main(String[] args) {

        // 자원(변수 + 메서드)에 접근할 수 있는 권한.
        // public 모두 사용 가능
        // private 자신만 사용 가능

        Calculator c1 = new Calculator();
        c1.divide();
        c1.num2 = 0; // 여기서 0을 넣은 게 문제의 원인. 누구나 접근해서 바꿔버릴 수 있음. private를 이용해 Calculator의 데이터를 볼 수 있다.
        c1.setNum1(20);
        c1.setNum2(5);

        c1.divide(); //

        System.out.println(c1.getNum1());

        // 객체 변수는 객체 내의 모든 메서드에 영향을 주므로 외부의 접근 일반적으로 private로 막는다.
    }
}
