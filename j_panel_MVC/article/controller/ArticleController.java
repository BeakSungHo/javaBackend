package j_panel_MVC.article.controller;


import j_panel_MVC.article.entity.Article;
import j_panel_MVC.article.entity.ArticleRepository;
import j_panel_MVC.article.view.ArticleView;
import j_panel_MVC.util.Util;


import java.util.ArrayList;
import java.util.HashMap;

public class ArticleController {

    ArticleRepository articleRepository;
    ArticleView articleview;

    public ArticleController() {
        articleRepository = new ArticleRepository();
        articleview = new ArticleView();
    }

    public void add() {
        HashMap<String, Object> param = articleview.addView();//해쉬맵으로 담아서 보넴
        String title = (String)param.get("title");
        String body = (String)param.get("body");
        articleRepository.insert(title, body, Util.getCurrentDate());
    }


    public void list() {
        ArrayList<Article> articles = articleRepository.getArticleList();
        articleview.printArticleList(articles);
    }

    public void update() {
        HashMap<String, Object> param;
        int target= articleview.targetView();
        Article  article= articleRepository.findArticleById(target);

        if(articleview.ckeckArticle(article))return;

        param = articleview.updateView();

        articleRepository.update(
                article,
                (String)param.get("title"),
                (String)param.get("body"));


    }

    public void delete() {
        int target= articleview.targetView();
        Article article = articleRepository.findArticleById(target);

        if(articleview.ckeckArticle(article))return;

        articleRepository.delete(article);

    }

    public void detail() {
        int target= articleview.targetView();
        Article article = articleRepository.findArticleById(target);

        if(articleview.ckeckArticle(article))return;

        article.setHit(article.getHit() + 1);
        articleview.detailView(article);
    }

    public void search() {
        String keyword = articleview.keywordView();
        ArrayList<Article> searchedArticles = articleRepository.search(keyword);

        if(searchedArticles.size() == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        articleview.printArticleList(searchedArticles);
    }

}
