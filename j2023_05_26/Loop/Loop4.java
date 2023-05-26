package j2023_05_26.Loop;

public class Loop4 {
    public static void main(String[] args) {
        for(int i = 1 ;i <10;i++){
            for(int j= 1; j<10;j++){
                System.out.print(i+"X"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

        int age =21;
        String name= "김길동";
        System.out.println(age+"살 "+name+"입니다.");
        String all =String.format("%d살 %s 입니다",age,name);

        System.out.println(all);
    }
}
