package com.maksymenko.epam.external.practice.task11db;

import com.maksymenko.epam.external.practice.task11db.model.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunCommon {
    public static void main(String[] args) {
        Connector connector = new Connector();
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
