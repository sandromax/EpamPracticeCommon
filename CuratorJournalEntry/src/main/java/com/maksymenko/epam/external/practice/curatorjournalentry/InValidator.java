package com.maksymenko.epam.external.practice.curatorjournalentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InValidator {

    //фамилия студента
    private static String lastNameRegExp = "^[A-Z][a-z]*$";
    //имя студента
    private static String firstNameRegExp = "^[A-z][a-z]*$";
    //дата рождения студента
    private static String birthDateRegExp = "^([0-2]?[0-9]|3[0-1]).(0[0-9]|1[0-2]).(19|20)\\d{2}$";
    //телефон студента
    private static String phoneRegExp = "^\\+\\d{2,3} ?\\(\\d{3}\\) ?(\\d ?\\d ?\\d ?\\d ?\\d ?\\d ?\\d)";
    //адрес студента (улица, дом, квартира)
    private static String addressRegExpByTask = "^[A-Z][a-z]* (str|blvd|square|ave), \\d{1,3}, \\d{1,4}";
    //private static String getAddressRegExpUS = "^\\d{1,5}\\s[A-Z][a-z]*\\s(St|Blvd|Square|Ave)\\s[A-Z][a-z]*,\\s[A-Z]{2}\\s\\d{5},\\sUS";

    public static boolean isLastNameValid(String lastName){
        Pattern pattern = Pattern.compile(InValidator.lastNameRegExp);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.find()){
            System.out.println("Last name is OK");
            return true;
        } else {
            System.out.println("Error! Recheck last name");
            return false;
        }
    }

    public static boolean isFirstNameValid(String firstName){
        Pattern pattern = Pattern.compile(InValidator.firstNameRegExp);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.find()){
            System.out.println("First name is OK");
            return true;
        } else {
            System.out.println("Error! Recheck first name");
            return false;
        }
    }

    public static boolean isBirthDateValid(String birthDate){
        Pattern pattern = Pattern.compile(InValidator.birthDateRegExp);
        Matcher matcher = pattern.matcher(birthDate);

        if(matcher.find()){
            System.out.println("Birth date is OK");
            return true;
        } else {
            System.out.println("Error! Recheck Birth date");
            return false;
        }
    }

    public static boolean isPhoneValid(String phoneNumber){
        Pattern pattern = Pattern.compile(InValidator.phoneRegExp);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.find()){
            System.out.println("phone number is OK");
            return true;
        } else {
            System.out.println("Error! Recheck phone number");
            return false;
        }
    }

    public static boolean isAdressValid(String address){
        Pattern pattern = Pattern.compile(InValidator.addressRegExpByTask);
        Matcher matcher = pattern.matcher(address);

        if(matcher.find()){
            System.out.println("address is OK");
            return true;
        } else {
            System.out.println("Error! Recheck address");
            return false;
        }
    }
}
