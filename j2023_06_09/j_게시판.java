package j2023_06_09;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class j_게시판 {
    public static void main(String[] args) {
        board b = new board();
        b.Start();

    }
}

class board {
    private control con;
    board() {
        con = new control();
    }
    void Start() {

        while (true) {
            System.out.println("게시판을시작합니다.\n" +
                    "게시판의 명령어는 현제\n" +
                    "(add)추가 하는 명령어\n" +
                    "(list)리스트 출력 하는 명령어 준비되어있습니다\n" +
                    "(update)리스트를 수정하는 명령어가 준비되어있습니다.\n" +
                    "(delete)리스트를 삭제하는 명령어가 준비되어있습니다.\n" +
                    "(detail)리스트를 세부사항을 출력하는 명령어가 준비되어있습니다.\n" +
                    "(search)리스트를 검색하는 명령어가 준비되어있습니다.\n" +
                    "(exit)나가는 명령어 가 준비되어있습니다.\n"
            );
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            switch (command) {
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
                case "detail":
                    System.out.println("리스트의 세부정보를 출력합니다.");
                    con.board_DataDetail();
                    break;
                case "search":
                    System.out.println("리스트를 검색하여 출력합니다.");
                    con.board_DataSerch();
                    break;
                case "exit":
                    System.out.println("프로그램이 잠시후 종료됩니다.");
                    return;

                default:
                    System.out.println("정상적인 값이 입력되지 않았습니다.");
                    System.out.println("add, list, exit중 하나만 입력해주세요 ");
                    System.out.printf("\"%s\"는 정상적인 명령어가 아닙니다.\n\n\n\n", command);
                    con.sleep_Screen(2000);
            }
        }
    }
    public void DetailCommand(){
//        String command = sc.nextLine();
    }
}

class control {
    private ArrayList<board_data> bd;
    private Scanner sc;

