package j2023_05_31.clazz;

public class Class2 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car car1 = new Car();
        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        for(int i =0; i<=3;i++){
            car1.Run();
            //자동차가 달립니다.
            //자동차가 달립니다.
            //자동차가 달립니다.
        }
        Car[] car2= new Car[3];

        for(int i =0; i<3;i++){
            car2[i]=new Car();
            car2[i].Run();
            //자동차가 달립니다.
            //자동차가 달립니다.
            //자동차가 달립니다.
        }

    }
    public static class Car{
        public void Run(){
            System.out.println("자동차가 달립니다.");

        }
    }
}
