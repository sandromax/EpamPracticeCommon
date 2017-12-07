package com.maksymenko.epam.external.practice.booksmvc.services;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Class writes objects to file
 *
 * @version 1.01 2017-12-01
 * @author Maksymenko Oleksandr
 */
public class WriteFile {
    /**
     * Method write object to file by path
     *
     * @param object    object to record
     * @param path      string with path
     *
     * @return          return true if the object was successfully recorded
     */
    public static boolean write(Object object, String path) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))){
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method write array of objects to file by path
     *
     * @param objects   array of objects to record
     * @param path      string with path
     *
     * @return          return true if the object was successfully recorded
     */
    public static boolean write(Object[] objects, String path) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))){
            for(Object obj : objects) {
                objectOutputStream.writeObject(obj);
            }
            objectOutputStream.flush();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method record object to file the path to which was specified
     *
     * @param object    object to record
     * @param pathDir   path to directory
     * @param fileName  name of file
     * @return          return true if the object was successfully recorded
     */
    public static boolean writeTo(Object object, Path pathDir, Path fileName) {
        if(Files.exists(fileName)) {
            System.out.println("Error! File already exist");
            return false;
        } else {
            if (Files.exists(pathDir)) {
                try (ObjectOutputStream objOut = new ObjectOutputStream((new FileOutputStream(fileName.toString())))) {
                    objOut.writeObject(object);
                    objOut.flush();
                    return true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Error! Wrong path to directory");
                return false;
            }
        }
        return false;
    }

}
