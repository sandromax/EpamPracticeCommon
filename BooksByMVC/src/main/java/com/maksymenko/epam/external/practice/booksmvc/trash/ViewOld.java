package com.maksymenko.epam.external.practice.booksmvc.trash;

import com.maksymenko.epam.external.practice.booksmvc.model.Book;
import com.maksymenko.epam.external.practice.booksmvc.model.Model;

import java.util.Scanner;


public class ViewOld {

    Model modelInView;
    ControllerOld ctrlInView;

    public ViewOld(Model model, ControllerOld controllerOld){
        modelInView = model;
        ctrlInView = controllerOld;
    }

    public void start(){
        hello();
        showShelf(modelInView.getShelf());
        showCommands();
        menu();
    }

    public void menu(){
        String command = "";
        Scanner in = new Scanner(System.in);
        command = in.next();

        while (!command.equals("exit")){
            switch (command){
                case "author":{
                    System.out.println("What is the author's name?");
                    Scanner innerIn = new Scanner(System.in);
                    String staffWeLooking = innerIn.nextLine();
                    ctrlInView.findBooksByAuthorCtrl(modelInView, staffWeLooking);
                    break;
                }
                case "publ":{
                    System.out.println("What is the publishing's name?");
                    Scanner innerIn = new Scanner(System.in);
                    String staffWeLooking = innerIn.nextLine();
                    ctrlInView.findBooksByPublCtrl(modelInView, command);
                    break;
                }
                case "year":{
                    System.out.println("After which year?");
                    Scanner innerIn = new Scanner(System.in);
                    int staffWeLooking = innerIn.nextInt();
                    ctrlInView.findLaterBooksCtrl(modelInView, staffWeLooking);
                    break;
                }
                case "sort":{
                    ctrlInView.sortBooksByPublCtrl(modelInView);
                    break;
                }
                default:{
                    showCommands();
                    break;
                }
            }
            command = in.nextLine();
        }
    }


    private void hello(){
        System.out.println("            Welcome to Task2" +
                "\nHere we can sort and selection random bookshelf");
        System.out.println("Generating random bookshelf...");
    }

    private void showCommands(){
        System.out.println("Commands:" +
                "\nauthor - to search by author\npubl - by publishing" +
                "\nyear - to get book was publishing after some year" +
                "\nsort - to sort by publishing" +
                "\n         What do you want to do?");
    }

    private void showShelf(Book[] shelf){
        System.out.println("            We have next books on our bookshelf");

        for(Book b : shelf){
            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
        }
        System.out.println("******************************************************************************");

    }

}
