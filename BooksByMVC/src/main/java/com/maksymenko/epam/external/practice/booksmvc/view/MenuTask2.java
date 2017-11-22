//package com.maksymenko.epam.external.practice.booksmvc.view;
//
//import com.maksymenko.epam.external.practice.booksmvc.model.ShelfGeneratorEnglish;
//import com.maksymenko.epam.external.practice.booksmvc.model.Book;
//import com.maksymenko.epam.external.practice.booksmvc.model.ShelfInform;
//
//import java.util.Scanner;
//
// public class MenuTask2 {
//    public void launch(){
//
//        hello();
//        Book[] shelf = ShelfGeneratorEnglish.createShelf(10);
//        showShelf(shelf);
//        showCommands();
//
//        String command = "";
//        Scanner in = new Scanner(System.in);
//        command = in.next();
//
//        ShelfInform shelfInform = new ShelfInform(shelf);
//
//        while (!command.equals("exit")){
//            switch (command){
//                case "author":{
//                    System.out.println("What is the author's name?");
//                    searchBy(shelf, command);
//                    break;
//                }
//                case "publ":{
//                    System.out.println("What is the publishing's name?");
//                    searchBy(shelf, command);
//                    break;
//                }
//                case "year":{
//                    System.out.println("After which year?");
//                    afterYear(shelfInform);
//                    break;
//                }
//                case "sort":{
//                    sort(shelfInform);
//                    break;
//                }
//                default:{
//                    showCommands();
//                    break;
//                }
//            }
//            command = in.nextLine();
//        }
//    }
//
//    private void hello(){
//        System.out.println("            Welcome to Task2" +
//                "\nHere we can sort and selection random bookshelf");
//        System.out.println("Generating random bookshelf...");
//    }
//
//    private void showCommands(){
//        System.out.println("Commands:" +
//                "\nauthor - to search by author\npubl - by publishing" +
//                "\nyear - to get book was publishing after some year" +
//                "\nsort - to sort by publishing" +
//                "\n         What do you want to do?");
//    }
//
//    private void showShelf(Book[] shelf){
//        System.out.println("            We have next books on our bookshelf");
//
//        for(Book b : shelf){
//            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
//        }
//        System.out.println("******************************************************************************");
//
//    }
//
//    private void searchBy(Book[] shelf, String searchParam){
//        ShelfInform shelfInform = new ShelfInform(shelf);
//
//        Scanner innerIn = new Scanner(System.in);
//        String staffWeLooking = innerIn.nextLine();
//
//        System.out.println("search by " + staffWeLooking + "\n------------------------------");
//        Book[] bySearchParam;
//
//        if(searchParam.equals("author")){
//            bySearchParam = shelfInform.findBooksByAuthor(staffWeLooking);
//        } else {
//            bySearchParam = shelfInform.findBooksByPublishing(staffWeLooking);
//        }
//
//        for(Book b : bySearchParam){
//            if(b == null)
//                continue;
//            System.out.println(b.getAuthor() + " " + b.getBookName() + " " + b.getPublHouse() + " " + b.getPublYear());
//        }
//        System.out.println("***************************************************************************");
//    }
//
//    private void afterYear(ShelfInform shelfInform){
//        Scanner innerIn = new Scanner(System.in);
//        int afterYear = innerIn.nextInt();
//
//        Book[] byYearLater = shelfInform.getLaterBooks(1914);
//        for(Book b : byYearLater){
//            if(b == null)
//                continue;
//            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
//        }
//        System.out.println("***************************************************************************");
//    }
//
//    private void sort(ShelfInform shelfInform){
//        System.out.println("Sorted by publishing\n--------------------");
//        Book[] sortByPubl = shelfInform.sortBooksByPublishing();
//        for (Book b : sortByPubl) {
//            if (b == null)
//                continue;
//            System.out.println(b.getAuthor() + " " + b.getBookName() + " " + b.getPublHouse() + " " + b.getPublYear());
//        }
//        System.out.println("******************************************************************************");
//    }
//}
