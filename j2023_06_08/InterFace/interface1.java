package j2023_06_08.InterFace;

public class interface1 {
    public static void main(String[] args) {
        전사 전사 = new 전사();
        전사.공격();

        사람 a사람 = new 사람();
        요리사 a요리사 =a사람;
        a요리사.조리();

        아버지 a아버지 = a사람;
        a아버지.애들케어();

        
        
    }
    
}

class 전사{
    //무기 무기 = new 무기() ;//추상메서드는 생성자 생성이 불가능
    무기 무기 = new 칼();
    void 공격(){
        무기.사용();
    }

}
//추상클래스 ->추상메서드가 있는 클래스
interface  무기{//추상메서드와 유사하나 void에 추상처리를 할필요가 없다.
     void 사용();
     void 무기정보();
    
     void 수리();
}
class 사람 implements 요리사, 아버지{
    public void 조리(){
        System.out.println("5성급 호텔 요리 실력으로 조리합니다.");
    }
    public void 애들케어(){
        System.out.println("주말마다 아이들에게 5성급 칼부림을 보여줍니다..");
    }

}
interface 요리사{// 인터페이스는 상속을 계속바꾸는것이가능
    void 조리();

}
interface 아버지{
    void 애들케어();
}

//인터페이스는 구현과 형식을 분리한것이 특징
class 칼 implements 무기 {//인터페이스는 implements로 받는다.
   public void 사용(){
        System.out.println("칼로공격");
    }
    public void 무기정보() {
    }
    public void 수리(){

    }
    public void info(){
        System.out.println("칼로공격");
    }
}
class 활 implements 무기 {
    public  void 사용(){
        System.out.println("활로공격");
    }
    public  void 무기정보(){

    }
    public void 수리(){

    }
}

