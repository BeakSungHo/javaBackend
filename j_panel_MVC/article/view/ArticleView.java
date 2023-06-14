package j_panel_MVC.article.view;

import j_panel_MVC.article.entity.Article;
import j_panel_MVC.article.entity.ArticleRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArticleView {
    Scanner scan = new Scanner(System.in);

    public void printArticleList(ArrayList<Article> list) {
        if(list.size() == 0) {
            System.out.println("등록된 게시물이 없습니다.");
            return;
        }

        System.out.println("====================");
        for(int i = 0; i < list.size(); i++) {
            Article article = list.get(i);

            System.out.printf("번호 : %d\n", article.getId() );
            System.out.printf("제목 : %s\n", article.getTitle() );
            System.out.println("====================");
        }
    }

    public HashMap<String, Object> addView() {
        System.out.printf("게시물 제목을 입력해주세요 : ");
        String title = scan.nextLine();
        System.out.printf("게시물 내용을 입력해주세요 : ");
        String body = scan.nextLine();

        HashMap<String, Object> param = new HashMap<>();
        param.put("title", title);
        param.put("body", body);

        System.out.println("게시물이 등록되었습니다.");
        return param;
    }
    public HashMap<String, Object> updateView(){
        HashMap<String, Object> param = new HashMap<>();
        int target;
        String title;
        String body;

        System.out.printf("제목 : ");
        title = scan.nextLine();
        System.out.printf("내용 : ");
        body = scan.nextLine();

        param.put("title", title);
        param.put("body", body);

        System.out.println("수정이 완료되었습니다.");
        return param;
    }
    public boolean ckeckArticle(Article article){
        if(article == null) {
            System.out.println("없는 게시물 번호입니다.");
            return true;
        }
        System.out.printf("성공");

        return false;
    }

    public void detailView(Article article){
        System.out.println("======== 게시물 상세 ========");
        System.out.println("번호   : " + article.getId());
        System.out.println("제목   : " + article.getTitle());
        System.out.println("내용   : " + article.getBody());
        System.out.println("등록날짜   : " + article.getRegDate());
        System.out.println("조회수   : " + article.getHit());
        System.out.println("==============================");

    }
    public String keywordView(){
        String keyword;

        System.out.printf("검색어를 입력해주세요 : ");
        keyword = scan.nextLine();
        scan.nextLine(); // 버퍼 비우기용

        return keyword;
    }
    public int targetView(){
        int target;
        System.out.println("게시물 번호를 입력해주세요.");
        System.out.printf("게시물 번호 : ");
        target = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기용

        return target;
    }

    public HashMap<String, Object> base(){
        HashMap<String, Object> param = new HashMap<>();
        return param;
    }
}
