package com.library.main;
//import com.library.dao.BookDAO;
//import com.library.model.Book;
//import com.library.dao.UserDAO;
//import com.library.model.User;
import com.library.util.DatabaseConnection;
import com.library.gui.DashboardFrame;

public class Main {

    public static void main(String[] args) {

        new DashboardFrame();
        DatabaseConnection.getConnection();

    }
}

