package com.maksymenko.epam.external.practice.booksmvc;

import com.maksymenko.epam.external.practice.booksmvc.controller.Controller;
import com.maksymenko.epam.external.practice.booksmvc.model.Model;
import com.maksymenko.epam.external.practice.booksmvc.view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model(40);
        Controller controller = new Controller();
        View view = new View(model, controller);

        view.start();
    }
}
