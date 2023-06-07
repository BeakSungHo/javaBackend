package 시험;

public class Exam1 {
    public static void main(String[] args) {

        //문제1
        int num1=15;
        int num2= 4;
        System.out.printf("num1을 num2로 나눈 몫은 %f입니다.\n",(float)num1/num2);

        //문제2
        int a1= 10;
        int a2 = a1;
        System.out.printf("a2는 a1과 같은 값 %d입니다.\n",a2);



        //문제3
        for(int num =1; num<=5;num++)
            System.out.println(num);

        //문제4
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1+", "+str2);

        //문제5
        float[] arr= new float[10];
        System.out.println(arr.length);

        //문제 6
        Dog dog1= new Dog(5, "Max");
        System.out.printf("%d살 강아지 %s\n",dog1.age,dog1.name);

        //문제 7
        Dog.classInfo();

        //문제 8
        dog1.bark();

    }
}
class Dog {
    public int age=0;
    public String name="";

    //문제 9
    Dog(int age, String name){
        this.age=age;
        this.name=name;
    }
    //문제 10
    static void classInfo(){
        System.out.printf("이름과 나이를 이용해 Dog를 만드는 Dog class입니다.\n");
    }
    void bark(){
        System.out.printf("%s가 멍멍 하고 짖습니다.\n",this.name);
    }
}
