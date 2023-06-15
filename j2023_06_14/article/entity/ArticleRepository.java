package j2023_06_14.article.entity;

import java.util.ArrayList;

public class ArticleRepository {
    ArrayList<Article> list;
    private int numCount =4;

    public ArticleRepository(){
        list=new ArrayList<>();
    }

    public void add(String title, String content){
        list.add(new Article(numCount,title,content));
        numCount++;
    }

    private void init(){
        list.add(new Article(1,"첫","첫"));
        list.add(new Article(2,"두","두"));
        list.add(new Article(3,"셋","셋"));
    }

}
