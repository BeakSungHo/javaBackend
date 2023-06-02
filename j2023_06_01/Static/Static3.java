package j2023_06_01.Static;

public class Static3 {
    static int num=10;
    public static void main(String[] args) {
        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
    public static void printValue(String a){
        System.out.println(a);
    }
}
