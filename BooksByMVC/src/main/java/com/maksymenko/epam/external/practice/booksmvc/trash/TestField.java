package com.maksymenko.epam.external.practice.booksmvc.trash;

import com.maksymenko.epam.external.practice.booksmvc.controller.FileWork;
import com.maksymenko.epam.external.practice.booksmvc.model.Book;
import com.maksymenko.epam.external.practice.booksmvc.model.Model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestField {
    public static void main(String[] args) {


        //1
//        try (FileWriter fileWriter = new FileWriter("some.txt")){
//            fileWriter.write("first notation");
//            fileWriter.append("\nsecond notation");
//
//            fileWriter.flush();
//            fileWriter.close();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
//                Book book = new Book();
//                objectOutputStream.writeObject(book);
//                objectOutputStream.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//         File file = new File("/sd/data.ser");
//            //2
//        try {
//            Path pathTrue = Paths.get("src", "main/resources");
//
//            System.out.println("is exist: " + Files.exists(pathTrue));
//            System.out.println("owner: " + Files.getOwner(pathTrue));
//            System.out.println("abs: " + pathTrue.toAbsolutePath());
//
//            Path pathCreateFile = Paths.get("src", "main/resources", "some2.t");
//            Path pathCreateDir = Paths.get("src", "main/resources", "dir");
////            FileAttribute<String> attr = FileAttribute.name
//            Files.createFile(pathCreateFile);
//            Files.createDirectory(pathCreateDir);
//
//            Path pathFalse = Paths.get("src", "main", "java", "abr", "wer");
//
//            System.out.println("toString(): " + pathFalse.toString());
//            System.out.println("Parent: " + pathFalse.getParent());
//            System.out.println("Parent: " + pathTrue.getFileSystem());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //3
//                File("/src/main/java/com/maksymenko/epam/external/practice/booksmvc/files/objects.ser");
    //4
//        System.out.println("is \'some.ser\' exists - " + Files.exists(Paths.get("some.ser")));

//        List<Book> listBook = new LinkedList<>();

//        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("some.ser"))) {
////            while() {
//                Book b = (Book) in.readObject();
//                listBook.add(b);
//
////            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        5 (Worked)
//        FileWork fw = new FileWork();
//
//        fw.saveShelfToFile(new Model(4).getShelf(), "some.ser");
//
//        listBook = fw.readShelfFromFile("some.ser");
//
//        System.out.println("listBook size: " + listBook.size());
//        for(Book b : listBook) {
//            System.out.println(b.getAuthor()+" "+b.getBookName()+" "+b.getPublHouse()+" "+b.getPublYear());
//        }
//
//        System.out.println(Files.exists(Paths.get("/home/san/projects/EpamPracticeCommon/BooksByMVC/some.ser")));
    }
}