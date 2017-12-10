package com.maksymenko.epam.external.practice.booksmvc.model;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Class represents all associated with the model component
 *
 * @version 2.01 2017-12-22
 * @author Maksymenko Oleksandr
 */
public class Model {
    Book[] shelf;
    Logger logger = Logger.getLogger(Model.class);

    public Model(int booksQuantity){
        ShelfGeneratorEn shelfGeneratorEn = new ShelfGeneratorEn();
        shelf = shelfGeneratorEn.createShelf(booksQuantity);
        logger.info("Shelf was filled");
    }

    public Book[] getShelf(){
        return shelf;
    }

    public void setShelf(Book[] shelf) {
        this.shelf = shelf;
    }

    /**
     * Method finds books by author in shelf
     *
     * @param authorNeeded string contains author name
     * @return Book[]  author's books
     */
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

    /**
     * Method finds books by publishing house
     *
     * @param publishingNeeded string contains name of publishing house
     * @return Book[] publishing's books
     */
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

    /**
     * Method finds books that were printed later that year
     *
     * @param fromYear boundary year
     * @return Book[]
     */
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

    /**
     * Method sorts shelf by publishing house name
     *
     * @return Book[]
     */
    public Book[] sortBooksByPublishing(){
        Arrays.sort(shelf, new BooksSortByPublishingHouseComparator());
        return shelf;
    }

    /**
     * Method clons Book object
     *
     * @param book object to be cloned
     * @return
     */
    public static Book cloneBook(Book book){
        Book newBook = new Book(book.getBookName(), book.getAuthor(), book.getPublHouse(), book.getPublYear(), book.getNumberOfPage(), book.getPrice());
        return newBook;
    }
}
