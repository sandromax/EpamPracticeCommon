package com.maksymenko.epam.external.practice.booksmvc.model;

import java.util.Random;

public class ShelfGeneratorRu {

    private String[] bookNames = {"Нова экспресс", "Аллея Торнадо", "Серебрянная ложка", "Цветок в пустыне", "Фриленды", "На Форсайтской Бирже", "Вилла Рубейн", "Изюминка"};
    private String[] authors = {"Барбюс Анри", "Берроуз Вильям", "Берроуз Эдгар Райс", "Борхес Хорхе Луис", "Буковски Чарльз", "Дю Гар Роже Мартен", "Голдсмит Оливер", "Голсуорси Джон", "Диккенс Чарльз"};
    private String[] publishingHouses = {"Pearson", "McGraw-Hill Education", "Oxford University Press", "Prentice Hall", "Cambridge University Press"};
    private int[] years = {1898, 1903, 1914, 1980, 1989, 1991,};
    private int[] pagesArray = {30, 50, 120, 300, 500, 988};
    private double[] prices = {5.0, 15.5, 60.3, 500.0, 700.0};

    public Book[] createShelf(int quantity){
        Book[] shelf = new Book[quantity];
        Random random = new Random();

        String bookName, author, publishingHouse;
        int year, pages;
        double price;

        for(int i = 0; i < quantity; i++){
            bookName = bookNames[random.nextInt(bookNames.length - 1)];
            author = authors[random.nextInt(authors.length - 1)];
            publishingHouse = publishingHouses[random.nextInt(publishingHouses.length - 1)];
            year = years[random.nextInt(years.length - 1)];
            pages = pagesArray[random.nextInt(pagesArray.length - 1)];
            price = prices[random.nextInt(prices.length - 1)];

            shelf[i] = new Book(bookName, author, publishingHouse, year, pages, price);
        }

        return shelf;
    }
}
