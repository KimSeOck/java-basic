package day5.arrayListExam;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 생성

        // 배열
        int[] arr = new int[5]; // 길이 5인 숫자 배열 생성

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // ====================================================

        // 추가
        // 배열 -> 추가 X
        // ArrayList -> 추가
        list.add(1); // 0번 방에 추가
        list.add(2); // 1번 방에 추가

        // ====================================================
        // 조회
        System.out.println(arr[0]); // arr 배열의 0번방 조회
        System.out.println(arr[1]); // arr 배열의 1번방 조회
        //System.out.println(arr[2]); // arr 배열의 2번방 조회

        // ArrayList
        System.out.println(list.get(0)); // ArrayList 배열의 0번방 조회
        System.out.println(list.get(1)); // ArrayList 배열의 1번방 조회
        //System.out.println(list.get(2)); // ArrayList 배열의 2번방 조회

        // ====================================================
        // 수정

        arr[0] = 10; // arr 배열의 0번 방의 값을 10으로 수정.

        // ArrayList
        list.set(0,10); // list 배열의 0번 방의 값을 10으로 수정.
        System.out.println(list.get(0));

        // ====================================================
        // 삭제
        // 배열 -> 삭제X
        // ArrayList
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(0); // 0번 방의 값을 삭제.

        System.out.println(list.get(0));
//        System.out.println(list.get(1)); //삭제로 인해 1번 방이 존재하지 않기 때문에 에러남.


        // ===================================================
        // 데이터의 개수 확인
        // 배열 => length를 제공하기는 하지만 데이터의 개수랑 무관. 따로 내가 변수에 직접 보관해야 함.

        // ArrayList
        System.out.println(list.size()); // 1
        list.add(2);
        list.add(3);
        System.out.println(list.size()); // 3

        // 배열보다 ArrayList가 사용성이 훨씬 편하므로 ArrayList를 주로 사용하고
        // 성능이 중요한 부분에서는 배열을 사용한다.

    }
}
