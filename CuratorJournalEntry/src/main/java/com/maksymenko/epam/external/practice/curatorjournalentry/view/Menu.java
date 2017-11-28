package com.maksymenko.epam.external.practice.curatorjournalentry.view;

import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Internationalization;
import com.maksymenko.epam.external.practice.curatorjournalentry.model.Entry;
import java.util.List;

public class Menu implements IInviteStrings{
    public static void greeting(){
        System.out.println(Internationalization.RESOURCE.getValue(WELCOME));
    }

    public static void commands(){
        System.out.println(Internationalization.RESOURCE.getValue(COMMANDS));
    }

    public static void inviteAddNewStudent(){
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_NEW_STUDENT));
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_LAST_NAME));
    }

    public static void inviteAddFirstName(){
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_FIRST_NAME));
    }

    public static void inviteAddBirthDate(){
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_BIRTH_DATE));
    }

    public static void inviteAddPhone(){
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_PHONE));
    }

    public static void inviteAddAddress(){
        System.out.println(Internationalization.RESOURCE.getValue(INVITE_ADD_ADDRESS));
    }

    public static void showJournal(List<Entry> journal){
        int i = 1;
        for(Entry entry : journal){
            System.out.println(i+". " + entry.getStudentLastName() + " " + entry.getStudentFirstName() + " " + entry.getStudentBirthDate() + " " + entry.getStudentPhone() + " " + entry.getStudentHomeAddress());
            i++;
        }
        System.out.println();
    }
}
