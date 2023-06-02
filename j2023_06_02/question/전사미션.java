package j2023_06_02.question;

public class 전사미션 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();
        a전사.공격();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 불화살 스킬을 사용합니다. 1.5배의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        a전사.스킬사용();
        System.out.flush();
        // 출력 : 카니가 칼로 15의 데미지를 입힙니다.
        // 출력 : 연속 베기 스킬을 사용합니다. 2배의 피해를 입힙니다.


    }
}


class 전사 {
    String 이름;
    int 나이;
    무기 a무기;
    전사(){
        이름="없음";
        나이 = 0;
    }


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        if(a무기!=null)
            System.out.println(이름+"가"+ a무기.outType()+"로"+
                    a무기.outDamage()+"의 데미지를 입힙니다.");
        else System.out.println(이름+"는"+"무기가없는 닝겐입니다. ");
    }
    void 스킬사용() {
        if(a무기!=null)
        System.out.println(a무기.a스킬.스킬이름+"스킬을 사용합니다."+
                a무기.a스킬.배율*a무기.outDamage()+"피해를 입힙니다.");
        else System.out.println("무기가없는 닝겐입니다. ");
    }

}

class 무기 extends 전사 {

    private String type;
    private int damage;
    스킬 a스킬;

    무기(){
         type="없음";
         damage=0;
    }
    void setWepon(String type, int damage,스킬 a스킬) {
        this.type = type;
        this.damage=damage;
        this.a스킬=a스킬;
    }

    String outType() {
        return type;
    }
    int outDamage() {
        return damage;
    }
}
class 스킬 {
    String 스킬이름="스킬없음" ;
    double 배율=0 ;
    스킬(String 스킬이름, double 배율){
        this.스킬이름=스킬이름;
        this.배율=배율;
    }


}

class 칼 extends 무기 {
 private 스킬 칼스킬=new 스킬("연속 베기",2);
    칼() {
        setWepon("칼",15,칼스킬);


    }

}

class 활 extends 무기 {
    private 스킬 활스킬=new 스킬("불화살",1.5);
    활() {
        setWepon("활",10,활스킬);
    }

}


