package j2023_06_02.AccessModifier;

public class AccessModifier3 {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.
    }
}
class 무기 {
    private String type = "";
    void 공격(){
        System.out.println(type+"로 공격합니다.");
    }
    void setType(String type){
        this.type=type;
    }
}class 칼 extends 무기{
    칼(){
        setType("칼");
    }

}class 활 extends 무기{
    활(){
        setType("활");
    }

}

