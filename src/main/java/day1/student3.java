package day1;

public class student3 {
    public static void main(String[] args) {
        int time = 74;  // 현재 경기 시간
        int score = 0;  // 현재 A팀의 득점

        // 손흥민이 투입되는 시간
        int substitutionTime = 74;

        // 손흥민이 투입된 후 남은 시간
        int remainingTime = 90 - substitutionTime;

        // 손흥민이 골을 넣는 횟수
        int goals = 0;

        // 손흥민이 투입 시점에 바로 골을 넣는 경우
        if (substitutionTime < 90) {
            // 투입 후 첫 골 (75분)
            goals++;

            // 75분 이후 5분마다 골을 넣는 경우
            for (int i = substitutionTime + 5; i < 90; i += 5) {
                goals++;
            }
        }

        // A팀의 최종 득점
        int finalScore = score + goals;

        System.out.println(finalScore);
    }
}
