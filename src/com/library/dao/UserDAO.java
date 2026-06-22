package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.model.User;
import com.library.util.DatabaseConnection;


public class UserDAO {

    public boolean addUser(User user){

        String sql = "INSERT INTO users(user_id, name, email, phoneno) VALUES(?, ?, ?, ?)";

        try{

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, user.getuserId());
            pstmt.setString(2, user.getname());
            pstmt.setString(3,user.getemail());
            pstmt.setString(4, user.getphoneno());

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch(Exception e){

            e.printStackTrace();
            return false;

        }
    }
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        String sql = "SELECT* FROM users";

        try{
            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){

                User user = new User();

                user.setuserId(rs.getInt("user_id"));
                user.setname(rs.getString("name"));
                user.setemail(rs.getString("email"));
                user.setphoneno(rs.getString("phoneno"));

                users.add(user);

            }
        }catch(Exception e){ 
            e.printStackTrace();
        }

        return users;
    }

    public User getUserbyId(int userId) {

        String sql = "SELECT * FROM users WHERE user_id = ?";

        try{

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1,userId );

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                User user = new User();

                user.setuserId(rs.getInt("user_id"));
                user.setname(rs.getString("name"));
                user.setemail(rs.getString("email"));
                user.setphoneno(rs.getString("phoneno"));

                return user;
                }

            } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    } 
    
    public boolean updateUser(User user){

        String sql = "UPDATE users SET name=?, email=?, phoneno=?, WHERE user_id=?";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, user.getname());
            pstmt.setString(2,user.getemail());
            pstmt.setString(3, user.getphoneno());
            pstmt.setInt(4, user.getuserId());

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        }catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUser(int userId){

        String sql = "DELETE FROM users WHERE user_id = ?";
        
        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, userId);

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
    
}




