package com.maksymenko.epam.external.practice.curatorjournalentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestField {
    public static void main(String[] args) {
        String str = "Liolo";
        InValidator.isLastNameValid(str);
        InValidator.isFirstNameValid(str);
        InValidator.isBirthDateValid("31.11.2095");
        InValidator.isPhoneValid("+38 (098) 5 67 870 5");
        InValidator.isAdressValid("Chkalova str, 123, 2348967");

    }
}
