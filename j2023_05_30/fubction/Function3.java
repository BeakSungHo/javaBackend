package j2023_05_30.fubction;

public class Function3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayPrint(arr);
        ArrayPrint(arr);
    }
    public static void ArrayPrint(int [] Array){
        for(int i = 0;i<Array.length;i++) {
            System.out.println("{"+i+"] "+Array[i]);
        }
    }
}
