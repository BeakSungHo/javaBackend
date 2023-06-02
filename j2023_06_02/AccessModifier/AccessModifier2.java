package j2023_06_02.AccessModifier;
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class AccessModifier2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();

        //private에 접근하기위해서 메소드를 이용해서 접근해야한다.
        p1.setId(20);

        //츌력도 마찬가지로 메소드를 통해서 접근해야 가능하다.
        System.out.println(p1.outId());
    }
}
class Person1 {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id=0;//인스턴스 변수 혹은 객체변수라고한다.
    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int id){
        if(id>-1)this.id= id;
        else System.out.println("음수는 들어올수 없소 친구");

    }
    public int outId(){
        return  id;
    }


}
