package com.maksymenko.epam.external.practice.curatorjournalentry.view;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;

import java.util.List;

public class Menu {
    public static void greeting(){
        System.out.println(ProgramStrings.welcome);
    }

    public static void commands(){
        System.out.println(ProgramStrings.commands);
    }

    public static void inviteAddNewStudent(){
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
