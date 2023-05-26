package j2023_05_25.Condition;

public class Conditionl {
    public static void main(String[] args) {

        //실행이 될 때도 있고 안될 때도 있다. ->if(조건문)
        System.out.println("코드1");
        int a = 2;
       if(a==1) {
            System.out.println("코드2");
            System.out.println("코드3");

        }
        System.out.println("코드4");

        //날씨따른 인사
        // 1.비, 2.맑음, 3. 미세먼지
        int weather =2;
        if(weather==1){
            System.out.println("안녕하세요. 비가오네요. 우산 챙겨 나가세요");
        }
        else if(weather==2){
            System.out.println("안녕하세요. 날씨가 맑군요. 나들이 나가세요");
        }
        else if(weather==3){
            System.out.println("안녕하세요. 오늘은 미세먼지가 심합니다. 마스크 꼭 쓰세요  ");
        }
        //소지금에 따른 야식메뉴
        //소지금이 만원 이상이면 치킨, 만원 미만이면 라면
        int money=18000;
        if (money<10000)
            System.out.println("라면");
        if(money>=10000)
            System.out.println("치킨");
    }
}
