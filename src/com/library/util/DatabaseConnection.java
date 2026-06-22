package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/librarydb";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "1234";

    public static Connection getConnection() {

        try {

            Connection conn =
                    DriverManager.getConnection(
                            URL,
                            USERNAME,
                            PASSWORD);

            System.out.println("Database Connected Successfully");

            return conn;

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}
