package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int total = 0;



        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
