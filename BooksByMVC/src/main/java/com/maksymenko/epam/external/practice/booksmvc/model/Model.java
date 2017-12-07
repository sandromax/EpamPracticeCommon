package com.maksymenko.epam.external.practice.booksmvc.model;

import java.util.Arrays;

public class Model {

    Book[] shelf;

    public Model(int booksQuantity){
        ShelfGeneratorEn shelfGeneratorEn = new ShelfGeneratorEn();
        shelf = shelfGeneratorEn.createShelf(booksQuantity);
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
