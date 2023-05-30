// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //정수 내림차순으로 배치
      /*
        long n = 118372;
        char c;
        String sn=String.format("%d",n);
        long answer = 0;
        for(int i =0; i<sn.length();i++){
            for(int j=i+1; j<sn.length();j++)
                if(sn.charAt(i)<sn.charAt(j)){
                    c=sn.charAt(i);
                    sn=sn.substring(0,i)+sn.charAt(j)+sn.substring(i+1);
                    sn=sn.substring(0,j)+c+sn.substring(j+1);
                }
        }
        answer=Long.parseLong(sn)  ;
        System.out.println(answer);
                             */
        //하샤드 수
      /*  int x= 11;
        int x1 =x;
        int sum=0;
        while (x1>0){
            sum+=x1%10;
            x1=x1/10;
        }
        boolean answer=true;
        if(x%sum==0)
            answer = true;
        else
            answer=false;

         System.out.println(sum);
        System.out.println(answer);

       */
        //두정수 사이의 합
      /*
        int a =3;
        int b= 5 ;

        int s1,s2 ;
        long answer = 0;
        if(a>b)
        {
            s1=b;
            s2=a;
        }
        else
        {
            s1=a;
            s2=b;
        }
        for(int i =s1; i<=s2;i++)
        {
            answer+=i;
        }

        System.out.println(answer);

   */
        //콜라츠 추측
      /*  int num=626331;
        long num1=num;
        int answer =0 ;
        while(num1!=1){
            if(num1%2==0){
               num1=num1/2;
            }else{
                num1=(num1*3)+1;
            }
            answer++;
            if(answer>=500){
                answer = -1;
                break;
            }
        }
        System.out.println(num);
        System.out.println(answer);
       */
        //서울에서 김서방 찾기
      /* String [] seoul =  {"Jane","Kim"};
        int focus= 0    ;

        for(int i=0; i< seoul.length;i++){
            if(seoul[i].equals("Kim")) {
                focus=i;
                break;
            }

        }
        String answer =String.format("김서방은 %d에 있다.",focus);
        System.out.println(answer);
       */
        //나누어 떨어지는 숫자배열
    /*
        int[] arr = {2,36,1,3};
        int divisor=1;
        int [] answer=new int[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]%divisor==0){
               answer= Add(answer,arr[i]);
            }
        }
        if(answer.length!=0){
            Arrays.sort(answer);
        }else answer=Add(answer,-1);


         */
        //핸드폰 번호 가리기
    /*
        String phone_number="01033334444";
        String answer ="";
        String phoneFront =phone_number.substring(phone_number.length()-4);
        String phoneBack= new String();

        for(int i=0; i<phone_number.length()-4;i++){
            phoneBack+='*';
        }
        answer=phoneBack+phoneFront;
        //아래가 최소화 정답
        phone_number.replaceAll(".(?=.{4})", "*");
 */
        //음양 더하기
    /*
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int answer=0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) absolutes[i] = -absolutes[i];
            answer+=absolutes[i];
        }


 */
        //없는수자 더하기
    /*
        int[] numbers={1,2,3,4,6,7,8,0};//5,9가없어서 14  최대 45
        int answer=45;
        for(int i = 0; i<numbers.length;i++){
            answer-=numbers[i];
        }
        System.out.println(answer);


 */
        //제일작은수 제거
        /*
        int [] arr= {9};
        int [] answer ={};
        int min=2147483647;
        int minIdx=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                minIdx=i;
            }
        }
        answer= ArraySub(arr,minIdx);

        if(answer.length==0)
            answer= ArrayAdd(answer,-1);


        for(int i=0; i<answer.length;i++)
            System.out.println(answer[i]);

         */
        //가운데 글자 가져오기
        /*
        String s = "abcde";
        String answer ="";
        if(s.length()%2==0) {
            answer+=s.charAt(s.length()/2-1);
            answer+=s.charAt(s.length()/2);
        }else
            answer+=s.charAt(s.length()/2);
        System.out.println(answer);

         */
        //박수박수박수박
        /*
        int n = 3;
        String[] waterMelon= {"수","박"};
        String answer ="";
        for(int i = 0;i<n;i++){
            answer+=waterMelon[i%2];
        }
        System.out.println(answer);
        //new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);//정답
        */
        //박수박수박수박 최적화
        /*
        int n = 3;
        String[] waterMelon = {"수", "박"};
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            answer.append(waterMelon[i % 2]);
        }

        System.out.println(answer.toString());
        */
        //내적
        /*
        int [] a= {-1,0,1};
        int [] b ={1,0,-1};
        //1 2 3 4
        //-3 -1 0 2
        //-3 + -2 + 0 + 8 = 3

        int answer =0;
        for(int i = 0 ; i <a.length;i++){
           answer+=a[i]*b[i];
        }

        System.out.println(answer);

         */
        //약수의 갯수와 덧셈
        /*
        int left =13;
        int right = 17;

        int answer =0;
        int mCount=0;

        for(int i =left;i<=right;i++){
            mCount=0;
            for(int j= 1;j<=i;j++){
               if(i%j==0) mCount++;
            }
            if(mCount%2==0)
                answer+=i;
            else answer-=i;
        }
        System.out.println(answer);
//

         */
        //문자열 내림차순으로 배치하기
        /*
        String s="Zbcdefg";
        String answer ;
        char[] c= s.toCharArray();
        char compare;
        for(int i =0 ; i<c.length;i++){
            for(int j =i ; j<c.length;j++) {
                if(c[i]<c[j]){
                    compare=c[j];
                    c[j]=c[i];
                    c[i]=compare;
                }
            }
        }
        answer =new String(c);
        // answer = String.valueOf(c);

        System.out.println(answer);


         */
        //부족한 금액 계산하기
        /*
        int price = 3; //가격
        int money= 20; // 고객이 가진동
        int count = 4; //고객이 타고싶은 횟수 횟수대로 price n배 상승


        long answer =0;

        for(int i =1; i<=count;i++ )
            answer+=price*i;
        answer=answer-money>0? answer-money:0;

        System.out.println(answer);

        //저장되는지확인

         */
        //문자열 다루기 기본
        /*
        String s = "a234";
        boolean answer=true;

        try{
            int as = Integer.parseInt(s);
            answer= s.length()==4||s.length()==6 ? true : false;
            System.out.println(answer);
        }catch (Exception ex){
            System.out.println(false);
        }
        int as = Integer.parseInt(s);
        //(s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;


         */


    }



    //배열추가

    public static int[] ArrayAdd(int[] originArray, int val) {
        int[] newArray = new int[originArray.length + 1];
        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        newArray[originArray.length] = val;
        return newArray;
    }

    public static Double[] ArrayAdd(Double[] originArray, Double val) {
        Double[] newArray = new Double[originArray.length + 1];
        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        newArray[originArray.length] = val;
        return newArray;
    }


    public static String[] ArrayAdd(String[] originArray, String val) {
        String[] newArray = new String[originArray.length + 1];
        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        newArray[originArray.length] = val;
        return newArray;
    }

    //배열추가
    //배열제거
    public static int[] ArraySub(int[] originArray, int idx) {

        //만약 제거할 값이 없을경우의 오버프롤우 발생
        try {
            int[] newArray = new int[originArray.length - 1];
            int j = 0;
            for (int i = 0; i < originArray.length; i++) {

                if (i != idx) {
                    newArray[j] = originArray[i];
                    j++;
                }
            }
            return newArray;

        } catch (Exception ex) {
            System.out.println("동일한값없음");
            System.out.println(ex);
            return originArray;
        }

    }

    public static String[] ArraySub(String[] originArray, int idx) {

        //만약 제거할 값이 없을경우의 오류(오버플로우) 발생할수도있음
        try {
            String[] newArray = new String[originArray.length - 1];
            int j = 0;
            for (int i = 0; i < originArray.length; i++) {

                if (i != idx) {
                    newArray[j] = originArray[i];
                    j++;
                }
            }
            return newArray;

        } catch (Exception ex) {
            System.out.println(ex);
            return originArray;
        }

    }

    public static Double[] ArraySub(Double[] originArray, int idx) {

        //만약 제거할 값이 없을경우의 오버프롤우 발생
        try {
            Double[] newArray = new Double[originArray.length - 1];
            int j = 0;
            for (int i = 0; i < originArray.length; i++) {

                if (i != idx) {
                    newArray[j] = originArray[i];
                    j++;
                }
            }
            return newArray;

        } catch (Exception ex) {
            System.out.println("동일한값없음");
            System.out.println(ex);
            return originArray;
        }

    }
    //배열제거
}

