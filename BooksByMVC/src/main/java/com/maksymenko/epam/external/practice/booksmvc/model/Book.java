package com.maksymenko.epam.external.practice.booksmvc.model;

import java.io.Serializable;

/**
 * Class describe book entity
 *
 * @version 1.01 2017-11-09
 * @author Maksymenko Oleksandr
 */
public class Book implements Serializable{
    private String bookName;
    private String author;
    private String publHouse;
    private int publYear;
    private int numberOfPage;
    private double price;

    public Book(){
        bookName = "";
        author = "";
        publHouse = "";
        publYear = 0;
        numberOfPage = 0;
        price = 0.0;
    }

    public Book(String bookName, String author, String publHouse, int publYear, int numberOfPage, double price) {
        this.bookName = bookName;
        this.author = author;
        this.publHouse = publHouse;
        this.publYear = publYear;
        this.numberOfPage = numberOfPage;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublHouse() {
        return publHouse;
    }

    public int getPublYear() {
        return publYear;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public double getPrice() {
        return price;
    }

}
