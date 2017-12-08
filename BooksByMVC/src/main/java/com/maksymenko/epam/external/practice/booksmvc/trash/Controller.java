package com.maksymenko.epam.external.practice.booksmvc.trash;

import com.maksymenko.epam.external.practice.booksmvc.model.Book;
import com.maksymenko.epam.external.practice.booksmvc.model.Model;

public class Controller {

    public Model InitModel(){
        Model model = new Model(30);
        return model;
    }

    public Book[] findBooksByAuthorCtrl(Model model, String author){
        return model.findBooksByAuthor(author);
    }

    public Book[] findBooksByPublCtrl(Model model, String publ){
        return model.findBooksByPublishing(publ);
    }

    public Book[] findLaterBooksCtrl(Model model, int year){
        return model.findLaterBooks(year);
    }

    public Book[] sortBooksByPublCtrl(Model model){
        return model.sortBooksByPublishing();
    }
}
