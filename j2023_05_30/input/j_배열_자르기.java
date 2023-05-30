package j2023_05_30.input;

public class j_배열_자르기 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,8,9,4,2,5};
        int num1=2;
        int num2= 4;

        int[] answer= new int[num2-num1+1];
        for(int i = num1 ; i<=num2;i++)
            answer[i-num1]=numbers[i];

        ArrayPrint(answer);
    }

    //출력관련 함수
    public static void ArrayPrint(int [][] Array){
        for(int i = 0;i<Array.length;i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print("{"+i+"]"+" {"+j+"] : "
                        +Array[i][j]+" |\t");
            }
            System.out.println();
        }
    }
    public static void ArrayPrint(int [] Array){
        for(int i = 0;i<Array.length;i++) {
            System.out.println("{"+i+"] "+Array[i]);
        }
    }    public static void ArrayPrint(long [] Array){
        for(int i = 0;i<Array.length;i++) {
            System.out.println("{"+i+"] "+Array[i]);
        }
    }
    public static void ArrayPrint(String [][] Array){
        for(int i = 0;i<Array.length;i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print("{"+i+"]"+" {"+j+"] : \""
                        +Array[i][j]+"\" |\t");
            }
            System.out.println();
        }
    }
    public static void ArrayPrint(String [] Array){
        for(int i = 0;i<Array.length;i++) {
            System.out.println("{"+i+"] \""+Array[i]+"\"");
        }
    }
    //출력관련 함수
}


