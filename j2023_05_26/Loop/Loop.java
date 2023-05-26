package j2023_05_26.Loop;

public class Loop {
    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int limit = 10;

        for (int i = n; i < m; i++) {
            for (int j = n; j <= limit; j++) {
                //System.out.print(i + "X" + j + "=" + i * j + "\t");
                System.out.printf("|%2d X%2d=%4d |\t",i,j,i*j);
            }
            System.out.println();
        }
    }


}
