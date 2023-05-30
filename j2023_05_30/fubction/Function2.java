package j2023_05_30.fubction;

public class Function2 {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50,60,70,80,90,100};
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        ArrayPrint(arr);

    }
    public static void ArrayPrint(int [] Array){
        for(int i = 0;i<Array.length;i++) {
            System.out.println("{"+i+"] "+Array[i]);
        }
    }
}
