package com.maksymenko.epam.external.practice.booksmvc.controller;

import com.maksymenko.epam.external.practice.booksmvc.model.Book;
import com.maksymenko.epam.external.practice.booksmvc.model.Model;
import com.maksymenko.epam.external.practice.booksmvc.view.ViewNew;
import org.apache.log4j.Logger;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Class writes objects to file
 *
 * @version 2.23 2017-12-07
 *
 * @author Maksymenko Oleksandr
 */
public class ControllerNew {
    private final Logger logger = Logger.getLogger(ControllerNew.class);

    public void launch() {
        logger.info("Program started");
        Model model = new Model(20);
        Book[] shelfInProgram = model.getShelf();

        ViewNew.welcome();
        ViewNew.showShelf(shelfInProgram);

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
                case "saveto": {
                    saveObjects(model.getShelf());
                    logger.info("shelf save to ...");
                    break;
                }
                case "loadshelf": {
                    ViewNew.loadShelfMenuPath();
                    model.setShelf(loadShelf(enterCommandString()));

                    ViewNew.loadShelfMenuResult();
                    ViewNew.showShelf(model.getShelf());
                    break;
                }
                case "exit": {
                    logger.info("Program halted");
                    break;
                }
                default: {
                    System.out.println("Command not found. Try again");
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

    public boolean checkPath(String path) {
        if(Files.exists(Paths.get(path)))
            return true;
        else
            return false;
    }

    public boolean saveObjects(Book[] books) {
        ViewNew.saveToMenuEnterDir();
        String pathDir = "";

        do{
            pathDir = enterCommandString();
        }while (!checkPath(pathDir));

        ViewNew.savToMenuEnterFileName();
        String fileName = enterCommandString();

        FileWork fileWork = new FileWork();
        fileWork.saveShelfToFile(books, pathDir + fileName + ".ser");

        return true;
    }

    public Book[] loadShelf(String path) {
        FileWork fileWork = new FileWork();
        List<Book> list = fileWork.readShelfFromFile(path);

        Book[] result = new Book[list.size()];

        int i = 0;
        for(Book book : list) {
            result[i] = book;
            i++;
        }

        return result;
    }
}
