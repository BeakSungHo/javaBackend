package j2023_06_05.VariableOverriding;

public class VariableOverriding1 {
    public static void main(String[] args) {
        동물 동물1 = new 강아지("맥스");
        동물 동물2 = new 고양이("아리");
        동물1.이동하다();
        동물2.이동하다();

    }
}

class 동물 {
    String 이름 ="무명";
    동물(){
    }
    동물(String 이름){
        this.이름= 이름;
    }
    void 이동하다(){
        System.out.println(이름+"가 이동하다");
    }
    
}

class  고양이 extends 동물{
    고양이(String 이름){
        super(이름);
    }

}

class 강아지 extends 동물{
    강아지(String 이름){
        super(이름);
    }

}
