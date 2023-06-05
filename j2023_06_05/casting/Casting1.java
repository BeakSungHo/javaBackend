package j2023_06_05.casting;

public class Casting1 {
    public static void main(String[] args) {
        //new Animal();//애니멀 생성자 호출
                        //도그생성자를 만들기위해서 부모가 먼저 필요함으로
                        //도그생성자를 만들면 애니멀도 같이 만들어진다.
                        //순서는 애니멀이 먼저 
        new Dog(10);//애니멀 생성자와 도그생성자 호출
    }
}
class Animal{
    Animal(){
        super();
        System.out.println("애니멀 생성자 호출");
    }

}
class Mammalia extends Animal {
    Mammalia(int a){
        super();
        System.out.println(a+" Mammalia 생성자 실행");
    }
    Mammalia(){ //super를 배정하지않고 사용할때 사용
        super();
    }
}
class Dog extends Mammalia{
    Dog(int a){
        //super();//부모를 언급할 때는 클래스이름으로 언급 x
          //부모를 언급하는 키워드 super
          //super에 매개변수가 없는것은 코드가 안보일뿐이지 이미
          // 생성되어있는 코드이다.
        //하지만 부모에서 생성자에 매개변수가 필요할경우 위코드는 에러발생
        super(a);
        System.out.println("개 생성자 호출");
    }
}
