package com.maksymenko.epam.external.practice.curatorjournalentry;

import com.maksymenko.epam.external.practice.curatorjournalentry.controller.Controller;
import com.maksymenko.epam.external.practice.curatorjournalentry.view.IMenuStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.maksymenko.epam.external.practice.curatorjournalentry.controller.Internationalization.RESOURCE;

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
//
//        String ready = "([0][1-9]|[12][0-9]|3[0-1]).(0[1-9]|1[0-2]).(19|20)\\d{2}";
//        String ready2 = "([0-9]{2}).([0-9]{2}).([0-9]{4})";
//        String test = "^\\([0-9]{3}\\)[0-9]{7}$";
//        Pattern pattern = Pattern.compile(test);
//        Matcher matcher = pattern.matcher("(567)6786767");
//
//        if(matcher.find()) {
//            System.out.println("ЕСТЬ!");
//        } else
//            System.out.println("neku");

    }
}
