package j2023_05_31.local;

public class Local1
{
    public static void main(String[] args) {
        int a= 10;//지역변수

        //지역변수 ->자원 관리, 문제의 범위를 지역으로 국한
        Test();
        System.out.println(a);
    }
    public static void Test(){
        int a= 0;
    }
}
