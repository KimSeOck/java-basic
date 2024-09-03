package day2;

public class Triangle1 {
    public static void main(String[] args) {
//        for (int height = 0; height < 5; height++){
//            for(int width = 0; width < 8; width++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        int height = 7;
        for (int i = 0; i < height; i++) {
            // 각 줄마다 별의 개수를 i + 1개로 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
