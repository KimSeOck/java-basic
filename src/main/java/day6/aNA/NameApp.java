package day6.aNA;


import java.util.ArrayList;
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<People> people = new ArrayList<>();

        // 이름 짓는 고민 -> 대충 짓고 넘어가면 큰일남.
        // 이름 짓는 고민 -> 많이 해도 괜찮음.
        //변수 -> 명사(저장 값과 관계 있어야함), 메서드(동작) -> 동사

        while (true) {
            System.out.println("명령어 입력 : (add, list, exit)");
            String command = sc.nextLine().trim();

            if (command.equals("add")) {
                System.out.println("이름을 입력해주세요 : ");
                String name = sc.nextLine();

                System.out.println("나이를 입력해주세요 : ");
                int age = Integer.parseInt(sc.nextLine());

                People person = new People(name, age);
                people.add(person);

                System.out.println(name + "이 명부에 저장되었습니다.");

            } else if (command.equals("list")) {
                System.out.println("===== 이름 목록 =====");
                for (int i = 0; i < people.size(); i++) {
                    System.out.println((i + 1) + ". " + people.get(i));
                }
                System.out.println("=====================");

            } else if (command.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;

            } else {
                System.out.println("알 수 없는 명령어입니다. 'add', 'list', 'exit' 중 하나를 입력해주세요.");
            }
        }

        sc.close();
    }
}