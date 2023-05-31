package j2023_05_31.clazz;

public class Class3 {
    public static void main(String[] args) {
        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        Car car1 = new Car(220);
        Car car2 = new Car(250);
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.
        
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        car1.Run();
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        car2.Run();


    }
    public static class Car{
        int maxSpeed;
        public Car(int maxSpeed){
            this.maxSpeed=maxSpeed;
        }
        public void Run(){
            System.out.printf("자동차가 최대속력 %d km로 달립니다\n",this.maxSpeed);

        }
    }
}
