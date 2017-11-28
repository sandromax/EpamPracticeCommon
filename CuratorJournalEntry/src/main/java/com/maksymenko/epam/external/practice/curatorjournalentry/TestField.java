package com.maksymenko.epam.external.practice.curatorjournalentry;

import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Controller;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.IMenuStrings;

public class TestField implements IMenuStrings{
    public static void main(String[] args) {

//        Locale enLocale = new Locale("en");
//        Locale ruLocale = new Locale("ru");
//
//        Internationalization.RESOURCE.changeLang(ruLocale);

        Controller controller = new Controller();
        controller.start();

//        System.out.println(enLocale.getDisplayLanguage());
//        System.out.println(ruLocale.getDisplayLanguage());
////
////        Internationalization inter = new Internationalization();
////        Locale.setDefault(ruLocale);
//        Internationalization.RESOURCE.changeLang(ruLocale);
//        System.out.println(Internationalization.RESOURCE.getValue(MENU_EXIT));
//        System.out.println(Internationalization.RESOURCE.getValue(MENU_JOURNAL));
//
////        Locale.setDefault(enLocale);
//        Internationalization.RESOURCE.changeLang(enLocale);
//        System.out.println(Internationalization.RESOURCE.getValue(MENU_JOURNAL));
//        System.out.println(Internationalization.RESOURCE.getValue(MENU_EXIT));



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
