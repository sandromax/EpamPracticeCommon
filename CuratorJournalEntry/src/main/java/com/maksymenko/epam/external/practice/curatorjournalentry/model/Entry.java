package com.maksymenko.epam.external.practice.curatorjournalentry.model;

public class Entry {
    private String studentLastName = "";
    private String studentFirstName = "";
    private String studentBirthDate = "";
    private String studentPhone = "";
    private String studentHomeAddress = "";

    public Entry(String lastName, String firstName, String birthDste, String phone, String address){
        studentLastName = lastName;
        studentFirstName = firstName;
        studentBirthDate = birthDste;
        studentPhone = phone;
        studentHomeAddress = address;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentHomeAddress() {
        return studentHomeAddress;
    }



}
