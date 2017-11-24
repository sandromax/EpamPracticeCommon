package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Storage;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.Menu;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.View;

import java.util.Scanner;

public class Controller {
    Storage storage;

    public Controller(Storage storage){
        this.storage = storage;
    }

    public void start(){

        Menu.greeting();
        Menu.commands();
        Menu.invitation();

        String command = "";
        Scanner scanner = new Scanner(System.in);
        command = scanner.next();

        while(!command.equals("exit")){
            if(command.equals("add")){

            } else if(command.equals("journal")){
                Menu.showJournal(storage.getJournal());
            } else if(command.equals("ru")){
                System.out.println("Changing interface languege to \"Russian\"");

            } else if(command.equals("eng")){
                System.out.println("Changing interface languege to \"English\"");
            }
        }

    }

    public  void enteringData(){
        Scanner enter = new Scanner(System.in);
        String userEntrey = enter.next();
    }
}
