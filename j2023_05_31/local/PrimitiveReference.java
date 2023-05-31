package j2023_05_31.local;

public class PrimitiveReference {
    public static void main(String[] args) {

        //new를 이용해서 힙메모리에 새롭게 공간할당 
        String str1= new String("Hellow world");
        String str2= new String("Hellow world");

        //아래는 위와같은 객체이지만 저장방식이 조금다르다.
        //위와달리 값이 서로같을경우 새로운 힙메모리를 생성하지않음
        //힙에 만들어진 메모리영역을 인스턴스혹은 객체라고부른다.
        String str3="Hellow world";
        String str4="Hellow world";

        System.out.println(str1);
        System.out.println(str1);

        if(str1==str2){//다른인스턴트 참조 출력
           System.out.println("str1, str2같은인스턴스 참조");
        }else{
            System.out.println("str1, str2다른인스턴스 참조");
        }
        if(str3==str4){//같은인스턴트 참조 출력
            System.out.println("str3, str4같은인스턴스 참조");
        }else{
            System.out.println("str3, str4다른인스턴스 참조");
        }

    }
}
