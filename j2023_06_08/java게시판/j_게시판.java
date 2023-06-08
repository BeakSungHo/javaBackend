package j2023_06_08.java게시판;

import java.util.ArrayList;
import java.util.Scanner;

public class j_게시판 {
    public static void main(String[] args) {
        board b= new board();
        b.Start();

    }
}
class board{
    private control con;
    board(){
        con = new control();
    }
    void Start(){

        while (true){
            System.out.println("게시판을시작합니다.\n" +
                    "게시판의 명령어는 현제\n" +
                    "(add)추가 하는 명령어\n" +
                    "(list)리스트 출력 하는 명령어 \n" +
                    "(exit)나가는 명령어 가 준비되어있습니다.\n");
            Scanner sc=new Scanner(System.in);
            String command=sc.nextLine();
            switch (command){
                case "add":
                    System.out.println("게시판에 추가될 제목과 내용을 입력해주세요");
                    con.board_DataAdd();
                    break;
                case "list":
                    System.out.println("리스트를 출력합니다.");
                    con.board_DataList();
                    break;
                case "exit":
                    System.out.println("프로그램이 잠시후 종료됩니다.");
                    return;
                default:
                    System.out.println("정상적인 값이 입력되지 않았습니다.");
                    System.out.println("add, list, exit중 하나만 입력해주세요 ");
                    System.out.printf("\"%s는\" 정상적인 명령어가 아닙니다.\n\n\n\n", command);
                    con.flip_Screen(3000);
                    }
            }
    }





}
class control{
    private board_data bd;
    private Scanner sc;
    control(){
        bd=new board_data();
        sc= new Scanner(System.in);
    }
    void board_DataAdd(){
        System.out.println("게시물 제목을 입력해주세요  : ");
        String title=sc.nextLine();
        //sc.nextLine();//dummy
        System.out.println("게시물 내용을 입력해주세요 : ");
        //sc.nextLine();//dummy
        String contents=sc.nextLine();

        bd.title.add(title);
        bd.contents.add(contents);
        this.flip_Screen(1000);
    }
    void board_DataList(){
        System.out.println( "==========================================================");
        for(int i = 0 ; i<bd.contents.size();i++)
            System.out.printf(
                    "**** %2d번째 리스트 내역 ****"+
                    "제목 : %s\n\n" +
                    "내용 : %s\n"+
                    "==========================================================\n",
                    i+1,bd.title.get(i),bd.contents.get(i));
        System.out.println("넘기시려면 아무키나 입력해주세요");
        sc.nextLine();//dummy

    }
     void flip_Screen(int millis){
         try {
             Thread.sleep(millis);//바로지우면 문제되니 잠깐 슬립
             for(int i=0; i<60; i++)
                 System.out.println();
         } catch (Exception e) {
             System.out.println(e);
         }

    }


}
class board_data{
     ArrayList<String> title;//제목
     ArrayList<String> contents;//내용

    board_data(){
        title= new ArrayList<>();//제목
        contents= new ArrayList<>();//내용
    }

}


