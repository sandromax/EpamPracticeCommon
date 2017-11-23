package com.maksymenko.epam.external.practice.curatorjournalentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestField {
    public static void main(String[] args) {
        String str = "Liolo";
        InValidator.isLastNameValid(str);
        InValidator.isFirstNameValid(str);
        InValidator.isBirthDateValid("33.11.2095");

    }
}
