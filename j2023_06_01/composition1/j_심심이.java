package j2023_06_01.composition1;

public class j_심심이 {
    public static void main(String[] args) {
        //특수 승리
        //봉인 엑조디아 머리
        //봉인 엑조디아 왼팔
        //봉인 엑조디아 오른팔
        //봉인 엑조디아 왼다리
        //봉인 엑조디아 오른다리
        봉인_엑조디아_머리 a= new 봉인_엑조디아_오른다리();
        a.조건();
        a.Print();

    }
}
class 특수승리{
    static int a=0;
    public void 조건(){
        if(a>=10)System.out.println("뜽리");
        else System.out.println("어쩔");
    }
    public void Print(){
        System.out.println(a);
    }
}class 봉인_엑조디아_머리 extends 특수승리{
    봉인_엑조디아_머리(){
        a+=4;
    }

}class 봉인_엑조디아_왼팔 extends 봉인_엑조디아_머리{
    봉인_엑조디아_왼팔(){
        a+=2;
    }
}class 봉인_엑조디아_오른팔 extends 봉인_엑조디아_왼팔{
    봉인_엑조디아_오른팔(){
        a+=1;
    }
}class 봉인_엑조디아_왼다리 extends 봉인_엑조디아_오른팔{
    봉인_엑조디아_왼다리(){
        a+=1;
    }
}class 봉인_엑조디아_오른다리 extends 봉인_엑조디아_왼다리{
    봉인_엑조디아_오른다리(){
        a+=2;
    }
}
