package j2023_06_07.제너릭;
// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

// 힌트 : 제너릭
public class Test2 {
    public static void main(String[] args) {
        J_저장소 a저장소1 = new J_저장소();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        J_저장소 a저장소2 = new J_저장소();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b+"뀨");


        J_저장소 a저장소3 = new J_저장소();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class J_저장소 {
    Object data;

    <T> T getData() {
        return (T)data;
    }

    <T>void setData(T inputedData) {
        this.data = inputedData;
    }
}

class 사과 {
}
