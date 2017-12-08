package com.maksymenko.epam.external.practice.booksmvc.model;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Model {

    Book[] shelf;
    Logger logger = Logger.getLogger(Model.class);

    public Model(int booksQuantity){
        ShelfGeneratorEn shelfGeneratorEn = new ShelfGeneratorEn();
        shelf = shelfGeneratorEn.createShelf(booksQuantity);
        logger.info("Shelf was generated");
    }

    public Book[] getShelf(){
        return shelf;
    }

    public Book[] findBooksByAuthor(String authorNeeded){
        int size = 0;
        for(Book b : shelf) {
            if (b.getAuthor().equals(authorNeeded))
                size++;
        }

        logger.info("Founded " + size + " books by " + authorNeeded);

        Book[] result = new Book[size];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getAuthor().equals(authorNeeded)){
                result[iterator] = cloneBook(book);
                iterator++;
            }
        }

        return  result;
    }

    public Book[] findBooksByPublishing(String publishingNeeded){
        int size = 0;
        for(Book b : shelf) {
            if (b.getPublHouse().equals(publishingNeeded))
                size++;
        }

        logger.info("Founded " + size + " books by " + publishingNeeded);

        Book[] result = new Book[size];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getPublHouse().equals(publishingNeeded)){
                result[iterator] = book;
                iterator++;
            }
        }

        return  result;
    }

    public Book[] findLaterBooks(int fromYear){
        int size = 0;
        for(Book b : shelf) {
            if (b.getPublYear() > fromYear)
                size++;
        }

        logger.info("Founded " + size + " books later than " + fromYear);

        Book[] result = new Book[size];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getPublYear() > fromYear){
                result[iterator] = book;
                iterator++;
            }
        }

        return  result;
    }

    public Book[] sortBooksByPublishing(){
        Arrays.sort(shelf, new BooksSortByPublishingHouseComparator());
        return shelf;
    }

    public static Book cloneBook(Book book){
        Book newBook = new Book(book.getBookName(), book.getAuthor(), book.getPublHouse(), book.getPublYear(), book.getNumberOfPage(), book.getPrice());
        return newBook;
    }
}
