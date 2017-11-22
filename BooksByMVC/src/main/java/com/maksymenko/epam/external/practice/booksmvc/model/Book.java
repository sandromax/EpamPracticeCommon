package com.maksymenko.epam.external.practice.booksmvc.model;

public class Book {
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

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublHouse() {
        return publHouse;
    }

    public void setPublHouse(String publHouse) {
        this.publHouse = publHouse;
    }

    public int getPublYear() {
        return publYear;
    }

    public void setPublYear(int publYear) {
        this.publYear = publYear;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
