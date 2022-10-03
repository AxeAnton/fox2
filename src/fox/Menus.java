package fox;

import fox.menuCommand.CommandDownloadGame;
import fox.menuCommand.CommandExit;
import fox.menuCommand.CommandStartGame;

import java.util.Scanner;

public class Menus {
    CommandDownloadGame commandDownloadGame = new CommandDownloadGame();
    //Execute execute = new Execute().getUnNamePoint();
    //public Menus() {} //пустой конструктор

    void runMenu1() {
        boolean y = true;
        while (y) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду:\nНачать игру - нажмите 1;\nЗагрузить игру - нажмите 2;\nВыход - нажмите 3. ");
            int userNum = in.nextInt();
            if (userNum == 1) {
                new CommandStartGame().ExecuteMenu();
                // execute.start();
            } else if (userNum == 2) {
                commandDownloadGame.readFromFile();
                // System.out.println(commandDownloadGame);
            } else if (userNum == 3) {
                runMenu2();
            } else {
                System.out.println("Введено не верное значение, попробуйте снова");
            }
        }
    }

    public void runMenu2() {
        boolean y = true;
        while (y) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду:\nСохранить игру - нажмите 1;\nВыйти без сохранения - нажмите 2");
            int userNum = in.nextInt();
            if (userNum == 1) {
                commandDownloadGame.writeToFile(new Execute().getUnNameKey()); // FIXME кажется проблемма вот в этом аргументе.
                runMenu1(); // new CommandExit().ExecuteMenu();
            } else if (userNum == 2) {
                new CommandExit().ExecuteMenu();
            } else {
                System.out.println("Введено не верное значение, попробуйте снова");
            }
        }
    }


}


