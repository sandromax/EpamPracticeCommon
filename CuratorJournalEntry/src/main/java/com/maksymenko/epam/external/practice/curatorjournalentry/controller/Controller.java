package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;
import com.maksymenko.epam.external.practice.curatorjournalentry.model.Storage;
import static com.maksymenko.epam.external.practice.curatorjournalentry.view.Menu.*;
import static com.maksymenko.epam.external.practice.curatorjournalentry.controller.InValidator.*;
import static com.maksymenko.epam.external.practice.curatorjournalentry.view.ProgramStrings.*;

import java.util.Scanner;

public class Controller {
    private Storage storage;
//    Menu menu;

    public Controller(Storage storage){
        this.storage = storage;
    }

    public void start(){

        greeting();
        commands();

        String command = "";
        Scanner scanner = new Scanner(System.in);
        command = scanner.next();

        while(!command.equals(MENU_EXIT)){
            if(command.equals(MENU_ADD)){
                toStorage(enteringData());
            } else if(command.equals(MENU_JOURNAL)){
                showJournal(storage.getJournal());
            } else if(command.equals(MENU_RU)){
                System.out.println(MENU_CHANGING_TO_RU);

            } else if(command.equals(MENU_EN)){
                System.out.println(MENU_CHANGING_TO_EN);
            }
            commands();
            command = scanner.next();
        }

    }

    private Entry enteringData(){
        Scanner enter = new Scanner(System.in);

        String lastNameIn;
        do{
            inviteAddNewStudent();
            lastNameIn = enter.next();
        }while (!isLastNameValid(lastNameIn));

        String firstNameIn;
        do{
            inviteAddFirstName();
            firstNameIn = enter.next();
        }while (!isFirstNameValid(firstNameIn));

        String birthDateIn;
        do{
            inviteAddBirthDate();
            birthDateIn = enter.next();
        }while (!isBirthDateValid(birthDateIn));

        String phoneIn;
        do{
            inviteAddPhone();
            phoneIn = enter.nextLine();
        }while (!isPhoneValid(phoneIn));

        String addressIn;
        do{
            inviteAddAddress();
            addressIn = enter.nextLine();
        }while (!isAdressValid(addressIn));

        return new Entry(lastNameIn, firstNameIn, birthDateIn, phoneIn, addressIn);

    }

    private void toStorage(Entry entry){
        storage.addNewEntry(entry);
    }
}
