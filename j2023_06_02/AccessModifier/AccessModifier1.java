package j2023_06_02.AccessModifier;

public class AccessModifier1 {
    public static void main(String[] args) {


    }
}
    class Test2{
        int num =10;//기본값은 default 상태 패키지내부에서는 사용가능하지만 패키지 외부에서 사용가능
        public int num1 =10;// public은 프로젝트내의 모든 범위에서 사용가능
        private int num2 =10;//클래스 내부에서 사용이가능

        void print(){
            System.out.println(num2);
        }
    }
