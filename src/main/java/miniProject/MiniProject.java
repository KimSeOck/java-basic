package miniProject;

import java.util.Scanner;
import java.time.LocalDateTime;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] title = new String[10];
        String[] story = new String[10];
        int[] count = new int[10]; // Array to store view counts
        int index = 0;  // This will keep track of the number of posts added

        // Initialize with test data
        title[0] = "안녕하세요 반갑습니다. 자바 공부중이에요.";
        story[0] = "공부중";
        title[1] = "자바 질문좀 할게요~";
        story[1] = "질문좀";
        title[2] = "정처기 따야되나요?";
        story[2] = "따야되나요?";
        index = 3;  // Set index to the number of test posts

        while (true) {
            System.out.println("== 명령어 : | 도움말 : help ==");
            String command = sc.nextLine().trim();

            if (command.equals("help")) {
                System.out.println("add : 게시글 추가");
                System.out.println("list : 게시글 조회");
                System.out.println("detail : 게시글 상세보기");
                System.out.println("delete : 게시글 삭제");
                System.out.println("update : 게시글 수정");
                System.out.println("search : 게시글 검색");
                System.out.println("exit : 종료");
            } else if (command.equals("add")) {
                if (index >= title.length) {
                    System.out.println("게시글을 더 이상 추가할 수 없습니다.");
                    continue;
                }

                System.out.println("제목을 입력해주세요.");
                title[index] = sc.nextLine();
                System.out.println("내용을 입력해주세요.");
                story[index] = sc.nextLine();
                count[index] = 0; // Initialize view count to 0
                index++;
            } else if (command.equals("list")) {
                if (index == 0) {
                    System.out.println("등록된 게시글이 없습니다.");
                } else {
                    for (int i = 0; i < index; i++) {
                        System.out.println("번호: " + i + " 제목: " + title[i]);
                        // Optionally include the content if desired
                        // System.out.println("내용: " + story[i]);
                        System.out.println();
                    }
                }
            } else if (command.equals("detail")) {
                if (index == 0) {
                    System.out.println("등록된 게시글이 없습니다.");
                } else {
                    System.out.println("찾으실 게시글의 번호를 입력 : ");
                    int j = sc.nextInt();
                    sc.nextLine(); // Consume the newline left-over

                    if (j >= 0 && j < index) {
                        // Increment view count
                        count[j]++;

                        System.out.println("번호: " + j);
                        System.out.println("제목: " + title[j]);
                        System.out.println("내용: " + story[j]);
                        System.out.println("조회수: " + count[j]);
                        System.out.println("날짜: " + LocalDateTime.now());
                        System.out.println();
                    } else {
                        System.out.println("유효하지 않은 번호입니다.");
                    }
                }
            } else if (command.equals("delete")) {
                if (index == 0) {
                    System.out.println("삭제할 게시글이 없습니다.");
                    continue;
                }

                System.out.println("삭제할 게시글의 제목을 입력해주세요.");
                String deleteTitle = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < index; i++) {
                    if (title[i].equals(deleteTitle)) {
                        // Found the post to delete
                        for (int j = i; j < index - 1; j++) {
                            title[j] = title[j + 1];
                            story[j] = story[j + 1];
                            count[j] = count[j + 1];
                        }
                        // Clear the last element
                        title[index - 1] = null;
                        story[index - 1] = null;
                        count[index - 1] = 0;
                        index--;
                        found = true;
                        System.out.println("게시글이 삭제되었습니다.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("제목이 일치하는 게시글이 없습니다.");
                }
            } else if (command.equals("update")) {
                if (index == 0) {
                    System.out.println("수정할 게시글이 없습니다.");
                    continue;
                }

                System.out.println("수정할 게시글의 제목을 입력해주세요.");
                String oldTitle = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < index; i++) {
                    if (title[i].equals(oldTitle)) {
                        // Found the post to update
                        System.out.println("새 제목을 입력해주세요.");
                        String newTitle = sc.nextLine();
                        System.out.println("새 내용을 입력해주세요.");
                        String newStory = sc.nextLine();

                        title[i] = newTitle;
                        story[i] = newStory;
                        found = true;
                        System.out.println("게시글이 수정되었습니다.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("제목이 일치하는 게시글이 없습니다.");
                }
            } else if (command.equals("search")) {
                if (index == 0) {
                    System.out.println("찾으실 게시글이 없습니다.");
                } else {
                    for (int i = 0; i < index; i++) {
                        System.out.println("번호: " + i + " 제목: " + title[i]);
                        // Optionally include the content if desired
                        // System.out.println("내용: " + story[i]);
                        System.out.println();
                    }
                }
            }else if (command.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("알 수 없는 명령어입니다. 제대로 된 명령어를 입력해주세요.");
            }
        }
        sc.close();
    }
}