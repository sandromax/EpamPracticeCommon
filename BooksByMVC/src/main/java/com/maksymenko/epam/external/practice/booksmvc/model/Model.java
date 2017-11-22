package com.maksymenko.epam.external.practice.booksmvc.model;

import java.util.Arrays;

public class Model {

    Book[] shelf;

    public Model(int booksQuantity){
        ShelfGeneratorEnglish shelfGeneratorEnglish = new ShelfGeneratorEnglish();
        Book[] shelf = shelfGeneratorEnglish.createShelf(booksQuantity);
    }

    public Book[] getShelf(){
        return shelf;
    }

    //создать и сохранить полку
    //!!!Constructor

    //выборка по:
    //автору
    public Book[] findBooksByAuthor(String authorNeeded){
        Book[] result = new Book[shelf.length];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getAuthor().equals(authorNeeded)){
                result[iterator] = cloneBook(book);
                iterator++;
            }
        }

        return  result;
    }

    public static Book cloneBook(Book book){
        Book newBook = new Book(book.getBookName(), book.getAuthor(), book.getPublHouse(), book.getPublYear(), book.getNumberOfPage(), book.getPrice());
        return newBook;
    }

    //по издательству
    public Book[] findBooksByPublishing(String publishingNeeded){
        Book[] result = new Book[shelf.length];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getPublHouse().equals(publishingNeeded)){
                result[iterator] = book;
                iterator++;
            }
        }

        return  result;
    }

    //позже года ...
    public Book[] findLaterBooks(int fromYear){
        Book[] result = new Book[shelf.length];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getPublYear() > fromYear){
                result[iterator] = book;
                iterator++;
            }
        }

        return  result;
    }

    //сортировка по издательству
    public Book[] sortBooksByPublishing(){
        Arrays.sort(shelf, new BooksSortByPublishingHouseComparator());
        return shelf;
    }
}
