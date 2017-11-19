package com.maksymenko.epam.external.practice.task2.compute;

import java.util.Comparator;

public class BooksSortByPublishingHouseComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookFirst, Book bookSecond){
        return bookFirst.getPublHouse().compareTo(bookSecond.getPublHouse());
    }
}
