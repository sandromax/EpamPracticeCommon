package com.maksymenko.epam.external.practice.task2.compute;

import java.util.Arrays;

public class ShelfInformator {

    Book[] shelf;

    public ShelfInformator(Book[] innerShelf){
        shelf = new Book[innerShelf.length];
        int iterator = 0;
        for(Book innerBooks : innerShelf){
            shelf[iterator] = innerBooks;
            iterator++;
        }
    }

    public Book[] getBooksOfAuthor(String authorNeeded){
        Book[] result = new Book[shelf.length];
        int iterator = 0;

        for(Book book : shelf){
            if(book.getAuthor().equals(authorNeeded)){
                result[iterator] = createSameBook(book);
                iterator++;
            }
        }

        return  result;
    }

    public Book[] getBooksOfPublishing(String publishingNeeded){
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

    public Book[] getLaterBooks(int fromYear){
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

    public Book[] sortBooksByPublishing(){
        Arrays.sort(shelf, new BooksSortByPublishingHouseComparator());
        return shelf;
    }

    public Book createSameBook(Book book){
        Book newBook = new Book(book.getBookName(), book.getAuthor(), book.getPublHouse(), book.getPublYear(), book.getNumberOfPage(), book.getPrice());
        return newBook;
    }
}
