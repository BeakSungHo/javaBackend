package j2023_05_31.clazz;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        //정보 3가지 ->나이, 키, 몸무게
        Scanner sc= new Scanner(System.in);

        System.out.println("몇명의 회원정보를 입력하시겠습니까?");
        int manCount= sc.nextInt();
        man[] m = new man[manCount];
        sc.nextLine();
        for(int i = 0; i<manCount;i++){
            System.out.printf("%2d번째 사람의 이름은?",i+1);
            String name=sc.nextLine();
            System.out.printf("%2d번째 사람의 나이",i+1);
            int age=sc.nextInt();
            System.out.printf("%2d번째 사람의 몸무게",i+1);
            double height=sc.nextInt();
            System.out.printf("%2d번째 사람의 키",i+1);
            double weight=sc.nextInt();
            sc.nextLine();
            m[i]=new man(name,age,height,weight);
        }
        ManPrint(m);
    }


    public static void test(){
        System.out.println(20);
        System.out.println(170);
        System.out.println(60);

        //2
        String name= "홍길동";
        int age= 20;
        double height =170;
        double weight = 60;
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        //3
        man a = new man(name,age,height,weight);
        System.out.println();
        man[] b= new man[2];
        b[0]=new man ("홍",40,175.1,78.5);
        b[1]=new man ("김",40,185.2,100);

        ManPrint(a);
        ManPrint(b);
        a.manPrint();
    }
    public static class man{
        public String name;
        public int age;
        public double height;
        public double weight;


        public man(String name,int age ,double height, double weight){
            this.name =name;
            this.age= age;
            this.height= height;
            this.weight= weight;
 //           System.out.println("사람 객체생성\n\n");

        }
        public void manPrint(){
            System.out.printf("이름 : %s \n\t나이 : %d\n\t키 : %.1f\n\t몸무게 : %.1f\n"
                    ,this.name,this.age,this.height,this.weight);
        }

    }
    public static void ManPrint(man m){
        System.out.printf("이름 : %s \n\t나이 : %d\n\t키 : %.1f\n\t몸무게 : %.1f\n",m.name,m.age,m.height,m.weight);
    }
    public static void ManPrint(man[] m){
        for(int i =0; i<m.length;i++)
        System.out.printf("이름 : %s \n\t나이\t: %d\n\t키\t\t: %.1f\n\t몸무게\t: %.1f\n",m[i].name,m[i].age,m[i].height,m[i].weight);
    }
}
