package j2023_06_02.casting;

public class Casting1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}

//
//class 전사 {
//    int 나이 =20;
//    무기 a무기;
//    private String type = "";
//
//    void 공격(){
//        System.out.println(type+"로 공격합니다.");
//    }
//    void setType(String type){
//        this.type=type;
//    }
//}
//class 무기 extends 전사 {
//    무기(){
//        setType("칼");
//    }
//}
//class 칼 extends 무기 {
//    칼(){
//        setType("칼");
//    }
//
//}class 활 extends 무기 {
//    활(){
//        setType("활");
//    }
//
//}

