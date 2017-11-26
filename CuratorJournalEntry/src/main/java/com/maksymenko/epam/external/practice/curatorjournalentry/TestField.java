package com.maksymenko.epam.external.practice.curatorjournalentry;

import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Controller;
import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Inter;
import com.maksymenko.epam.external.practice.curatorjournalentry.model.Storage;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.IMenuStrings;

import java.nio.charset.Charset;
import java.util.Locale;

public class TestField implements IMenuStrings{
    public static void main(String[] args) {

//        Controller controller = new Controller();
//        controller.start();
        Locale enLocale = new Locale("en");
        Locale ruLocale = new Locale("ru");

        System.out.println(enLocale.getDisplayLanguage());
        System.out.println(ruLocale.getDisplayLanguage());

        Inter inter = new Inter();
//        Locale.setDefault(ruLocale);
        inter.changeLang(ruLocale);
        System.out.println(inter.getValue(MENU_EXIT));
        System.out.println(inter.getValue(MENU_JOURNAL));

//        Locale.setDefault(enLocale);
        inter.changeLang(enLocale);
        System.out.println(inter.getValue(MENU_JOURNAL));
        System.out.println(inter.getValue(MENU_EXIT));



//        System.out.println(Locale.getDefault());
//        Locale localeRu = new Locale("ja", "JP");
//        Locale.setDefault(localeRu);
//        System.out.println(Locale.TAIWAN.getDisplayCountry());
//        System.out.println("display language: "+localeRu.getDisplayLanguage());
//        System.out.println("display country: "+localeRu.getDisplayCountry());
//        System.out.println("display name: "+localeRu.getDisplayName());
//        System.out.println("display script: "+localeRu.getDisplayScript());
//
//        System.out.println(Charset.defaultCharset().toString());

    }
}
