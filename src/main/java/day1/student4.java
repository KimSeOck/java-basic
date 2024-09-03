package day1;

public class student4 {
    public static void main(String[] args) {
        int a = 3;  // 예시로 a와 b에 값을 할당
        int b = 8;

        // 두 수가 주어졌을 때, a가 b보다 클 수 있으므로 항상 작은 값부터 큰 값까지 출력하도록 정렬
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // 오름차순 출력
        System.out.println("오름차순으로 나열:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // 줄바꿈

        // 내림차순 출력
        System.out.println("내림차순으로 나열:");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // 줄바꿈
    }
}

// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
// ex )
// 오름차순 :  1, 2, 3, 4, 5
// 내림차순 :  5, 4, 3, 2, 1