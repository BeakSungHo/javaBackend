package j2023_06_14.article.controller;

import j2023_06_14.article.entity.ArticleRepository;
import j2023_06_14.article.view.ArticleView;

import java.util.HashMap;


public class Controller {
    ArticleRepository articleRepository;
    HashMap<String, Object> param;
    ArticleView articleView;

    public Controller(){
        articleRepository=new ArticleRepository();
        articleView= new ArticleView();
        param=new HashMap<>();

    }

    public void add(){
        String title, content;

        articleView.addView();
        param = articleView.addView();

        title= (String)param.get("title");
        content= (String)param.get("content");

        articleRepository.add(title,content);
    }
    public void list(){

    }
}
