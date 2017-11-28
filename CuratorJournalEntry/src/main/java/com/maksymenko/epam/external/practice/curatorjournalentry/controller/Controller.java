package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;
import com.maksymenko.epam.external.practice.curatorjournalentry.model.Storage;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.IMenuStrings;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.Menu;

import static com.maksymenko.epam.external.practice.curatorjournalentry.controller.Internationalization.RESOURCE;

import java.util.Locale;
import java.util.Scanner;

public class Controller implements IMenuStrings{

    public void start(){
        Locale.setDefault(new Locale("en", "GB"));

        Menu.greeting();
        Menu.commands();

        String command = "";
        Scanner scanner = new Scanner(System.in);
        command = scanner.next();

        while(!command.equals(RESOURCE.getValue(MENU_EXIT))){

            if(command.equals(RESOURCE.getValue(MENU_ADD))){
                toStorage(enteringData());
            } else if(command.equals(RESOURCE.getValue(MENU_JOURNAL))){

                Menu.showJournal(Storage.INSTANCE.getJournal());
            } else if(command.equals(RESOURCE.getValue(MENU_RU))){

                System.out.println(RESOURCE.getValue(MENU_CHANGING_TO_RU));
                Internationalization.RESOURCE.changeLang(new Locale("ru"));

            } else if(command.equals(RESOURCE.getValue(MENU_EN))){

                System.out.println(RESOURCE.getValue(MENU_CHANGING_TO_EN));
                Internationalization.RESOURCE.changeLang(new Locale("en"));
            } else if(command.equals(RESOURCE.getValue(MENU_FR))){

                System.out.println(RESOURCE.getValue(MENU_CHANGING_TO_FR));
                Internationalization.RESOURCE.changeLang(new Locale("fr"));
            } else if(command.equals(RESOURCE.getValue(MENU_UA))){

                System.out.println(RESOURCE.getValue(MENU_CHANGING_TO_UA));
                Internationalization.RESOURCE.changeLang(new Locale("uk"));
            }

            Menu.commands();
            command = scanner.next();
        }

    }

    private Entry enteringData(){
        Scanner enter = new Scanner(System.in);

        String lastNameIn;
        do{
            Menu.inviteAddNewStudent();
            lastNameIn = enter.next();
        }while (!InputValidator.isLastNameValid(lastNameIn));

        String firstNameIn;
        do{
            Menu.inviteAddFirstName();
            firstNameIn = enter.next();
        }while (!InputValidator.isFirstNameValid(firstNameIn));

        String birthDateIn;
        do{
            Menu.inviteAddBirthDate();
            birthDateIn = enter.next();
        }while (!InputValidator.isBirthDateValid(birthDateIn));

        String phoneIn;
        do{
            Menu.inviteAddPhone();
            phoneIn = enter.nextLine();
        }while (!InputValidator.isPhoneValid(phoneIn));

        String addressIn;
        do{
            Menu.inviteAddAddress();
            addressIn = enter.nextLine();
        }while (!InputValidator.isAdressValid(addressIn));

        return new Entry(lastNameIn, firstNameIn, birthDateIn, phoneIn, addressIn);
    }

    private void toStorage(Entry entry){
        Storage.INSTANCE.addNewEntry(entry);
    }
}
