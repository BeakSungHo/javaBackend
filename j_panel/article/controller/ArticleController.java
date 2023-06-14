package j_panel.article.controller;

import j_panel.article.entity.Article;
import j_panel.article.entity.ArticleRepository;
import j_panel.util.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleController {

    Scanner scan = new Scanner(System.in);
    ArticleRepository articleRepository;

    public ArticleController() {
        articleRepository = new ArticleRepository();
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scan.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = scan.nextLine();

        articleRepository.insert(title, body, Util.getCurrentDate());

        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {

        ArrayList<Article> articles = articleRepository.getArticleList();

        if(articles.size() == 0) {
            System.out.println("등록된 게시물이 없습니다.");
            return;
        }
        printArticleList(articles);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int target = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기용

        Article article = articleRepository.findArticleById(target);

        if(article == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("제목 : ");
        String title = scan.nextLine();
        System.out.print("내용 : ");
        String body = scan.nextLine();

        articleRepository.update(article, title, body);
        System.out.println("수정이 완료되었습니다.");
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int target = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기용

        Article article = articleRepository.findArticleById(target);

        if(article == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        articleRepository.delete(article);
        System.out.printf("%d번 게시물이 삭제되었습니다.\n", target);
    }

    public void detail() {
        System.out.println("게시물 번호를 입력해주세요.");
        int target = scan.nextInt();
        scan.nextLine();
        Article article = articleRepository.findArticleById(target);

        if (article == null) {
            System.out.println("없는 게시물입니다.");
        } else {
            article.setHit(article.getHit() + 1);

        }
    }

    public void search() {
        System.out.print("검색어를 입력해주세요 : ");
        String keyword = scan.nextLine();

        ArrayList<Article> searchedArticles = articleRepository.search(keyword);

        if(searchedArticles.size() == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        printArticleList(searchedArticles);
    }



    public void printArticleList(ArrayList<Article> list) {
        System.out.println("====================");
        for (Article article : list) {
            System.out.printf("번호 : %d\n", article.getId());
            System.out.printf("제목 : %s\n", article.getTitle());
            System.out.println("====================");
        }
    }


}
