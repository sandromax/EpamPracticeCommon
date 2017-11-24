package com.maksymenko.epam.external.practice.curatorjournalentry;

import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Controller;
import com.maksymenko.epam.external.practice.curatorjournalentry.controller.InValidator;
import com.maksymenko.epam.external.practice.curatorjournalentry.model.Storage;

public class TestField {
    public static void main(String[] args) {

        Storage storage = new Storage();
        Controller controller = new Controller(storage);
        controller.start();

    }
}
