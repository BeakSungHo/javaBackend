// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    //sun bud car
    public static void main(String[] args) {
        //ArrayList<integer>사용해서 중복제거후 제기입?

        int [] numbers ={2,1,3,4,1};
        //경우수는 5*4=20
        //

        int [] answer ={};
      
      
      
      
      
    }


    class CustomArray{
        //이진수 맵때문에 사용한 함수
        public static int[] decimal_Binary(int originNum, int decimalSize){
            int[] newBinary = new int [decimalSize];
            int i = decimalSize-1;
            while (true){
                if(originNum%2==1||(originNum/2==0&&originNum!=0)){
                    newBinary[i]=1;
                }
                originNum=originNum/2;
                if(originNum<=0||i==0)break;
                i--;
            }
            return newBinary;
        }
        public static void arrMapPrint(int [][] map){
            for(int i=0;i<map.length;i++){
                for(int j =0; j<map.length;j++){
                    System.out.print(map[i][j]+"\t");
                }
                System.out.println();
            }
        }
        //이진수 맵때문에 사용한 함수

        //큐에 저장된 데이터배열 배열로 조립 하는용도의 함수
        public static int[] Q_Array(Queue<Integer> qu) {
            // Queue<Integer> qu = new LinkedList<>();
            // qu.offer(arr[i]);
            int[] newArr = new int[qu.size()];
            for (int i = 0; i < newArr.length; i++)
                newArr[i] = qu.poll();
            //ArrayPrint(newArr);
            return newArr;
        }

        //출력관련 함수
        public static void ArrayPrint(int[][] Array) {
            for (int i = 0; i < Array.length; i++) {
                for (int j = 0; j < Array[i].length; j++) {
                    System.out.print("{" + i + "]" + " {" + j + "] : "
                            + Array[i][j] + " |\t");
                }
                System.out.println();
            }
        }
        public static void ArrayPrint(int[] Array) {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("{" + i + "] " + Array[i]);
            }
        }
        public static void ArrayPrint(long[] Array) {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("{" + i + "] " + Array[i]);
            }
        }
        public static void ArrayPrint(char[] Array) {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("{" + i + "] " + Array[i]);
            }
        }
        public static void ArrayPrint(char[][] Array) {
            for (int i = 0; i < Array.length; i++) {
                for (int j = 0; j < Array[i].length; j++) {
                    System.out.print("{" + i + "]" + " {" + j + "] : "
                            + Array[i][j] + " |\t");
                }
                System.out.println();
            }
        }
        public static void ArrayPrint(String[][] Array) {
            for (int i = 0; i < Array.length; i++) {
                for (int j = 0; j < Array[i].length; j++) {
                    System.out.print("{" + i + "]" + " {" + j + "] : \""
                            + Array[i][j] + "\" |\t");
                }
                System.out.println();
            }
        }
        public static void ArrayPrint(String[] Array) {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("{" + i + "] \"" + Array[i] + "\"");
            }
        }
        //출력관련 함수


        //배열추가
        public static int[] ArrayAdd(int[] originArray, int val) {
            int[] newArray = Arrays.copyOf(originArray, originArray.length + 1);
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

    //처리완료된 코드들 모음 dummy함수임
    public static void Test() {

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

        // 다음이 모번 답안
        //(s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;


         */
        //행렬의 덧셈
        /*
        int[][] arr1={{1,4},{2,3}};
        int[][] arr2={{3,4},{5,6}};
        int[][] answer=new int[arr1.length][arr1[0].length];
        for(int i = 0;i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

         */
        //직사각형 별찍기
        /*
        Scanner sc = new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        for(int i = 0; i<b ;i++) {
            for (int j = 0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        //최소공배수와 최대공약수
        /*
        int n =45 ;
        int m =10;
        long cm =m;
        //최대 공약수와 최소 공배수
        long[] answer =new long [2];
        //최대 공약수 구하는공식
        for(int i=n;i>0;--i){
            if(m%i==0&&n%i==0){
                answer[0]=i;
                break;
            }
        }

        //최소 공배수 구하는 공식
        answer[1]=n*m/answer[0];
        ArrayPrint(answer);
        System.out.println(n*m);
 */
        //같은 숫자는 싫음ㅇㅅㅇ (큐사용해서 작성)
        /*
        int [] arr = {1,1,3,1,3,3,0,1,1,1000000 };
        //[1,3,0,1] 가나와야함  중복되는 수가 나오면 배열추가
        // [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1]
        // [4, 4, 4, 3, 3] 이면 [4, 3]
        Queue<Integer> qu = new LinkedList<>();
        int c= -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==c)
                continue;
            qu.offer(arr[i]);
            c=arr[i];
        }
        int[] answer=new int [qu.size()] ;
        for(int i = 0;i<answer.length;i++)
            answer[i]=qu.poll();



        ArrayPrint(answer);


         */
        //3진법 뒤집기
        /*
        int n =125;
        int answer= 0;
        int cb=0;
        int  tb;//3진수 뜨리베이스약자

        String t="";
        int count =0;
        while(true) {
            if(n % 3 == 0) {
                t += "0";
                n = n / 3;
            } else {
                t += String.format("%d",n%3);
                n = n / 3;
            }
            if(n==0){
                break;
            }

        }
        System.out.println(t);
        char[] c = t.toCharArray();
        for(int i =c.length-1; i>=0;i--){
            cb=1;
            if(count==0)
                answer+=Integer.parseInt(String.format("%c",c[i]));
            else{
                for(int j=0;j<count;j++)
                    cb*=3;
                answer+=Integer.parseInt(String.format("%c",c[i]))*cb   ;
            }
            count++;

        }

        System.out.println(Arrays.toString(c));
        System.out.println(answer);


//
//        String sn=String.valueOf(n);
//        System.out.println(sn);

 */
        //이상한 문자 만들기(중요 부분 람다식,스코프 연산,메서드참조 연산자(::) )
        /*

        //뒤에 공백이 제거되는것이 문제엿음;;
        String s = "try hello world";
        String answer = "";
        String [] splitAnswer = s.split(" ");
        //공백갯수를 구하는 코드
        int spaceCount=0;
        for(int i =0; i<splitAnswer.length;i++){
            spaceCount+=splitAnswer[i].length();
        }
        spaceCount=s.length()-(spaceCount+splitAnswer.length)+1;

//아래는 공백이 제거할경우의 연산들(람다)
//       String[] splitAnswer;
//       splitAnswer= Arrays.stream((s.split(" ")))
//               .filter(f->!f.isEmpty()).toArray(String[]::new);
        //간략 설명 f= !f.isEmpty()즉 비어있지않을때 Array형식으로 변환하여 String 배열을 생성하여 집어넣는다.
                //collect(Collections.toLisst) List일경우
                //      String배열일경우 객체제생성 필요
        //공백이 두번들어간것에대해서 상정하지않음 그래서 위필필터를 사용하여 제거시도
        //람다식 사용예제
        char[] c;
        for(int i =0; i<splitAnswer.length;i++){
            c = splitAnswer[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(j%2==0){
                    if(c[j]>=97){
                        c[j]=(char)(c[j]-32);
                    }
                }else{
                    if(c[j]<97){
                        c[j]=(char)(c[j]+32);
                    }

                }

            }

            answer+=String.valueOf(c);
            if(i+1!=splitAnswer.length)answer+=" ";
        }
        for(int i =0;i<spaceCount;i++){
            answer+=" ";
        }
        System.out.print(answer);
        //System.out.printf("%d",(int)'A');//a=97  A=65 --32
        //람다식(->) 과 참조연산자(::)사용법 대략
        /*
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
         // 람다식을 사용한 방법
        names.forEach(name -> System.out.println(name));
        // 메서드 참조를 사용한 방법
        names.forEach(System.out::println);

        String[] namesArray = {"Alice", "Bob", "Charlie"};
        // 람다식을 사용한 방법
        String a[];
        Arrays.stream(namesArray)
                .forEach(name -> System.out.println(name));
        // 메서드 참조를 사용한 방법
        Arrays.stream(namesArray)
                .forEach(System.out::println);

        */
        //예산
        /*
        int [] d = {2,2,3,3};//정렬후 빼는걸로 답 3
        int budget=10;

        int answer =1;
        Arrays.sort(d);
        for(int i = 0; i<d.length;i++){
            if(budget>0){
                budget-=d[i];
                answer=i;
            }else break;
        }if(budget>=0)answer++;
        System.out.println(answer);
        ArrayPrint(d);
         */
        //삼총사
        /*
    int[] number = {-1, 1, -1, 1};
    //3개의 배열을 찿아 더햇을때 0이되는 수의 갯수를 찾아야함
        //이론상 수의 갯수는 배열의 갯수가  5*4*3 =>60번 반복

    int answer=0;
    for(int i=0; i<number.length;i++){
        for(int j =0; j<number.length;j++){
            if(i==j)continue;
            for(int k=0;k<number.length;k++){
                if(i==k||j==k)continue;
                else{
                    if((number[i]+number[j]+number[k])==0)
                        answer++;
                }
            }
        }
    }
        answer=answer/6;
    System.out.println(answer);

         */
        //시저암호
        /*
        String s ="z  Z";
        int n=1;
        //a=97 z=122 A=65 Z=90  대문자와 소문자 간격 25
        //대문자에서 +1되면 +1
        //소문자에서 +1되면 +24 => 25--

        String answer="";
        char[] c= s.toCharArray();
       // ArrayPrint(c);
        for(int i = 0; i<c.length;i++){
            if('a'<=c[i]) //소문자 받는다.
            {
                if(c[i]+n>'z')
                    c[i]=(char)(c[i]-(26-n));
                else c[i]+=(char)n;
            }
            else if (c[i]!=' ')  //대문자부터 받는다.
            {
                if(c[i]+n>'Z')
                    c[i]=(char)(c[i]-(26-n));
                else c[i]+=(char)n;
            }
        }
        answer =String.valueOf(c);
        char e= ' ';
        System.out.printf("%d",(int)e);

        System.out.println(answer);
        //a=97 z=122 A=65 Z=90  대문자와 소문자 간격 25
        //대문자에서 +1되면 +1
        //소문자에서 +1되면 +24 => 25--
 */
        //최소 직사각형
        /*
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        //주어진 sizes의 크기의 지갑을 모두
        // 보관할수 있는 지갑의 넓이 를 반환
        int w = 0;//가로는 그냥 최대크기를 기입
        int y = 0;//세로는  지갑중 길이가 작은것중 제일큰것

        for (int i = 0; i < sizes.length; i++) {
            int min=1000;//1차원배열중가장작은값 뽑기
            for (int j = 0; j < sizes[0].length; j++) {
                if (sizes[i][j] > w) w = sizes[i][j];
                if(sizes[i][j] <= min)min=sizes[i][j];
            }
            if(y<min)y=min;
        }

        System.out.println(w);
        System.out.println(y);
        int answer = w*y;

         */
        //크기가 작은 부분 문자열 효율 별로안좋음
        /*
        String p = "15515122234";
        String t= "10203545641516512051";//7개의 배열안에서는 5가지
        //500220839878  //12  10가지?
        //1234          //4   3가지의 자리수를 원할경우 2가지
                        //      -1더한다 자릿수에서
        //1234          //4   2가지의 자리수를 원할경우 3가지
        long i_p=Long.parseLong(p);//값을비교하기위해 p를 숫자로바꿈
        char[] c= t.toCharArray();  //t의 char배열생성

        long [] i_t= new long[c.length-(p.length()-1)]; //연산하기위한 배열 자리 생성

        int answer=0;

        for(int i=0;i<c.length;i++){
            String temporaryString="";
            if(i+p.length()-1>=c.length){
                break;
            }
            for(int j=i;j<i+p.length();j++)
                temporaryString +=(""+c[j]);
            i_t[i]=Long.parseLong(temporaryString);//값구하기
            //구한값을 바로 대입에서 처리가능?
            if(i_t[i]<=i_p)//작거나 같은수
                answer++;
        }

        System.out.println(t.length());
        ArrayPrint(i_t);
        System.out.println(i_p);
        System.out.println(answer);

         */
        //비밀지도
        /*
    int n = 5;// 정사각형 배열의 길이
    int[] arr1= {0,20,28,18,11};
    int[] arr2= {30,1,21,17,28};

    int [][] map = new int [n][n];// 지도의크기필요없나?
    //["#####","# # #", "### #", "# ##", "#####"]
    String [] answer= new String[n];

    for (int i =0; i<map.length;i++){
        int[][] binary=new int[2][n];
        binary[0]=decimal_Binary(arr1[i],n);
        binary[1]=decimal_Binary(arr2[i],n);
        for(int j= 0;j< map.length;j++){
            map[i][j]=binary[0][j];
            if(map[i][j]==1)continue;
             map[i][j]=binary[1][j];
        }
    }
        for (int i =0; i<map.length;i++) {
            answer[i]="";
            for (int j = 0; j < map.length; j++) {
                if(map[i][j]==1) answer[i]+="#";
                else answer[i]+=" ";
            }
        }


    int[] Binary_arr=decimal_Binary(arr1[0],n);


        arrMapPrint(map);
        ArrayPrint(Binary_arr);
        ArrayPrint(answer);

// 0,1  0,2     0,3    0,4  0,5
// 1    0       0       1   0
//9/2 = 4/2= 2/2 =1
// 0,1  0,2     0,3    0,4  0,5
// 0    0       1       0   1
//20/2 = 10/2 = 5/2 = 2/2 =1
    }

     */
        //비밀지도 모범답안 비트연산 |(or) 연산사용해서 라이브러리와 함께사용함
        //이진수 라이브러리가있으니 사용하도록 하자
        /* 
      String[] answer = new String[n];
      String temp;

      for(int i = 0 ; i < n ; i++){
          temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
          temp = temp.substring(temp.length() - n);
          temp = temp.replaceAll("1", "#");
          temp = temp.replaceAll("0", " ");
          answer[i] = temp;
      }
         */
        //문자열 내마음대로 정렬하기
        /*
        String s= "nineeightsevensixfivefourthreetwoone";//분해를 해야하나?
        //String s= "";//분해를 해야하나?
                                    //지속적으로 char[]에 집어넣어서 case문으로 돌리나?
        System.out.println(s.length());
        int answer =0;
        char[] c =s.toCharArray();
        // 숫자	영단어

        while (true){
             if(c.length==0)break;
             switch (c[0]){
                 case 'z' :
                     answer=answer*10+0;
                     s= s.replaceFirst("zero", "");
                     break;
                 // zero 일경우 글자를 제거 후 c를 다시 조립후 반환 다음수가 들어올경우 *10후다시반환
                 //0	zero
                 case 'o' :
                     answer=answer*10+1;
                     s= s.replaceFirst("one", "");
                     break;
                 //1	one
                 case 't' :
                     if(c[1]=='w'){
                         answer=answer*10+2;
                         s= s.replaceFirst("two", "");
                     }else {
                         answer=answer*10+3;
                         s= s.replaceFirst("three", "");
                     }
                     break;
                 //2	two
                 //3	three
                 case 'f' :
                     if(c[1]=='o'){
                         answer=answer*10+4;
                         s= s.replaceFirst("four", "");
                     }else {
                         answer=answer*10+5;
                         s= s.replaceFirst("five", "");
                     }
                     break;
                 //4	four
                 //5	five
                 case 's' :
                     if(c[1]=='i'){
                         answer=answer*10+6;
                         s= s.replaceFirst("six", "");
                     }else {
                         answer=answer*10+7;
                         s = s.replaceFirst("seven", "");
                     }
                     break;
                 //6	six
                 //7	seven
                 case 'e' :
                     answer=answer*10+8;
                     s= s.replaceFirst("eight", "");
                     break;
                 //8	eight
                 case 'n' :
                     answer=answer*10+9;
                     s= s.replaceFirst("nine", "");
                     break;
                 //9	nine
                 default:
                     answer=answer*10+(Integer.parseInt(String.valueOf(c[0])));
                     s= s.replaceFirst(String.valueOf(c[0]), "");
                     break;
             }
             c= s.toCharArray();

         }


         System.out.println(answer);
// 숫자	영단어
//0	zero
//1	one
//2	two
//3	three
//4	four
//5	five
//6	six
//7	seven
//8	eight
//9	nine

         */
        //문자열 내 마음대로 정렬하기
        /*
        String[] strings={"cdasd", "axc", "aase","afzx","aac"};
        int n = 2;
        //들어온 n값을 위치로 받아 strings[]의 문자 위치를말한다.
        // "sun","bed","car" 일때 n=1 이면 u,e,a
        // "sun","bed","car" 일때 n=0 이면 s,b,c
        // 각 뽑은값으로 문자 사전순으로 재배열
        // 그리고 만약 중복값이 나오면 사전순으로 재배열
        //n => 배열의 인덱스값
        //그 인덱스값을 이용해서 사선순으로 재배열
        //Arrays.sort(c);
        String[] answer =new String[strings.length];
        char[][] c2= new char[strings.length][strings[0].length()];//문자 배열을 효율적으로 작업하기위해 c배열로저장
        char[] c1=new char [strings.length];
        for(int i =0; i<strings.length;i++){
            c2[i]= strings[i].toCharArray();  //배열 저장 후 맞는인덱스에서 솔트(Arrays.sort)처리 해야함
            c1[i]=strings[i].toCharArray()[n];  //이건 2차원배열에 넣지않고 원하는 값 바로빼옴 여기선 u,e,a
        }
        Arrays.sort(c1);                    //1차 적인 배열 정렬 해당정렬을 이용해 c2를 재배열
        char comparator=' ';
        int count =1;

        for(int i =0; i<c1.length;i++){
            for(int j=0; j<c2.length;j++){
                if(c2[j][n]==c1[i]){//같으면 정렬
                    answer[i]= String.valueOf(c2[j]);
                    c2[j][n]=' ';//제거
                    ++count;
                    break;
                    //위작업은 중복이 없을때만 가능
                    // 중복이 생기면 중복에서 중복이생기는 지점을 비교하여 다시정렬
                    // ==""까지의 작업
                }
            }

            if(c1[i]==comparator){//비교자와 같을경우 0재정렬
                String[] compare=new String[count];
                for(int j = 0; j<count;j++)
                    compare[j]=answer[i-j];

                Arrays.sort(compare);// 정렬후 제기입

                for(int j = 0; j<count;j++)
                    answer[i-j]=compare[(count-1)-j];
            }else count=1;
            comparator=c1[i];
        }
        System.out.println("출력개시");
        CustomArray.ArrayPrint(answer);
        System.out.println(count);
//        CustomArray.ArrayPrint(c1);
//        CustomArray.ArrayPrint(c2);

         */
        //문자열 내 마음대로 정렬하기 최적화(속도는떨어짐)
        /*
                String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
         */

        //K번째수
        /*
      int [] array={1,5,2,6,3,7,4};
      int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        // i = 2, j = 5, k = 3      5,2,6,3  정렬후 나온 index =k 의 값을 가져온다
        //                          정렬(2,3,5,6) 인덱스 k는 5이다
        // i = 4, j = 4, k = 1      6 -> 6 -> 6
        // i = 1, j = 7, k = 3      1,5,2,6,3,7,4 ->1,2,3,4,5,6,7 -> 3


      int[] answer = new int[commands.length];
      //for문을 몇번 돌려야하나 ?
        //commands 의 길이를 확인 하기위한 첫번재 포문
        // commands 내부의 숫자로 array를  자르기위한 포문 1가지  i<j 와 같은형식으로
        //                                                  i=배열관점으로 i-1이맞음
        //현재 관점으로 2중 포문 필요
        int[] comparison_Array={};
      for(int i =0;i<commands.length;i++){
          comparison_Array= new int[(commands[i][1]-commands[i][0])+1];
          for(int j=(commands[i][0]-1);j<commands[i][1];j++){
              comparison_Array[j-(commands[i][0]-1)]= array[j];
          }
          //배열정렬후 k인덱스 추출
          Arrays.sort(comparison_Array);
          answer[i]=comparison_Array[commands[i][2]-1];
      }
      CustomArray.ArrayPrint(answer);

         */
        //K번째수 시간효율성 최적화
        /*
        int [] array={1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] answer = new int[commands.length];
        int[] comparison_Array = new int[array.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;

            // 원본 배열을 직접 참조하여 작업
            System.arraycopy(array, start, comparison_Array, 0, end - start + 1);
            Arrays.sort(comparison_Array, 0, end - start + 1);

            // 정렬된 배열에서 k번째 값 선택
            answer[i] = comparison_Array[k];
        }

         */








    }




}

