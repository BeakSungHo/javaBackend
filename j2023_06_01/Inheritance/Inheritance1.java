package j2023_06_01.Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.move();


    }
}
class Animal{
    void move(){
        System.out.println("움직입니다.");

    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("미야옹.");
    }
}
class Dog{
    public void bark(){
        System.out.println("멍.");
    }
}


