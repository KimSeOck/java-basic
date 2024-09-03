package day2;

public class DoubloLoop {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++)  {
            for (int j=1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println();
        }
//        for (int i= 0; i < 10; i++) {
//            for (int j= 0; j < 10; j++){
//                System.out.println("hi");
//            }
//        }
        int dan = 9;
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "X" + i + "=" + dan * i);
        }
    }
}
