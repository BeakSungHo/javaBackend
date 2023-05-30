package j2023_05_30.input;

import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name= sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age=sc.nextInt();
        CustomerPrint(name,age);
    }

    public static void CustomerPrint(String name,int age){
        System.out.printf("안녕하세요 %d세 %s 입니다.",age,name);
    }
}
