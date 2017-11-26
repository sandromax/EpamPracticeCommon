package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.ResourceBundle;

public class Inter {

    private ResourceBundle resourceBundle;
    private String resourceName = "MenuStrings";

    public Inter() {

    }

    public void changeLang(Locale newLoc){
        resourceBundle = ResourceBundle.getBundle(resourceName, newLoc);
    }

    public String getValue(String key) {
        try {
            return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }


}
