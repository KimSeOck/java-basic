package day3;


import java.util.Scanner;

//명명 규칙
//클래스 명은 대문자 시작
//의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때
//카멜 표기법
//함수나 변수는 소문자 시작
public class NameApp {
    public static void main(String[] args) {
        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // 2. tomas
        // 3. chris
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.
        Scanner sc = new Scanner(System.in);
        //String name = "";
        String[] names = new String[5];
        int index = 0;

        String[] number = new String[5];
        int num = 0;

        while(true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("help")) {
                System.out.println("add : 이름 추가");
                System.out.println("year : 나이 추가");
                System.out.println("list : 이름 목록 확인");
                System.out.println("exit : 종료");
            } else if (command.equals("add")) {
                System.out.println("이름을 입력해주세요 : ");
                names[index] = sc.nextLine();
                System.out.println(names[index] + "이 명부에 저장 되었습니다.");
                index++;
            } else if (command.equals("year")) {
                System.out.println("나이를 입력해주세요 : ");
                number[num] = sc.nextLine();
                System.out.println(number[num] + "이 명부에 저장 되었습니다.");
                num++;
            } else if (command.equals("list")) {
                for (int i = 0; i < names.length; i++){
                    for (int j = 0; j < number.length; j++){
                        System.out.println(names[i] + " " + number[j]);
                    }
                }
            } else if (command.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
    }
 }
