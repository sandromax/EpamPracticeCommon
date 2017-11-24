package com.maksymenko.epam.external.practice.curatorjournalentry.view;

import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;
import static com.maksymenko.epam.external.practice.curatorjournalentry.view.ProgramStrings.*;
import java.util.List;

public class Menu {
    public static void greeting(){
        System.out.println(ProgramStrings.welcome);
    }

    public static void commands(){
        System.out.println(ProgramStrings.commands);
    }

    public static void inviteAddNewStudent(){
        System.out.println(inviteAddNewStudent);
        System.out.println(inviteLastName);
    }

    public static void inviteAddFirstName(){
        System.out.println(inviteFirstName);
    }

    public static void inviteAddBirthDate(){
        System.out.println(inviteBirthDate);
    }

    public static void inviteAddPhone(){
        System.out.println(invitePhone);
    }

    public static void inviteAddAddress(){
        System.out.println(inviteAddress);
    }

    public static void showJournal(List<Entry> journal){
        int i = 1;
        for(Entry entry : journal){
            System.out.println(i+". " + entry.getStudentLastName() + " " + entry.getStudentFirstName() + " " + entry.getStudentBirthDate() + " " + entry.getStudentPhone() + " " + entry.getStudentHomeAddress());
            i++;
        }
    }
}