    control() {
        bd = new ArrayList<>();
        sc = new Scanner(System.in);

        bd.add(new board_data("안녕하세요 반갑습니다. 자바 공부중이에요.","contents1"));
        bd.add(new board_data("자바 질문좀 할게요.","contents2"));
        bd.add(new board_data("정처기 따야되나요?.","contents3"));

    }
    void board_DataAdd() {
        System.out.println("게시물 제목을 입력해주세요  : ");
        String title = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요 : ");
        String contents = sc.nextLine();

        bd.add(new board_data(title,contents));

        this.flip_Screen();
    }
    void board_DataList() {
        System.out.println("==========================================================");
        for (int i = 0; i < bd.size(); i++)
            System.out.printf(
                            "**** %2d번 리스트 내역 ****\n" +
                            "제목 : %s\n\n" +
                            "내용 : %s\n" +
                            "==========================================================\n",
                    bd.get(i).getNum(), bd.get(i).getTitle(), bd.get(i).getContens());

    }
    void board_DataUpdata() {
        int idx;
        board_DataList();
        System.out.println(
                "============================================\n" +
                        "수정할 게시물번호를 입력하세요");
        idx = idx_Search(check_Number(sc.nextLine()));

        if (idx >= bd.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            return;
        }

        System.out.println("제목의 수정사항을 입력해주세요");
        String updateData = sc.nextLine();
        bd.get(idx).setTitle(updateData);

        System.out.println("내용의 수정사항을 입력해주세요");
        updateData = sc.nextLine();
        bd.get(idx).setContens(updateData);

        System.out.printf(
                "%d번 인덱스의 게시물이 수정되었습니다.\n" +
                        "============================================\n", bd.get(idx).getNum());
        this.flip_Screen();

    }
    void board_DataDelete() {
        int idx;
        board_DataList();
        System.out.println(
                "============================================\n" +
                        "삭제할 게시물번호를 입력하세요\n");
        idx = idx_Search(check_Number(sc.nextLine()));
        if (idx >= bd.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            sleep_Screen(1000);
            return;
        }

        bd.remove(idx);

        System.out.println(
                "삭제되었습니다 ^_^/ \n" +
                        "============================================\n");
        this.flip_Screen();
    }
    void board_DataDetail() {
        int idx;
        board_DataList();

        System.out.println(
                "============================================\n" +
                        "세부정보를 표시할 게시물번호를 입력하세요\n");
        idx = idx_Search(check_Number(sc.nextLine()));

        if (idx >= bd.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            sleep_Screen(1000);
            return;
        }

        bd.get(idx).visit_ViewCount();//방문자 수 증가

        System.out.printf(
                "==========================================================\n" +
                        "**** %2d번 배열 리스트 내역 ****\n" +
                        "\t제목 : %s\n" +
                        "\t내용 : %s\n" +
                        "\t등록 날짜 : %s\n" +
                        "\t조회수 : %d\n" +
                        "==========================================================\n",
                bd.get(idx).getNum(), bd.get(idx).getTitle(), bd.get(idx).getContens(), bd.get(idx).get_Date(), bd.get(idx).get_ViewCount());
        this.flip_Screen();

    }
    void board_DataSerch() {
        //제목의 내욕을 검색해서 키워드가 들어있으면 출력
        System.out.println("검색할 제목을 입력하세요");
        String serchText = sc.nextLine();
        int count = 0;
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getTitle().contains(serchText)) {//같으면 출력
                System.out.printf(
                        "==========================================================\n" +
                                "**** %2d번 배열 리스트 내역 ****\n" +
                                "\t제목 : %s\n" +
                                "\t내용 : %s\n" +
                                "==========================================================\n",
                        bd.get(i).getNum(), bd.get(i).getTitle(), bd.get(i).getContens());
                count++;
            }
        }
        if (count > 0) System.out.println(count + "개의 리스트가 검색되었습니다.");
        else System.out.println("리스트가 없습니다.");

    }
    void sleep_Screen(int millis) {
        try {
            Thread.sleep(millis);//바로지우면 문제되니 잠깐 슬립
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    void flip_Screen() {
        System.out.println("넘기시려면 아무키나 입력해주세요");
        sc.nextLine();
        for (int i = 0; i < 60; i++)
            System.out.println();
    }
    int check_Number(String str) {
        while (true) {
            if (!str.matches("[0-9]+")) {
                System.out.println("숫자를 입력해주세요");
                str = sc.nextLine();
            } else break;
        }
        return Integer.parseInt(str);
    }
    int idx_Search(int number) {//를 찾아서 반환
        int idx = bd.size() + 1;
        for (int i = 0; i < bd.size(); i++)//비교
            if (bd.get(i).getNum() == number) {
                idx = i;
                break;
            }

        return idx;
    }
}

class board_data {
    private static int board_Count = 1;
    private int num;
    private String title;//제목
    private String contents;//내용
    private String date;
    private int viewCount;
    private detail_Board_Data detailBoard;


    board_data(String title, String contents) {

        this.num =board_Count ;
        this.title = title;
        this.contents = contents;
        this.date =new SimpleDateFormat("yyyy_MM_dd hh:mm:ss").format(new Date());
        this.viewCount = 0;


        detailBoard= new detail_Board_Data();
        board_Count++;
        
    }
   int getNum(){
        return this.num;
    }
    String getTitle(){
        return this.title;
    }
    String getContens(){
        return this.contents;
    }
    String get_Date (){
        return this.date;
    }
    int get_ViewCount(){
        return this.viewCount;
    }
    detail_Board_Data get_DetailBoard(){
        return this.detailBoard;
    }


    void setNum(int num){
       this.num = num;
    }
    void setTitle(String title){
        this.title= title;
    }
    void setContens(String contents){
        this.contents=contents;
    }
    void setDate (String date){
        this.date=date;
    }
    void setViewCount(int viewcount){
       this.viewCount=viewcount;
    }
    void setDetailBoard(detail_Board_Data detailboard){
        this.detailBoard= detailboard;
    }
    void visit_ViewCount(){
        this.viewCount++;
    }

}

class detail_Board_Data {

}

