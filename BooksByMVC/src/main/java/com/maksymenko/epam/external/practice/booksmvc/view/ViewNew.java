package com.maksymenko.epam.external.practice.booksmvc.view;

import com.maksymenko.epam.external.practice.booksmvc.model.Book;

import java.util.List;
import java.util.Set;

public class ViewNew {
    /**
     * Method prints invitation of the program
     */
    public static void welcome() {
        System.out.println("            Welcome to Task6.1" +
                "\nHere we can sort and selection random bookshelf," +
                "\nsave objects to files and logging events");
        System.out.println("Generating random bookshelf...");
    }

    /**
     * Method prints valid commands
     */
    public static void showCommands() {
        System.out.println("\tCommands:" +
                "\nauthor - to search by author" +
                "\npubl - by publishing" +
                "\nyear - to get book was publishing after some year" +
                "\nsort - to sort by publishing" +
                "\nsave - to save objects to file" +
                "\n         What do you want to do?");
    }

    /**
     * Method for the output of a menu item "author"
     */
    public static void authorMenu() {
        System.out.println("What is the author's name?");
    }

    public static void publMenu() {
        System.out.println("What is the publishing's name?");
    }

    public static void yearMenu() {
        System.out.println("After which year?");
    }

    public static void sortMenu() {
        System.out.println("Shelf sorted by publishing house:");
    }

    public static void showShelf(Book[] shelf){
        System.out.println("            We have next books on our bookshelf");

        for(Book b : shelf){
            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
        }
        System.out.println("******************************************************************************");

    }

    public static void showArray(Book[] arrayToShow) {
        System.out.println(arrayToShow.length);

        for(Book b : arrayToShow){
            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
        }
    }
}
