package j2023_06_05.CibstructorAdvance;
import java.util.Scanner;

public class ConstructorAdvance {
    public static void main(String[] args) {
         //Scanner sc = new Scanner(System.in);
         사람 사람= new 사람 (1,20,"홍길동");
         사람.자기소개();

         사람 a사람 = new 사람(2);
    }
}

class 사람{
    int 번호;
    int 나이;
    String 이름;

    public 사람(int 번호, int 나이, String 이름) {
        this.번호 = 번호;
        this.나이 = 나이;
        this.이름 = 이름;
    }
    //같은 이름으로 메서드나 생성자를 여러개 만드는 것 -> 오버로딩
    public 사람(int 번호) {
        this.번호 = 번호;
        this.나이 = 0;
        this.이름 = "";
    }
    public 사람(String 이름) {
        this.번호 = 0;
        this.나이 = 0;
        this.이름 = 이름;
    }
    public void 자기소개(){
        System.out.println("자기소개띠");
    }




}

class 계산기 {
    int 더하기 (int num1,int num2){
        return num1+num2;
    }
    int 더하기 (int num1,int num2,int num3){
        return num1+num2;
    }
}
