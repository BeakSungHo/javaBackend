package j2023_05_30.input;

import java.io.IOException;
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //숫자입력
        int num= scan.nextInt();
        System.out.println("당신이 입력한숫자는 : "+num);

        //문자 한줄 입력
        String str = scan.nextLine();
        System.out.println("당신이 입력한 문자열은 : "+str);

        //단어 한개 입력
        String str2= scan.next();
        System.out.println("당신이 입력한 단어는: "+str2);

        //단어 두개 입력
        String str3= scan.next();
        String str4= scan.next();
        System.out.println("당신이 입력한 단어 두개는 : "+str3 +" "+str4);


        //문자 입력


    }
}
