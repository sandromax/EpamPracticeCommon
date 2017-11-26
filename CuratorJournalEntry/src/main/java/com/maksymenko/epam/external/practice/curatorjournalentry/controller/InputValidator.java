package com.maksymenko.epam.external.practice.curatorjournalentry.controller;

import com.maksymenko.epam.external.practice.curatorjournalentry.view.IValidationResultStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator implements IValidationResultStrings{

    public static String lastNameRegExp = "^[A-Z][a-z]*$";

    public static String firstNameRegExp = "^[A-Z][a-z]*$";

    public static String birthDateRegExp = "^([0-2]?[0-9]|3[0-1]).(0[0-9]|1[0-2]).(19|20)\\d{2}$";

    public static String phoneRegExp = "^\\+\\d{2,3} ?\\(\\d{3}\\) ?(\\d ?\\d ?\\d ?\\d ?\\d ?\\d ?\\d)";

    public static String addressRegExpByTask = "^[A-Z][a-z]* (str|blvd|square|ave), \\d{1,3}, \\d{1,4}";
    //private static String getAddressRegExpUS = "^\\d{1,5}\\s[A-Z][a-z]*\\s(St|Blvd|Square|Ave)\\s[A-Z][a-z]*,\\s[A-Z]{2}\\s\\d{5},\\sUS";

    public static boolean isLastNameValid(String lastName){
        Pattern pattern = Pattern.compile(InputValidator.lastNameRegExp);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.find()){
            System.out.println(VALIDATION_LAST_NAME_OK);
            return true;
        } else {
            System.out.println(VALIDATION_LAST_NAME_ERROR);
            return false;
        }
    }

    public static boolean isFirstNameValid(String firstName){
        Pattern pattern = Pattern.compile(InputValidator.firstNameRegExp);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.find()){
            System.out.println(VALIDATION_FIRST_NAME_OK);
            return true;
        } else {
            System.out.println(VALIDATION_FIRST_NAME_ERROR);
            return false;
        }
    }

    public static boolean isBirthDateValid(String birthDate){
        Pattern pattern = Pattern.compile(InputValidator.birthDateRegExp);
        Matcher matcher = pattern.matcher(birthDate);

        if(matcher.find()){
            System.out.println(VALIDATION_BIRTH_DATE_OK);
            return true;
        } else {
            System.out.println(VALIDATION_BIRTH_DATE_ERROR);
            return false;
        }
    }

    public static boolean isPhoneValid(String phoneNumber){
        Pattern pattern = Pattern.compile(InputValidator.phoneRegExp);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.find()){
            System.out.println(VALIDATION_PHONE_OK);
            return true;
        } else {
            System.out.println(VALIDATION_PHONE_ERROR);
            return false;
        }
    }

    public static boolean isAdressValid(String address){
        Pattern pattern = Pattern.compile(InputValidator.addressRegExpByTask);
        Matcher matcher = pattern.matcher(address);

        if(matcher.find()){
            System.out.println(VALIDATION_ADDRESS_OK);
            return true;
        } else {
            System.out.println(VALIDATION_ADDRESS_ERROR);
            return false;
        }
    }
}
