package com.maksymenko.epam.external.practice.curatorjournalentry.view;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;

import java.util.List;

public class Menu {
    public static void greeting(){
        System.out.println("            Welcome to Curator Journal");
    }

    public static void commands(){
        System.out.println("    Commands:");
        System.out.println("add - to add new student");
        System.out.println("journal - to show all notes from journal");
        System.out.println("ru - to russian interface");
        System.out.println("eng - to english interface");
        System.out.println("exit - to close program");
        System.out.println(">");
    }

    public static void invitation(){
        System.out.println("Please, enter the command");
    }

    public static void showJournal(List<Entry> journal){
        int i = 1;
        for(Entry entry : journal){
            System.out.println(i+". " + entry.getStudentLastName() + " " + entry.getStudentFirstName() + " " + entry.getStudentBirthDate() + " " + entry.getStudentPhone() + " " + entry.getStudentHomeAddress());
            i++;
        }
    }
}
