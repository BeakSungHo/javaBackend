package j2023_06_14;

import j2023_06_14.System.controller.SystemController;
import j2023_06_14.article.controller.Controller;

import java.util.Scanner;

public class BoarderApp {
    Scanner sc;

    SystemController systemController ;
    Controller con;

    BoarderApp(){
        systemController = new SystemController();
        con =  new Controller();
        sc= new Scanner(System.in);

    }
    public void Run(){//시작점
        while (true) {
            switch (" ") {
                case "add":
                    con.add();
                    break;
                case "list":
                    con.list();
                    break;
                case "exit":
                    systemController.exit();
                    return;
                default:

            }
        }
    }
}
