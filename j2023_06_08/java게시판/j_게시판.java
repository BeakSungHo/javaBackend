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
                    "(list)리스트 출력 하는 명령어 준비되어있습니다\n" +
                    "(update)리스트를 수정하는 명령어가 준비되어있습니다.\n"+
                    "(delete)리스트를 삭제하는 명령어가 준비되어있습니다.\n"+
                    "(exit)나가는 명령어 가 준비되어있습니다.\n"
                    );
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
                case "update":
                    System.out.println("리스트를 수정합니다.");
                    con.board_DataUpdata();
                    break;
                case "delete":
                    System.out.println("리스트를 삭제합니다.");
                    con.board_DataDelete();
                    break;
                case "exit":
                    System.out.println("프로그램이 잠시후 종료됩니다.");
                    return;

                default:
                    System.out.println("정상적인 값이 입력되지 않았습니다.");
                    System.out.println("add, list, exit중 하나만 입력해주세요 ");
                    System.out.printf("\"%s\"는 정상적인 명령어가 아닙니다.\n\n\n\n", command);
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
                    "**** %2d번 배열 리스트 내역 ****\n"+
                    "제목 : %s\n\n" +
                    "내용 : %s\n"+
                    "==========================================================\n",
                    i,bd.title.get(i),bd.contents.get(i));
        System.out.println("넘기시려면 아무키나 입력해주세요");
        sc.nextLine();//dummy

    }
    void board_DataUpdata(){
        board_DataList();
        System.out.println(
                "============================================\n" +
                "수정할 게시물번호를 입력하세요");
        String S_index=sc.nextLine();
        if(!S_index.matches("[0-9]+")){
            System.out.println("숫자를 입력해주세요");
            S_index=sc.nextLine();

        }

        System.out.println("제목의 수정사항을 입력해주세요");
        String updateData=sc.nextLine();
        bd.title.set(Integer.parseInt(S_index),updateData);

        System.out.println("내용의 수정사항을 입력해주세요");
        updateData=sc.nextLine();
        bd.contents.set(Integer.parseInt(S_index),updateData);

        System.out.printf(
                "%s번 인덱스의 게시물이 수정되었습니다.\n" +
                "============================================\n",S_index);
        this.flip_Screen(1000);

    }
    void board_DataDelete(){
        board_DataList();
        System.out.println(
                "============================================\n" +
                "삭제할 게시물번호를 입력하세요\n");
        String S_index=sc.nextLine();
        if(!S_index.matches("[0-9]+")){
            System.out.println("숫자를 입력해주세요");
            S_index=sc.nextLine();
        }
        bd.title.remove(Integer.parseInt(S_index));
        bd.contents.remove(Integer.parseInt(S_index));
        System.out.println(
                "삭제되었습니다 ^_^/ \n"+
                        "============================================\n");
        this.flip_Screen(1000);

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


