package j2023_06_08.Abstract;

public class abstract1 {
    public static void main(String[] args) {


    }

    class 전사{
        //무기 무기 = new 무기() ;//추상메서드는 생성자 생성이 불가능
        무기 무기 = new 칼 ();
        void 공격(){
            무기.사용();



        }

    }

    //추상클래스 ->추상메서드가 있는 클래스
    abstract class 무기{//단하나라도 추상메서드가 있다면 포함되어있는 클래스는 추상클래스가 된다.
        //추상메서드 -> 내용이 없는 메서드 (반드시 오버라이딩 해야됨)
        abstract void 사용();//추상메서드
        abstract void 수리();
    }

    class 칼 extends 무기 {
        void 사용(){
            System.out.println("칼로공격");
        }
        void 수리(){

        }
        void info(){
            System.out.println("칼로공격");
        }
    }
    class 활 extends 무기 {
        void 사용(){
            System.out.println("활로공격");
        }
        void 수리(){

        }
    }


}
