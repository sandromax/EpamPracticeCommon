package com.maksymenko.epam.external.practice.booksmvc.controller;

import com.maksymenko.epam.external.practice.booksmvc.model.Book;
import org.apache.log4j.Logger;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Class writes objects to file
 *
 * @version 1.01 2017-12-07
 * @author Maksymenko Oleksandr
 */
public class FileWork {
    Logger logger = Logger.getLogger(FileWork.class);

    public boolean saveShelfToFile(Book[] shelf, String path) {
        try {
            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
                for (Book book : shelf) {
                    out.writeObject(book);
                }
                out.flush();

                return true;
            }
        } catch (IOException e) {
            logger.error("Can't save object. Wrong path");
            return false;
        }
    }

    public ArrayList<Book> readShelfFromFile(String path) {
        ArrayList<Book> list = new ArrayList<>();
        boolean control = true;
        int it = 0;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            while(control) {
                Book book = null;
                it++;

                try {
                    book = (Book) in.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    logger.error("Strange IOException");
//                    return list;            //  DANGEROUS WAY
                }

                if(book != null)
                    list.add(book);
                else
                    control = false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.error("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("IO Exception");
        }

        return list;
    }
}
