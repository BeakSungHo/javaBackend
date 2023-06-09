package j2023_06_08.java게시판;

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


}

class control {
    private board_data bd;
    private Scanner sc;
    private static int board_Count = 1;

    control() {
        bd = new board_data();
        sc = new Scanner(System.in);

        bd.num.add(board_Count);
        bd.title.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        bd.contents.add("contents1");
        bd.date.add("2021_03_06 00:00:00");
        bd.viewCount.add(0);
        board_Count++;

        bd.num.add(board_Count);
        bd.title.add("자바 질문좀 할게요~");
        bd.contents.add("contents2");
        bd.date.add("2021_03_06 00:00:00");
        bd.viewCount.add(0);
        board_Count++;

        bd.num.add(board_Count);
        bd.title.add(" 정처기 따야되나요?");
        bd.contents.add("contents3");
        bd.date.add("2021_03_06 00:00:00");
        bd.viewCount.add(0);
        board_Count++;

    }

    void board_DataAdd() {
        System.out.println("게시물 제목을 입력해주세요  : ");
        String title = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요 : ");
        String contents = sc.nextLine();

        Date d = new Date();
//        SimpleDateFormat fDay = new SimpleDateFormat("오늘의 날짜와 시간은 yyyy년 MM월 dd일 E요일 hh시 mm분 ss초입니다.");
        SimpleDateFormat fDay = new SimpleDateFormat("yyyy_MM_dd hh:mm:ss");
        fDay.format(d);

        bd.num.add(board_Count);
        bd.title.add(title);
        bd.contents.add(contents);
        bd.date.add(fDay.format(d));
        bd.viewCount.add(0);
        board_Count++;
        this.flip_Screen();
    }

    void board_DataList() {
        System.out.println("==========================================================");
        for (int i = 0; i < bd.contents.size(); i++)
            System.out.printf(
                            "**** %2d번 리스트 내역 ****\n" +
                            "제목 : %s\n\n" +
                            "내용 : %s\n" +
                            "==========================================================\n",
                    bd.num.get(i), bd.title.get(i), bd.contents.get(i));

    }

    void board_DataUpdata() {
        int idx;
        board_DataList();
        System.out.println(
                "============================================\n" +
                        "수정할 게시물번호를 입력하세요");
        idx = idx_Search(check_Number(sc.nextLine()));

        if (idx >= bd.title.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            return;
        }

        System.out.println("제목의 수정사항을 입력해주세요");
        String updateData = sc.nextLine();
        bd.title.set(idx, updateData);

        System.out.println("내용의 수정사항을 입력해주세요");
        updateData = sc.nextLine();
        bd.contents.set(idx, updateData);

        System.out.printf(
                "%d번 인덱스의 게시물이 수정되었습니다.\n" +
                        "============================================\n", bd.num.get(idx));
        this.flip_Screen();

    }

    void board_DataDelete() {
        int idx;
        board_DataList();
        System.out.println(
                "============================================\n" +
                        "삭제할 게시물번호를 입력하세요\n");
        idx = idx_Search(check_Number(sc.nextLine()));
        if (idx >= bd.title.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            sleep_Screen(1000);
            return;
        }

        bd.num.remove(idx);
        bd.title.remove(idx);
        bd.contents.remove(idx);
        bd.date.remove(idx);
        bd.viewCount.remove(idx);
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

        if (idx >= bd.title.size()) {
            System.out.println("해당 게시물번호는 존재하지 않습니다.");
            sleep_Screen(1000);
            return;
        }

        bd.viewCount.set(idx, bd.viewCount.get(idx) + 1);
        System.out.printf(
                "==========================================================\n" +
                        "**** %2d번 배열 리스트 내역 ****\n" +
                        "\t제목 : %s\n" +
                        "\t내용 : %s\n" +
                        "\t등록 날짜 : %s\n" +
                        "\t조회수 : %d\n" +
                        "==========================================================\n",
                bd.num.get(idx), bd.title.get(idx), bd.contents.get(idx), bd.date.get(idx), bd.viewCount.get(idx));
        this.flip_Screen();

    }

    void board_DataSerch() {
        //제목의 내욕을 검색해서 키워드가 들어있으면 출력
        System.out.println("검색할 제목을 입력하세요");
        String serchText = sc.nextLine();
        int count = 0;
        for (int i = 0; i < bd.title.size(); i++) {
            if (bd.title.get(i).contains(serchText)) {//같으면 출력
                System.out.printf(
                        "==========================================================\n" +
                                "**** %2d번 배열 리스트 내역 ****\n" +
                                "\t제목 : %s\n" +
                                "\t내용 : %s\n" +
                                "==========================================================\n",
                        bd.num.get(i), bd.title.get(i), bd.contents.get(i));
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
        int idx = bd.title.size() + 1;
        for (int i = 0; i < bd.num.size(); i++)//비교
            if (bd.num.get(i) == number) {
                idx = i;
                break;
            }

        return idx;
    }
}

class board_data {
    ArrayList<Integer> num;
    ArrayList<String> title;//제목
    ArrayList<String> contents;//내용
    ArrayList<String> date;
    ArrayList<Integer> viewCount;
    ArrayList<detail_Board_Data> detailBoard;

    board_data() {
        num = new ArrayList<>();
        title = new ArrayList<>();//제목
        contents = new ArrayList<>();//내용
        date = new ArrayList<>();
        viewCount = new ArrayList<>();
    }

}

class detail_Board_Data {

}

