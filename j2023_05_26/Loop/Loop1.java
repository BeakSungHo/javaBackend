package j2023_05_26.Loop;

import java.util.Random;

public class Loop1 {
    public static void main(String[] args) {

        //반복문 사용 인한 코드
        //while, for
        Random random = new Random();
        int rWeather;
        int i =1;

        do{
            i++;
            System.out.println("코드"+i);
        }
        while (i<4);

        for(i=0; i<=4;i++){
            System.out.println("코드1");
        }


        for(i=0; i<=4;i++){
            rWeather = random.nextInt(4)+1;
            System.out.println((i+1)+"번째 날씨는");
            WeatherSet(rWeather);
            System.out.println((rWeather));
        }


    }
    public static void WeatherSet(int weather){
        switch (weather){
            case 1 ://맑음
                System.out.println("맑구먼유");
                Sleep_1sec();
                break;
            case 2:
                System.out.println("비온당");
                Sleep_1sec();
                break;
            case 3:
                System.out.println("안개당");
                Sleep_1sec();
                break;
            case 4:
                System.out.println("눈온당");
                Sleep_1sec();
                break;
            case 5:
                System.out.println("아몰랑");
                Sleep_1sec();
                break;

        }

    }
    public static void Sleep_1sec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
