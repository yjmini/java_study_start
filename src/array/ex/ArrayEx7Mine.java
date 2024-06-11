package array.ex;

import java.util.Scanner;

public class ArrayEx7Mine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 4;
        int subject = 3;
        int[][] scores = new int[student][subject];
        int total = 0;
        double average = 0;

        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            scores[i][0] = scanner.nextInt();
            System.out.print("수학 점수:");
            scores[i][1] = scanner.nextInt();
            System.out.print("영어 점수:");
            scores[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < student; i++) {
            for (int j = 0; j < subject; j++) {
                total += scores[i][j];
                average = (double) total / scores[j].length;
            }
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
            total = 0;
            average = 0;
        }
    }
}
