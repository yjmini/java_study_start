package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int subject = 3;

        System.out.print("학생수를 입력하세요:");
        student = scanner.nextInt();

        int[][] scores = new int[student][subject];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subject; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < student; i++) {
            int total = 0;
            for (int j = 0; j < subject; j++) {
                total += scores[i][j];

            }
            double average = (double) total / subject;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
