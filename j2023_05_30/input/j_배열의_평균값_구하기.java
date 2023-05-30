package j2023_05_30.input;

public class j_배열의_평균값_구하기 {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9,10};
        double answer = 0;
        for(int i =0;i<number.length;i++)
            answer+=number[i];
        System.out.println(answer/number.length);
    }

}
