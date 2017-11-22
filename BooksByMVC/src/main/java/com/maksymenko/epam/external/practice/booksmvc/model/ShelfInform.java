package com.maksymenko.epam.external.practice.booksmvc.model;

import java.util.Arrays;

public class ShelfInform {

//    Book[] shelf;

    public ShelfInform(Book[] innerShelf, Book[] shelf){
        shelf = new Book[innerShelf.length];
        int iterator = 0;
        for(Book innerBooks : innerShelf){
            shelf[iterator] = innerBooks;
            iterator++;
        }
    }

    public static Book[] findBooksByAuthor(String authorNeeded, Book[] shelf){
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

    public static Book[] findBooksByPublishing(String publishingNeeded, Book[] shelf){
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

    public static Book[] getLaterBooks(int fromYear, Book[] shelf){
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

    public static Book[] sortBooksByPublishing(Book[] shelf){
        Arrays.sort(shelf, new BooksSortByPublishingHouseComparator());
        return shelf;
    }

    public static Book cloneBook(Book book){
        Book newBook = new Book(book.getBookName(), book.getAuthor(), book.getPublHouse(), book.getPublYear(), book.getNumberOfPage(), book.getPrice());
        return newBook;
    }
}
