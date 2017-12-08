package com.maksymenko.epam.external.practice.booksmvc.controller;

import com.maksymenko.epam.external.practice.booksmvc.model.Model;
import com.maksymenko.epam.external.practice.booksmvc.view.ViewNew;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ControllerNew {
    private final Logger logger = Logger.getLogger(ControllerNew.class);

    public void launch() {
        logger.info("Program started");
        Model model = new Model(20);


        ViewNew.welcome();
        ViewNew.showShelf(model.getShelf());

        String command = "";
        while (!command.equals("exit")) {
            ViewNew.showCommands();
            command = enterCommandString();
            switch (command) {
                case "author": {
                    ViewNew.authorMenu();
                    ViewNew.showArray(model.findBooksByAuthor(enterCommandString()));
                    break;
                }
                case "publ": {
                    ViewNew.publMenu();
                    ViewNew.showArray(model.findBooksByPublishing(enterCommandString()));
                    break;
                }
                case "year": {
                    ViewNew.yearMenu();
                    ViewNew.showArray(model.findLaterBooks(enterCommandInt()));
                    break;
                }
                case "sort": {
                    ViewNew.sortMenu();
                    ViewNew.showArray(model.sortBooksByPublishing());
                    break;
                }
                case "exit": {
                    logger.info("Program halted");
                }
            }
        }
    }

    private String enterCommandString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int enterCommandInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
