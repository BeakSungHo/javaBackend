package j2023_06_14.article.view;

import java.util.HashMap;
import java.util.Scanner;

public class ArticleView {
    HashMap<String, Object> param;
    Scanner sc ;
    public ArticleView(){
        param=new HashMap<>();
        sc= new Scanner(System.in);
    }

    public  HashMap<String, Object> addView(){
        param=null;
        System.out.println("게시물 제목을 입력해주세요");
        String title = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요");
        String content= sc.nextLine();

        param.put("title",title);
        param.put("content",content);

        return param;
    }
}
