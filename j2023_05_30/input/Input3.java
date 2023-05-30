package j2023_05_30.input;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for(int i =1; i<10;i++)
            System.out.println(a+"X"+i+"="+(a*i));
    }
}
