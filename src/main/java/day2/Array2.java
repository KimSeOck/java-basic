package day2;

public class Array2 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 배열의 모든 요소를 세번 출력해주세요.
//        int[] arr2 = {1,2,3,4,5};
//
//        for(int i = 0; i < arr2.length; i++){
//            for (int j = 3; j <= arr2.length; j++){
//                System.out.println(arr2[i]);
//            }
//        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr3 = {10,20,30,40,50};

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
        }

        //숫자 배열 -> 숫자만 저장 가능.
//        int[] arr5 = {1,2,3,4,5};
//
//        String[] arr6 = {"apple", "banana", "orange"};
//        boolean[] arr7 = {true, false, true, false};


    }
}
