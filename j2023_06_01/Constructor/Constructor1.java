package j2023_06_01.Constructor;

public class Constructor1 {
    public static void main(String[] args) {
        //객체를 만들면 반드시 데이터를 넣어줘야(초기화) 한다.
        //초기화를 하지않으면 사용할수 없다.
        int a=10 ;//선언과 초기화 동시에
        a=14; //초기화
        Person p1= new Person(1,"앙기모",31);//선언과 초기화 동시에
        Person p2;      //선언만
        p1.Print();
    }
}
class Person{
    int no;
    String name;
    int age;
    Person(int no,String name, int age){
        this.no=no;
        this.name=name;
        this.age=age;
    }
    void Print(){
        System.out.printf("번호 : %d \t이름 : %s\t나이 : %d",no,name,age);
    }

}
