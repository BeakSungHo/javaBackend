package j2023_06_01.Static;

public class Static1 {
    public static void main(String[] args) {
        //static은 공유 자원을 공유를 위해 사용, 모든객체를 사용

        //캡슐화를 진행
        Person p1= new Person();
        p1.no=1;
        p1.age=25;
        p1.name="홍길동";
        Person p2= new Person();
        p2.no=2;
        p2.age=25;
        p2.name="이순신";
        p1.introduce();
        p2.introduce();
        Person.static_Introduce();  //static메서드를 사용하며 객체생성을 거치지 않고도 실행할수 있다.
        //Person.introduce();  //사용불가능
        Static1 s = new Static1();
        s.Print();

    }
    public void Print(){
        System.out.println("히잉");
    }
}

 class Person {
    //클래스는 생성툴이기때문에 생성하지 않아도 존재함
     //그러므로 static으로 생성하면 클래스에 종속됨으로 객체생성(new)하지 않고도 사용이가능함
    //static int s_no ; //일경우는 객체소유가아닌 클래스 소유이기때문에 객체생성하지않아도 존재함 
    int no;// 정적 메소드가 되면 새롭게 객체를 선언하여도
                    // 나중에 선언된것으로 고정된다.
    int age;
    String name;

    public void introduce() {
        // public static void introduce()일경우 변수참조가 안된다.
        //이유는 순서상의 문제로 클래스가 먼저 생성됨으로 클래스는 static 이 아님으로
        //서로 참조할수가 없다.

        System.out.printf("%d번 %s입니다!!\n",no,name);
    }
     public static void static_Introduce() {
         // public static void introduce()일경우 변수참조가 안된다.
         //이유는 순서상의 문제로 클래스가 먼저 생성됨으로 클래스는 static 이 아님으로
         //서로 참조할수가 없다.(static은 static자원만 사용가능)
         //                     (하지만 non-static은 static 사용가능 )

         System.out.printf("안녕하세요");
     }

}
