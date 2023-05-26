package j2023_05_26.function;

public class Function_Test2 {
    public static boolean isNegative(int no){
        return no<0 ? true:false;
    }
    public static void main(String[] args) {
        // 0은 양수로 보겠습니다.
        int no = 0;

        if(isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
    }
}
