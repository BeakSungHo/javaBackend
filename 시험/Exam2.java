package 시험;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("높이를 입력해주세요 : ");
        triangle(sc.nextInt());
    }

    public static void triangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
