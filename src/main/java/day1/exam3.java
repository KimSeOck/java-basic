package day1;

public class exam3 {
    public static void main(String[] args) {

        if ( true ) {
            System.out.println(10 > 5);
        }

        if ( false ) {
            System.out.println(10 < 5);
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println(a == 10);
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println();
        }

        if ( a > 10 ) {
            System.out.println(a > 10);
        }

        if ( a >= 10 ) {
            System.out.println(a >= 10);
        }

        int b = 10;

        if ( a == b ) {
            System.out.println();
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println();
        }

        if ( c == false ) {
            System.out.println();
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println();
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println();
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println();
        }
    }
}
