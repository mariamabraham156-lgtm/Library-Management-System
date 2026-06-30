package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.library.util.DatabaseConnection;

public class LoginDAO {

    public boolean validateLogin(String username, String password) {

        String sql = "SELECT * FROM users_login WHERE username=? AND password=?";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}